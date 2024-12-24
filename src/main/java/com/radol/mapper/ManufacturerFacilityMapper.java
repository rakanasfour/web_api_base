package com.radol.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.radol.dto.ManufacturerFacilityDTO;
import com.radol.model.ManufacturerFacility;

@Mapper(componentModel = "spring")
public interface ManufacturerFacilityMapper extends EntityMapper<ManufacturerFacilityDTO, ManufacturerFacility> {

		
	 @Mapping(source = "manufacturer.manufacturerId", target = "manufacturerId")
	
	 ManufacturerFacilityDTO toDTO(ManufacturerFacility entity );
	 
	 
	 @InheritInverseConfiguration

	 ManufacturerFacility toEntity(ManufacturerFacilityDTO dto);

}
