package com.radol.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;


import com.radol.dto.PackagingDTO;
import com.radol.model.Packaging;

@Mapper(componentModel = "spring")
public interface PackagingMapper extends EntityMapper<PackagingDTO, Packaging> {
	
	
	 PackagingDTO toDTO(Packaging entity);
	 @InheritInverseConfiguration
	Packaging toEntity(PackagingDTO dto);



	
	
}