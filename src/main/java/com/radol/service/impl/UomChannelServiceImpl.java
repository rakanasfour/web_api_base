package com.radol.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.radol.dto.UomChannelDTO;
import com.radol.mapper.UomChannelMapper;
import com.radol.model.UomChannel;
import com.radol.repository.UomChannelRepository;
import com.radol.service.UomChannelService;



@Service
public class UomChannelServiceImpl implements UomChannelService {
    @Autowired
    private final UomChannelRepository uomChannelRepository;
    private final UomChannelMapper uomChannelMapper;

    public UomChannelServiceImpl(UomChannelRepository uomChannelRepository, UomChannelMapper uomChannelMapper) {
        this.uomChannelRepository = uomChannelRepository;
        this.uomChannelMapper = uomChannelMapper;
    }

    @Override
    public UomChannelDTO save(UomChannelDTO dto) {
        UomChannel uomChannel = uomChannelMapper.toEntity(dto);
        return uomChannelMapper.toDTO(uomChannelRepository.save(uomChannel));
    }

    @Override
    public UomChannelDTO findById(Integer id) {
        return uomChannelRepository.findById(id)
                .map(uomChannelMapper::toDTO)
                .orElseThrow(() -> new RuntimeException("ItemChannel not found"));
    }

    @Override
    public List<UomChannelDTO> findAll() {
        return uomChannelRepository.findAll().stream()
                .map(uomChannelMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public UomChannelDTO update(Integer id, UomChannelDTO dto) {
        UomChannel uomChannel = uomChannelMapper.toEntity(dto);
        uomChannel.setUomChannelId(id);
        return uomChannelMapper.toDTO(uomChannelRepository.save(uomChannel));
    }

    @Override
    public void deleteById(Integer id) {
    	uomChannelRepository.deleteById(id);
    }
}
