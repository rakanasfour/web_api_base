package com.radol.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.radol.dto.ChannelDTO;
import com.radol.dto.request.ChannelRequestDTO;
import com.radol.mapper.ChannelMapper;
import com.radol.model.Channel;
import com.radol.repository.ChannelRepository;
import com.radol.service.ChannelService;

@Service
public class ChannelServiceImpl implements ChannelService {
    @Autowired
    private final ChannelRepository channelRepository;
    private final ChannelMapper channelMapper;

    public ChannelServiceImpl(ChannelRepository channelRepository, ChannelMapper channelMapper) {
        this.channelRepository = channelRepository;
        this.channelMapper = channelMapper;
    }

    @Override
    public ChannelDTO save(ChannelDTO dto) {
        Channel channel = channelMapper.toEntity(dto);
        return channelMapper.toDTO(channelRepository.save(channel));
    }

    @Override
    public ChannelDTO findById(Integer id) {
        return channelRepository.findById(id)
                .map(channelMapper::toDTO)
                .orElseThrow(() -> new RuntimeException("Channel not found"));
    }

    @Override
    public List<ChannelDTO> findAll() {
        return channelRepository.findAll().stream()
                .map(channelMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ChannelDTO update(Integer id, ChannelDTO dto) {
        Channel channel = channelMapper.toEntity(dto);
        channel.setChannelId(id);
        return channelMapper.toDTO(channelRepository.save(channel));
    }

    @Override
    public void deleteById(Integer id) {
        channelRepository.deleteById(id);
    }
    
    @Override
    public ChannelDTO updateChannel(Integer id, ChannelRequestDTO dto) {
        Channel channelEntity = new Channel();
        channelEntity.setChannelId(id);
        channelEntity.setChannelDescription(dto.getChannelDescription());
        channelEntity.setChannelsLevel(dto.getChannelsLevel());
        channelEntity.setChannelDefaultUom(dto.getChannelDefaultUom());
        return channelMapper.toDTO(channelRepository.save(channelEntity));
    }
}
