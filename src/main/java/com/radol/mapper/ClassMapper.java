package com.radol.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.radol.dto.ClassDTO;
import com.radol.dto.SalesCategoryDTO;
import com.radol.model.ClassEntity;
import com.radol.model.SalesCategory;

@Mapper(componentModel = "spring",uses = AttributeClassMapper.class)
public interface ClassMapper extends EntityMapper<ClassDTO, ClassEntity> {
	
	
	
	
    @Mapping(source = "classId", target = "classId")
    @Mapping(source = "className", target = "className")
    @Mapping(source = "attributeClasses", target = "attributeClasses")
    ClassDTO toDTO(ClassEntity classEntity);

    
    @InheritInverseConfiguration
    ClassEntity toEntity(ClassDTO classDTO);

}
