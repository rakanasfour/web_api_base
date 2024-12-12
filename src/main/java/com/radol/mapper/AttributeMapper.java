package com.radol.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.radol.dto.AttributeDTO;
import com.radol.model.Attribute;

@Mapper(componentModel = "spring",uses = ItemChannelMapper.class)
public interface AttributeMapper extends EntityMapper<AttributeDTO, Attribute> {
	
	 @Mapping(source = "attributeId", target = "attributeId")
	    @Mapping(source = "attributeName", target = "attributeName")
	    @Mapping(source = "attributeType", target = "attributeType")
	    @Mapping(source = "attributeAssistText", target = "attributeAssistText")
	    @Mapping(source = "itemAttributes", target = "items")

		AttributeDTO toDTO(Attribute entity);

	 @InheritInverseConfiguration

	 Attribute toEntity(AttributeDTO dto);


	
	
}