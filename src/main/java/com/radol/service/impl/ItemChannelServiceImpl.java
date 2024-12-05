package com.radol.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.radol.dto.ItemChannelDTO;
import com.radol.mapper.ItemChannelMapper;
import com.radol.model.ItemChannel;
import com.radol.repository.ItemChannelRepository;
import com.radol.service.ItemChannelService;

@Service
public class ItemChannelServiceImpl implements ItemChannelService {
    @Autowired
    private final ItemChannelRepository itemChannelRepository;
    private final ItemChannelMapper itemChannelMapper;

    public ItemChannelServiceImpl(ItemChannelRepository itemChannelRepository, ItemChannelMapper itemChannelMapper) {
        this.itemChannelRepository = itemChannelRepository;
        this.itemChannelMapper = itemChannelMapper;
    }

    @Override
    public ItemChannelDTO save(ItemChannelDTO dto) {
        ItemChannel itemChannel = itemChannelMapper.toEntity(dto);
        return itemChannelMapper.toDTO(itemChannelRepository.save(itemChannel));
    }

    @Override
    public ItemChannelDTO findById(Integer id) {
        return itemChannelRepository.findById(id)
                .map(itemChannelMapper::toDTO)
                .orElseThrow(() -> new RuntimeException("ItemChannel not found"));
    }

    @Override
    public List<ItemChannelDTO> findAll() {
        return itemChannelRepository.findAll().stream()
                .map(itemChannelMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ItemChannelDTO update(Integer id, ItemChannelDTO dto) {
        ItemChannel itemChannel = itemChannelMapper.toEntity(dto);
        itemChannel.setItemChannelId(id);
        return itemChannelMapper.toDTO(itemChannelRepository.save(itemChannel));
    }

    @Override
    public void deleteById(Integer id) {
        itemChannelRepository.deleteById(id);
    }
}
