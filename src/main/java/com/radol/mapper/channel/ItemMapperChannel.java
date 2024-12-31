package com.radol.mapper.channel;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.radol.dto.ItemDTO;
import com.radol.dto.response.ItemResponseDTO;
import com.radol.model.Item;

@Mapper(componentModel = "spring",uses = {ItemAttributeMapperChannel.class,ItemSalesCategoryMapperChannel.class})
	public interface ItemMapperChannel extends EntityMapper<ItemResponseDTO, Item> {
		
	 @Mapping(source = "itemId", target = "itemId")
	    @Mapping(source = "itemName", target = "itemName")
	  @Mapping(source = "itemAttributes", target = "attributes")
	 @Mapping(source = "itemSalesCategories", target = "salesCategories")
	    @Mapping(source = "uoms", target = "uoms")
	    @Mapping(source = "model.modelId", target = "modelId")


	 
	 ItemResponseDTO toDTO(Item entity );
	 
	 
	 @InheritInverseConfiguration

	Item toEntity(ItemDTO dto);





}
