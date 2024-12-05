package com.radol.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.radol.dto.UomDTO;
import com.radol.model.Uom;
	
	
	@Mapper(componentModel = "spring", uses= {PackagingMapper.class, ShippingDimensionMapper.class })
	public interface UomMapper extends EntityMapper<UomDTO, Uom> {
		
		@Mapping(source = "packaging.packagingId", target = "packagingId")
		@Mapping(source = "shippingDimension.shippingDimensionId", target = "shippingDimensionId")
		UomDTO toDTO(Uom entity);

			
		 @InheritInverseConfiguration
		Uom toEntity(UomDTO dto);
	
	}
