package com.radol.mapper.channel;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.radol.dto.AttributeDTO;
import com.radol.dto.response.AttributeResponseDTO;
import com.radol.model.Attribute;

@Mapper(componentModel = "spring",uses = {ItemAttributeMapperChannel.class,AttributeClassMapperChannel.class})
public interface AttributeMapperChannel extends EntityMapper<AttributeResponseDTO, Attribute> {
	
	 @Mapping(source = "attributeId", target = "attributeId")
	    @Mapping(source = "attributeName", target = "attributeName")
	    @Mapping(source = "attributeType", target = "attributeType")
	    @Mapping(source = "attributeAssistText", target = "attributeAssistText")
	 
	    @Mapping(source = "itemAttributes", target = "items")
	    @Mapping(source = "attributeClasses", target = "classes")

		AttributeResponseDTO toDTO(Attribute entity);

	 @InheritInverseConfiguration

	 Attribute toEntity(AttributeDTO dto);


	
	
}