package com.radol.mapper.channel;

import org.mapstruct.Mapper;

import com.radol.dto.response.ManufacturerPricingResponseDTO;
import com.radol.model.ManufacturerPricing;

@Mapper(componentModel = "spring")
public interface ManufacturerPricingMapperChannel extends EntityMapper<ManufacturerPricingResponseDTO, ManufacturerPricing> {
	

}
