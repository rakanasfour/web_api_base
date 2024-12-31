package com.radol.mapper.channel;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.radol.dto.ClassDTO;
import com.radol.dto.response.ClassResponseDTO;
import com.radol.model.ClassEntity;

@Mapper(componentModel = "spring",uses = AttributeClassMapperChannel.class)
public interface ClassMapperChannel extends EntityMapper<ClassResponseDTO, ClassEntity> {
	
	
	
	
    @Mapping(source = "classId", target = "classId")
    @Mapping(source = "className", target = "className")
    @Mapping(source = "attributeClasses", target = "attributeClasses")
    ClassResponseDTO toDTO(ClassEntity classEntity);

    
    @InheritInverseConfiguration
    ClassEntity toEntity(ClassDTO classDTO);

}
