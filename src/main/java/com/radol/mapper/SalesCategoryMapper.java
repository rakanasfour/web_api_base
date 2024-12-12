package com.radol.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.radol.dto.SalesCategoryDTO;
import com.radol.model.SalesCategory;

@Mapper(componentModel = "spring",uses = ItemSalesCategoryMapper.class)
public interface SalesCategoryMapper extends EntityMapper<SalesCategoryDTO, SalesCategory> {
	
	
	
	
    @Mapping(source = "salesCategoryId", target = "salesCategoryId")
    @Mapping(source = "salesCategoryName", target = "salesCategoryName")
    @Mapping(source = "salesCategoryMeasurementType", target = "salesCategoryMeasurementType")
    @Mapping(source = "salesCategorySystemMeasurement", target = "salesCategorySystemMeasurement")
    @Mapping(source = "itemSalesCategories", target = "items")
    SalesCategoryDTO toDTO(SalesCategory salesCategory);

    
    @InheritInverseConfiguration
    SalesCategory toEntity(SalesCategoryDTO SalesCategoryDTO);

}
