package com.radol.service.impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.radol.dto.DisplayPageDTO;
import com.radol.dto.ItemDTO;
import com.radol.dto.ManufacturerPricingDTO;
import com.radol.dto.UomDTO;
import com.radol.mapper.ItemMapper;
import com.radol.model.Item;
import com.radol.model.Uom;
import com.radol.repository.ItemRepository;
import com.radol.service.ItemService;


@Service
public class ItemServiceImpl implements ItemService {
	
	
    @Autowired
    private final ItemRepository itemRepository;
    private final ItemMapper itemMapper;

    
    
    public ItemServiceImpl(ItemRepository itemRepository, ItemMapper itemMapper) {
        this.itemRepository = itemRepository;
        this.itemMapper = itemMapper;

    }

    @Override
    public ItemDTO save(ItemDTO dto) {
        Item item = itemMapper.toEntity(dto);

     
        return itemMapper.toDTO(itemRepository.save(item));
    }
    
    
    @Override
    public ItemDTO findById(Integer id) {
        return itemRepository.findById(id)
                .map(itemMapper::toDTO)
                .map(itemDTO -> {
                    if (itemDTO.getUoms() != null && !itemDTO.getUoms().isEmpty()) {
                        BigDecimal totalPrice = BigDecimal.ZERO;

                        for (UomDTO uom : itemDTO.getUoms()) {
                            BigDecimal uomQuantity = BigDecimal.valueOf(uom.getUomQuantity());
                            ManufacturerPricingDTO manufacturerPricing = uom.getManufacturerPricing();

                            if (manufacturerPricing != null && manufacturerPricing.getPricingList() != null) {
                                // Multiply uomQuantity by the pricingList field
                                totalPrice = totalPrice.add(uomQuantity.multiply(manufacturerPricing.getPricingList()));
                            }
                        }

                        // Set the total calculated price as the itemBasePrice
                        itemDTO.setItemBasePrice(totalPrice);
                    }
                    return itemDTO;
                })
                .orElseThrow(() -> new RuntimeException("Item not found"));
    }



    @Override
    public List<ItemDTO> findAll() {
        return itemRepository.findAll().stream()
                .map(itemMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ItemDTO update(Integer id, ItemDTO dto) {
        Item item = itemMapper.toEntity(dto);
        item.setItemId(id);
        return itemMapper.toDTO(itemRepository.save(item));
    }

    @Override
    public void deleteById(Integer id) {
        itemRepository.deleteById(id);
    }

    /*
    public List<DisplayPageDTO> getDisplayPage(Long itemId) {
        return itemRepository.getDisplayPage(itemId).stream()
                .map(displayPage -> {
                    // Calculate total price
                    BigDecimal totalPrice = displayPage.getItemBasePrice()
                            .multiply(BigDecimal.valueOf(displayPage.getUomQuantity()));
                    displayPage.setItemBasePrice(totalPrice); // Update the base price
                    
                    
                    // Calculate total weight
                    BigDecimal totalWeight = displayPage.getItemWeight()
                            .multiply(BigDecimal.valueOf(displayPage.getUomQuantity()));
                    displayPage.setItemWeight(totalWeight); // Update the weight

                    return displayPage;
                })
                .collect(Collectors.toList());
                
               
    }

*/
	
    
}
