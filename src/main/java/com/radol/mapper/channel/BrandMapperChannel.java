package com.radol.mapper.channel;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.radol.dto.BrandDTO;
import com.radol.dto.ModelDTO;
import com.radol.dto.response.BrandResponseDTO;
import com.radol.model.Brand;
import com.radol.model.Model;

@Mapper(componentModel = "spring")
public interface BrandMapperChannel extends EntityMapper<BrandResponseDTO, Brand> {
	
	 @Mapping(source = "manufacturer.manufacturerId", target = "manufacturerId")

	 @Mapping(source = "models", target = "models")
	 BrandResponseDTO toDTO(Brand entity);
	 @InheritInverseConfiguration
	 Brand toEntity(BrandDTO dto);
	 
	 List<ModelDTO> toModelDTOs(List<Model> models);
}




