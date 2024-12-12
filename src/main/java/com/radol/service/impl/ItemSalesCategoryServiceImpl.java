package com.radol.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.radol.dto.ItemSalesCategoryDTO;
import com.radol.mapper.ItemSalesCategoryMapper;
import com.radol.model.ItemSalesCategory;
import com.radol.repository.ItemSalesCategoryRepository;
import com.radol.service.ItemSalesCategoryService;

@Service
public class ItemSalesCategoryServiceImpl implements ItemSalesCategoryService {
	
	
    @Autowired
    private final ItemSalesCategoryRepository itemSalesCategoryRepository;
    private final ItemSalesCategoryMapper itemSalesCategoryMapper;

    public ItemSalesCategoryServiceImpl(ItemSalesCategoryRepository itemSalesCategoryRepository, ItemSalesCategoryMapper itemSalesCategoryMapper) {
        this.itemSalesCategoryRepository = itemSalesCategoryRepository;
        this.itemSalesCategoryMapper = itemSalesCategoryMapper;
    }

    @Override
    public ItemSalesCategoryDTO save(ItemSalesCategoryDTO dto) {
        ItemSalesCategory itemSalesCategory = itemSalesCategoryMapper.toEntity(dto);
        return itemSalesCategoryMapper.toDTO(itemSalesCategoryRepository.save(itemSalesCategory));
    }

    @Override
    public ItemSalesCategoryDTO findById(Integer id) {
        return itemSalesCategoryRepository.findById(id)
                .map(itemSalesCategoryMapper::toDTO)
                .orElseThrow(() -> new RuntimeException("ItemSalesCategory not found"));
    }

    @Override
    public List<ItemSalesCategoryDTO> findAll() {
        return itemSalesCategoryRepository.findAll().stream()
                .map(itemSalesCategoryMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ItemSalesCategoryDTO update(Integer id, ItemSalesCategoryDTO dto) {
        ItemSalesCategory itemSalesCategory = itemSalesCategoryMapper.toEntity(dto);
        itemSalesCategory.setItemSalesCategoryId(id);
        return itemSalesCategoryMapper.toDTO(itemSalesCategoryRepository.save(itemSalesCategory));
    }
    
    @Override
    public void deleteById(Integer id) {
        itemSalesCategoryRepository.deleteById(id);
    }



   
}
