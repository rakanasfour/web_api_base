package com.radol.mapper.channel;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.radol.dto.ManufacturerFacilityDTO;
import com.radol.dto.response.ManufacturerFacilityResponseDTO;
import com.radol.model.ManufacturerFacility;

@Mapper(componentModel = "spring")
public interface ManufacturerFacilityMapperChannel extends EntityMapper<ManufacturerFacilityResponseDTO, ManufacturerFacility> {

		
	 @Mapping(source = "manufacturer.manufacturerId", target = "manufacturerId")
	
	 ManufacturerFacilityResponseDTO toDTO(ManufacturerFacility entity );
	 
	 
	 @InheritInverseConfiguration

	 ManufacturerFacility toEntity(ManufacturerFacilityDTO dto);

}
