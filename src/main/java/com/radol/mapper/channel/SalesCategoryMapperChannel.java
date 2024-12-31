package com.radol.mapper.channel;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.radol.dto.SalesCategoryDTO;
import com.radol.dto.response.SalesCategoryResponseDTO;
import com.radol.model.SalesCategory;

@Mapper(componentModel = "spring",uses = ItemSalesCategoryMapperChannel.class)
public interface SalesCategoryMapperChannel extends EntityMapper<SalesCategoryResponseDTO, SalesCategory> {
	
	
	
	
    @Mapping(source = "salesCategoryId", target = "salesCategoryId")
    @Mapping(source = "salesCategoryName", target = "salesCategoryName")
    @Mapping(source = "salesCategoryMeasurementType", target = "salesCategoryMeasurementType")
    @Mapping(source = "salesCategorySystemMeasurement", target = "salesCategorySystemMeasurement")
    @Mapping(source = "itemSalesCategories", target = "items")
    SalesCategoryResponseDTO toDTO(SalesCategory salesCategory);

    
    @InheritInverseConfiguration
    SalesCategory toEntity(SalesCategoryDTO SalesCategoryDTO);

}
