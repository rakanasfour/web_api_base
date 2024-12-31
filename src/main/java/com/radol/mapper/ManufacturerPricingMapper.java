package com.radol.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.radol.dto.ManufacturerPricingDTO;

import com.radol.model.ManufacturerPricing;

@Mapper(componentModel = "spring")
public interface ManufacturerPricingMapper extends EntityMapper<ManufacturerPricingDTO, ManufacturerPricing> {
	

	
	// @Mapping(source = "uom", target = "uom")

	 ManufacturerPricingDTO toDTO(ManufacturerPricing entity );
	 
	 @InheritInverseConfiguration

	 ManufacturerPricing toEntity(ManufacturerPricingDTO dto);
}
