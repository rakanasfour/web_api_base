package com.radol.mapper.channel;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.radol.dto.ManufacturerDTO;
import com.radol.dto.response.ManufacturerResponseDTO;
import com.radol.model.Manufacturer;

@Mapper(componentModel = "spring")
public interface ManufacturerMapperChannel extends EntityMapper<ManufacturerResponseDTO, Manufacturer> {
	
	 @Mapping(source = "manufacturerFacilities", target = "manufacturerFacilities")

	 ManufacturerResponseDTO toDTO(Manufacturer entity );
	 
	 @InheritInverseConfiguration

	 Manufacturer toEntity(ManufacturerDTO dto);
	

}

