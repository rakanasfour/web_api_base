package com.radol.mapper.channel;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.radol.dto.ModelDTO;
import com.radol.dto.response.ModelResponseDTO;
import com.radol.model.Model;

@Mapper(componentModel = "spring",uses = BrandMapperChannel.class)
public interface ModelMapperChannel extends EntityMapper<ModelResponseDTO, Model> {



/*
 @Mapping(source = "modelId", target = "modelId")
 @Mapping(source = "modelName", target = "modelName")
 @Mapping(source = "modelDescription", target = "modelDescription")
 @Mapping(source = "brandId", target = "brand.brandId")
 @Mapping(source = "manufacturerFacilityId", target = "manufacturerFacility.facilityId")
 @Mapping(source = "modelPictures", target = "modelPictures")
*/
@Mapping(source = "brand.brandId", target = "brandId")

ModelResponseDTO toDTO(Model entity);

   // @Mapping(source = "brandId", target = "brandId", qualifiedByName = "mapIdToBrand")
@InheritInverseConfiguration
Model toEntity(ModelDTO dto);

}

