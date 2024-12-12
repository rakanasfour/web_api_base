package com.radol.mapper;

import org.mapstruct.Mapper;

import com.radol.dto.ManufacturerPricingDTO;
import com.radol.model.ManufacturerPricing;

@Mapper(componentModel = "spring")
public interface ManufacturerPricingMapper extends EntityMapper<ManufacturerPricingDTO, ManufacturerPricing> {
	

}
