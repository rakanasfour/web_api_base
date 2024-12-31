package com.radol.mapper.channel;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import com.radol.dto.PackagingDTO;
import com.radol.dto.response.PackagingResponseDTO;
import com.radol.model.Packaging;

@Mapper(componentModel = "spring")
public interface PackagingMapperChannel extends EntityMapper<PackagingResponseDTO, Packaging> {
	
	
	 PackagingResponseDTO toDTO(Packaging entity);
	 @InheritInverseConfiguration
	Packaging toEntity(PackagingDTO dto);



	
	
}