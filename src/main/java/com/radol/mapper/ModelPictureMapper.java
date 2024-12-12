package com.radol.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


import com.radol.dto.ModelPictureDTO;

import com.radol.model.ModelPicture;

@Mapper(componentModel = "spring")
	public interface ModelPictureMapper extends EntityMapper<ModelPictureDTO, ModelPicture> {
	
	
	
	@Mapping(source = "model.modelId", target = "modelId")

	ModelPictureDTO toDTO(ModelPicture entity);

	@InheritInverseConfiguration
	ModelPicture toEntity(ModelPictureDTO dto);




		

	}