package com.radol.mapper.channel;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.radol.dto.ItemDTO;
import com.radol.dto.SalesCategoryDTO;
import com.radol.dto.response.ItemResponseDTO;
import com.radol.dto.response.ItemSalesCategoryResponseDTO;
import com.radol.model.ItemSalesCategory;

@Mapper(componentModel = "spring", uses= {ItemMapperChannel.class, SalesCategoryMapperChannel.class })
public interface ItemSalesCategoryMapperChannel extends EntityMapper<ItemSalesCategoryResponseDTO, ItemSalesCategory> {
	
	

	  @Mapping(source = "mappedItemSalesCategory.itemId", target = "itemId")
	    @Mapping(source = "mappedItemSalesCategory.itemName", target = "itemName")
	    @Mapping(source = "mappedItemSalesCategory.itemSku", target = "itemSku")
	    @Mapping(source = "mappedItemSalesCategory.itemDescription", target = "itemDescription")
	    @Mapping(source = "mappedItemSalesCategory.itemAvailability", target = "itemAvailability")
	    @Mapping(source = "mappedItemSalesCategory.itemMsaPromoItem", target = "itemMsaPromoItem")
	    @Mapping(source = "mappedItemSalesCategory.itemCreatedAt", target = "itemCreatedAt")
	    @Mapping(source = "mappedItemSalesCategory.itemUpdatedAt", target = "itemUpdatedAt")
	    @Mapping(source = "mappedItemSalesCategory.itemUpdatedAtBy", target = "itemUpdatedAtBy")
	    @Mapping(source = "mappedItemSalesCategory.itemStatus", target = "itemStatus")

		 ItemResponseDTO toItemDTO(ItemSalesCategory itemSalesCategory);
		 
		 
		 @InheritInverseConfiguration
		 ItemSalesCategory toItemEntity(ItemDTO itemDTO);
	
		 // Map ItemSalesCategory to ChannelDTO
		    @Mapping(source = "mappedSalesCategory.salesCategoryId", target = "salesCategoryId")
		    @Mapping(source = "mappedSalesCategory.salesCategoryName", target = "salesCategoryName")
		    @Mapping(source = "mappedSalesCategory.salesCategoryMeasurementType", target = "salesCategoryMeasurementType")
		    @Mapping(source = "mappedSalesCategory.salesCategorySystemMeasurement", target = "salesCategorySystemMeasurement")
			SalesCategoryDTO toAttributeDTO(ItemSalesCategory itemSalesCategory);
			
			
			 @InheritInverseConfiguration
			 ItemSalesCategory toAttributeEntity(SalesCategoryDTO salesCategoryDTO);
}



