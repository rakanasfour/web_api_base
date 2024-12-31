package com.radol.mapper;


import org.mapstruct.Mapper;


import com.radol.dto.ShippingDimensionDTO;

import com.radol.model.ShippingDimension;

@Mapper(componentModel = "spring")
	public interface ShippingDimensionMapper extends EntityMapper<ShippingDimensionDTO, ShippingDimension> {
		
	
			
		 ShippingDimensionDTO toDTO(ShippingDimension entity );

	}
