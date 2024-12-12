package com.radol.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.radol.dto.ItemUOMDTO;
import com.radol.mapper.ItemUOMMapper;
import com.radol.model.ItemUOM;
import com.radol.repository.ItemUOMRepository;
import com.radol.service.ItemUOMService;

@Service
public class ItemUOMServiceImpl implements ItemUOMService {
    @Autowired
    private final ItemUOMRepository itemUOMRepository;
    private final ItemUOMMapper itemUOMMapper;

    public ItemUOMServiceImpl(ItemUOMRepository itemUOMRepository, ItemUOMMapper itemUOMMapper) {
        this.itemUOMRepository = itemUOMRepository;
        this.itemUOMMapper = itemUOMMapper;
    }

    @Override
    public ItemUOMDTO save(ItemUOMDTO dto) {
        ItemUOM itemUOM = itemUOMMapper.toEntity(dto);
        return itemUOMMapper.toDTO(itemUOMRepository.save(itemUOM));
    }

    @Override
    public ItemUOMDTO findById(Integer id) {
        return itemUOMRepository.findById(id)
                .map(itemUOMMapper::toDTO)
                .orElseThrow(() -> new RuntimeException("ItemUOM not found"));
    }

    @Override
    public List<ItemUOMDTO> findAll() {
        return itemUOMRepository.findAll().stream()
                .map(itemUOMMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ItemUOMDTO update(Integer id, ItemUOMDTO dto) {
        ItemUOM itemUOM = itemUOMMapper.toEntity(dto);
        itemUOM.setItemUomId(id);
        return itemUOMMapper.toDTO(itemUOMRepository.save(itemUOM));
    }

    @Override
    public void deleteById(Integer id) {
        itemUOMRepository.deleteById(id);
    }
}