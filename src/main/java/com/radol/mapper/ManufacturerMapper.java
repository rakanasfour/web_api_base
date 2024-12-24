package com.radol.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.radol.dto.ManufacturerDTO;
import com.radol.model.Manufacturer;

@Mapper(componentModel = "spring")
public interface ManufacturerMapper extends EntityMapper<ManufacturerDTO, Manufacturer> {
	
	 @Mapping(source = "manufacturerFacilities", target = "manufacturerFacilities")

	 ManufacturerDTO toDTO(Manufacturer entity );
	 
	 @InheritInverseConfiguration

	 Manufacturer toEntity(ManufacturerDTO dto);
	

}

