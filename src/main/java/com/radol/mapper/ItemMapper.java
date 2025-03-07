package com.radol.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.radol.dto.ItemDTO;
import com.radol.model.Item;

@Mapper(componentModel = "spring",uses = {ItemAttributeMapper.class,ItemSalesCategoryMapper.class})
	public interface ItemMapper extends EntityMapper<ItemDTO, Item> {
		
	 @Mapping(source = "itemId", target = "itemId")
	    @Mapping(source = "itemName", target = "itemName")
	  @Mapping(source = "itemAttributes", target = "attributes")
	 @Mapping(source = "itemSalesCategories", target = "salesCategories")
	    @Mapping(source = "uoms", target = "uoms")
	    @Mapping(source = "model.modelId", target = "modelId")


	 
	 ItemDTO toDTO(Item entity );
	 
	 
	 @InheritInverseConfiguration

	Item toEntity(ItemDTO dto);





}
