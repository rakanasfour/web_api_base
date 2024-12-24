package com.radol.service.impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.radol.dto.ItemDTO;
import com.radol.dto.ManufacturerPricingDTO;
import com.radol.dto.UomDTO;
import com.radol.mapper.ItemMapper;
import com.radol.repository.ItemRepository;

@Service
public class WholeSaleServiceImpl {
	
	
    @Autowired
    private final ItemRepository itemRepository;
    private final ItemMapper itemMapper;

    
    
    public WholeSaleServiceImpl(ItemRepository itemRepository, ItemMapper itemMapper) {
        this.itemRepository = itemRepository;
        this.itemMapper = itemMapper;

    }

   

    public ItemDTO findByIdWholeSale(Integer id) {
        return Optional.ofNullable(itemRepository.findByIdWholeSale(id)) // Handle null from query
                .map(itemMapper::toDTO)

                .orElseThrow(() -> new RuntimeException("Item not found"));
    }
    
    public List<ItemDTO> searchByItemName(String itemName) {
        return itemRepository.findByItemNameWholeSale(itemName).stream()
                .map(itemMapper::toDTO)
                .collect(Collectors.toList());
    }
    

    
    public List<ItemDTO> findAll() {
        return itemRepository.findUomLevelBelowElevenWholeSale().stream()
                .map(itemMapper::toDTO) // Handle only the mapping
                .collect(Collectors.toList());
    }
    
}
