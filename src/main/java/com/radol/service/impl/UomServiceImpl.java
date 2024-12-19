package com.radol.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.radol.dto.UomDTO;
import com.radol.mapper.ChannelMapper;
import com.radol.mapper.UomMapper;
import com.radol.model.Channel;
import com.radol.model.Item;
import com.radol.model.Uom;
import com.radol.model.UomChannel;
import com.radol.repository.ChannelRepository;
import com.radol.repository.UomChannelRepository;
import com.radol.repository.UomRepository;
import com.radol.service.UomService;

@Service
public class UomServiceImpl implements UomService {
    @Autowired
    private final UomRepository uomRepository;
    private final UomMapper uomMapper;
    private final ChannelMapper channelMapper;
    private final ChannelRepository channelRepository;
    private final UomChannelRepository uomChannelRepository;

    public UomServiceImpl(UomRepository uomRepository, UomMapper uomMapper, ChannelMapper channelMapper, ChannelRepository channelRepository,  UomChannelRepository uomChannelRepository) {
        this.uomRepository = uomRepository;
        this.uomMapper = uomMapper;
        this.channelMapper=channelMapper;
        this.channelRepository=channelRepository;
        this.uomChannelRepository=uomChannelRepository;
    }

    @Override
    public UomDTO save(UomDTO dto) {
        Uom uom = uomMapper.toEntity(dto);
        
     // Process channels and create ItemChannel entries
        if (dto.getUomChannels() != null && !dto.getUomChannels().isEmpty()) {
            List<UomChannel> uomChannels = dto.getUomChannels().stream().map(channelDto -> {
                Channel channel = channelRepository.findById(channelDto.getChannelId())
                        .orElseThrow(() -> new RuntimeException("Channel not found"));
                UomChannel uomChannel = new UomChannel();
                uomChannel.setMappedUomChannel(uom);
                uomChannel.setMappedChannel(channel);
                return uomChannel;
            }).collect(Collectors.toList());
            uom.setUomChannels(uomChannels);
        }

        Uom savedUom = uomRepository.save(uom);
   
        
        return uomMapper.toDTO(savedUom);
    }

    @Override
    public UomDTO findById(Integer id) {
        return uomRepository.findById(id)
                .map(uomMapper::toDTO)
                .orElseThrow(() -> new RuntimeException("Uom not found"));
    }

    @Override
    public List<UomDTO> findAll() {
        return uomRepository.findAll().stream()
                .map(uomMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public UomDTO update(Integer id, UomDTO dto) {
        Uom uom = uomMapper.toEntity(dto);
        uom.setUomId(id);
        return uomMapper.toDTO(uomRepository.save(uom));
    }

    @Override
    public void deleteById(Integer id) {
        uomRepository.deleteById(id);
    }
}
