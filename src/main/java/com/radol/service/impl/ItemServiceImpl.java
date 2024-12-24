package com.radol.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.radol.dto.ItemDTO;
import com.radol.dto.ItemRequestDTO;
import com.radol.mapper.ItemMapper;
import com.radol.model.Attribute;
import com.radol.model.Item;
import com.radol.model.ItemAttribute;
import com.radol.model.ItemSalesCategory;
import com.radol.model.Model;
import com.radol.model.SalesCategory;
import com.radol.repository.AttributeRepository;
import com.radol.repository.DocumentStorageRepository;
import com.radol.repository.ItemAttributeRepository;
import com.radol.repository.ItemRepository;
import com.radol.repository.ItemSalesCategoryRepository;
import com.radol.repository.ModelRepository;
import com.radol.repository.SalesCategoryRepository;
import com.radol.repository.UomRepository;
import com.radol.service.ItemService;


@Service
public class ItemServiceImpl implements ItemService {
	
	

    private final ItemRepository itemRepository;
    private final ItemAttributeRepository itemAttributeRepository;
    private final ModelRepository modelRepository;
    private final ItemMapper itemMapper;
    private final ItemSalesCategoryRepository itemSalesCategoryRepository;
    private final AttributeRepository attributeRepository;
    private final SalesCategoryRepository salesCategoryRepository;
    private final UomRepository uomRepository;
    private final DocumentStorageRepository documentStorageRepository;
    
    @Autowired
    public ItemServiceImpl(
        ItemRepository itemRepository,
        ItemAttributeRepository itemAttributeRepository,
        ModelRepository modelRepository,
        ItemMapper itemMapper,
        ItemSalesCategoryRepository itemSalesCategoryRepository,
        AttributeRepository attributeRepository,
        SalesCategoryRepository salesCategoryRepository,
        UomRepository uomRepository,
        DocumentStorageRepository documentStorageRepository
    ) {
        this.itemRepository = itemRepository;
        this.itemAttributeRepository = itemAttributeRepository;
        this.modelRepository = modelRepository;
        this.itemMapper = itemMapper;
        this.itemSalesCategoryRepository = itemSalesCategoryRepository;
        this.attributeRepository = attributeRepository;
        this.salesCategoryRepository = salesCategoryRepository;
        this.uomRepository = uomRepository;
        this.documentStorageRepository = documentStorageRepository;
    }




	public ItemRepository getItemRepository() {
		return itemRepository;
	}



	public ItemAttributeRepository getItemAttributeRepository() {
		return itemAttributeRepository;
	}



	public ModelRepository getModelRepository() {
		return modelRepository;
	}



	public ItemMapper getItemMapper() {
		return itemMapper;
	}



	public ItemSalesCategoryRepository getItemSalesCategoryRepository() {
		return itemSalesCategoryRepository;
	}



	public AttributeRepository getAttributeRepository() {
		return attributeRepository;
	}



	public SalesCategoryRepository getSalesCategoryRepository() {
		return salesCategoryRepository;
	}



	public UomRepository getUomRepository() {
		return uomRepository;
	}



	public DocumentStorageRepository getDocumentStorageRepository() {
		return documentStorageRepository;
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
                /*
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
                */
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
    
 
    public ItemDTO saveItemRequest(ItemRequestDTO dto) {
    	
    	Item item = new Item();
    	item.setItemName(dto.getItemName());
    	item.setItemSku(dto.getItemSku());
    	item.setItemDescription(dto.getItemDescription());
    	item.setItemStatus(dto.getItemStatus());
        Item savedItem = itemRepository.save(item);
        
        // Associate attributes with the saved item
        for (Integer attributeId : dto.getAttributes()) {
            Attribute attribute = attributeRepository.findById(attributeId)
                .orElseThrow(() -> new RuntimeException("Attribute not found with ID: " + attributeId));
            ItemAttribute itemAttribute = new ItemAttribute();
            itemAttribute.setMappedItemAttribute(savedItem);
            itemAttribute.setMappedAttribute(attribute);
            itemAttributeRepository.save(itemAttribute);
        }

        
        for (Integer salesCategoryId : dto.getSalesCategories()) {
        	SalesCategory salesCategory = salesCategoryRepository.findById(salesCategoryId)
                .orElseThrow(() -> new RuntimeException("SalesCategory not found with ID: " + salesCategoryId));
        	ItemSalesCategory itemSalesCategory = new ItemSalesCategory();
        	itemSalesCategory.setMappedItemSalesCategory(savedItem);
        	itemSalesCategory.setMappedSalesCategory(salesCategory);
            itemSalesCategoryRepository.save(itemSalesCategory);
        }
        
        
     // Associate the item with a model
        Model model = modelRepository.findById(dto.getModelId())
            .orElseThrow(() -> new RuntimeException("Model not found with ID: " + dto.getModelId()));
        model.getItems().add(savedItem);
        modelRepository.save(model);
        
        item.setModel(model);

        // Map saved entity back to DTO and return
        return itemMapper.toDTO(savedItem);
    }

	
    
}
