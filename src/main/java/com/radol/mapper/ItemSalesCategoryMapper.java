package com.radol.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.radol.dto.ItemDTO;
import com.radol.dto.ItemSalesCategoryDTO;
import com.radol.dto.SalesCategoryDTO;
import com.radol.model.ItemSalesCategory;

@Mapper(componentModel = "spring", uses= {ItemMapper.class, SalesCategoryMapper.class })
public interface ItemSalesCategoryMapper extends EntityMapper<ItemSalesCategoryDTO, ItemSalesCategory> {
	
	

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

		 ItemDTO toItemDTO(ItemSalesCategory itemSalesCategory);
		 
		 
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



