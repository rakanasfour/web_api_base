package com.radol.mapper.channel;


import org.mapstruct.Mapper;

import com.radol.dto.response.ShippingDimensionResponseDTO;
import com.radol.model.ShippingDimension;

@Mapper(componentModel = "spring")
	public interface ShippingDimensionMapperChannel extends EntityMapper<ShippingDimensionResponseDTO, ShippingDimension> {
		
	
			
		 ShippingDimensionResponseDTO toDTO(ShippingDimension entity );

	}
