package com.radol.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.radol.dto.BrandDTO;
import com.radol.dto.ModelDTO;
import com.radol.model.Brand;
import com.radol.model.Model;

@Mapper(componentModel = "spring")
public interface BrandMapper extends EntityMapper<BrandDTO, Brand> {
	
	 @Mapping(source = "manufacturer.manufacturerId", target = "manufacturerId")

	 @Mapping(source = "models", target = "models")
	 BrandDTO toDTO(Brand entity);
	 @InheritInverseConfiguration
	 Brand toEntity(BrandDTO dto);
	 
	 List<ModelDTO> toModelDTOs(List<Model> models);
}




