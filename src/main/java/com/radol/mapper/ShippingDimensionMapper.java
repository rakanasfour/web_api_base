package com.radol.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.radol.dto.ItemDTO;
import com.radol.dto.ShippingDimensionDTO;
import com.radol.model.Item;
import com.radol.model.ShippingDimension;

@Mapper(componentModel = "spring")
	public interface ShippingDimensionMapper extends EntityMapper<ShippingDimensionDTO, ShippingDimension> {
		
	
			
		 ItemDTO toDTO(Item entity );
		 	 
		 @InheritInverseConfiguration
		
		Item toEntity(ItemDTO dto);

	}
