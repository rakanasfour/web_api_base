package com.radol.service.impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.radol.dto.ItemDTO;
import com.radol.dto.ItemPictureDTO;
import com.radol.dto.ManufacturerPricingDTO;
import com.radol.dto.UomDTO;
import com.radol.mapper.ItemMapper;
import com.radol.repository.ItemRepository;

@Service
public class CustomerServiceImpl {
	
	
    @Autowired
    private final ItemRepository itemRepository;
    private final ItemMapper itemMapper;

    
    
    public CustomerServiceImpl(ItemRepository itemRepository, ItemMapper itemMapper) {
        this.itemRepository = itemRepository;
        this.itemMapper = itemMapper;

    }

    
    public ItemDTO findByIdCustomer(Integer id) {
        return Optional.ofNullable(itemRepository.findByIdQueryCustomer(id)) // Ensure null safety
                .map(itemMapper::toDTO)
                .orElseThrow(() -> new RuntimeException("Item not found with ID: " + id));
    }


 /*

    public ItemDTO findByIdCustomer(Integer id) {
        return Optional.ofNullable(itemRepository.findByIdQueryCustomer(id)) // Handle null from query
                .map(itemMapper::toDTO)
                .map(itemDTO -> {
                    if (itemDTO.getUoms() != null && !itemDTO.getUoms().isEmpty()) {
                        BigDecimal totalPrice = BigDecimal.ZERO;

                        for (UomDTO uom : itemDTO.getUoms()) {
                            BigDecimal uomQuantity = BigDecimal.valueOf(uom.getUomQuantity());
                            ManufacturerPricingDTO manufacturerPricing = uom.getManufacturerPricing();

                            if (manufacturerPricing != null && manufacturerPricing.getPricingList() != null) {
                                totalPrice = totalPrice.add(uomQuantity.multiply(manufacturerPricing.getPricingList()));
                            }
                        }

                        itemDTO.setItemBasePrice(totalPrice); // Set the calculated price
                    }
                    return itemDTO;
                })
                .orElseThrow(() -> new RuntimeException("Item not found"));
    }



/*
    public List<ItemDTO> findAll() {
        return itemRepository.findAll().stream()
                .filter(item -> item.getUoms() != null && !item.getUoms().isEmpty()) // Skip items without uoms
                .map(item -> {
                    // Filter uoms with uomLevel < 5
                    item.setUoms(
                        item.getUoms().stream()
                            .filter(uom -> uom.getUomLevel() < 5)
                            .collect(Collectors.toList())
                    );
                    return itemMapper.toDTO(item); // Convert to DTO
                })
                .collect(Collectors.toList());
    }
    */
    
    public List<ItemDTO> findAll() {
        return itemRepository.findUomLevelBelowFiveCustomer().stream()
                .map(itemMapper::toDTO) // Handle only the mapping
                .collect(Collectors.toList());
    }
    
}
