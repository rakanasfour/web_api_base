package com.radol.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import com.radol.dto.ManufacturerDTO;
import com.radol.model.Manufacturer;

@Mapper(componentModel = "spring")
public interface ManufacturerMapper extends EntityMapper<ManufacturerDTO, Manufacturer> {
	
		
	 ManufacturerDTO toDTO(Manufacturer entity );
	 
	 @InheritInverseConfiguration

	 Manufacturer toEntity(ManufacturerDTO dto);
	

}

