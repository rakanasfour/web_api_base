package com.radol.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.radol.dto.AttributeClassDTO;
import com.radol.dto.AttributeDTO;
import com.radol.dto.ClassDTO;
import com.radol.model.AttributeClass;


@Mapper(componentModel = "spring", uses= {AttributeMapper.class, ClassMapper.class })
public interface AttributeClassMapper extends EntityMapper<AttributeClassDTO, AttributeClass> {
	

	  @Mapping(source = "mappedAttributeClass.attributeId", target = "attributeId")
	    @Mapping(source = "mappedAttributeClass.attributeName", target = "attributeName")
	    @Mapping(source = "mappedAttributeClass.attributeType", target = "attributeType")
	    @Mapping(source = "mappedAttributeClass.attributeAssistText", target = "attributeAssistText")
	   // @Mapping(source = "mappedAttributeClass.itemAttributes", target = "items")
	 //  @Mapping(source = "mappedAttributeClass.attributeClasses", target = "classes")
	   
		 AttributeDTO toAttributeDTO(AttributeClass attributeClass);
		 
		 @InheritInverseConfiguration
		 AttributeClass toAttributeEntity(AttributeDTO attributeDTO);
	
		 // Map ItemSalesCategory to ChannelDTO
		    @Mapping(source = "mappedClass.classId", target = "classId")
		   @Mapping(source = "mappedClass.className", target = "className")
		    @Mapping(source = "mappedClass.attributeClasses", target = "attributeClasses")
		    ClassDTO toClassDTO(AttributeClass attributeClass);
			
			 @InheritInverseConfiguration
			 AttributeClass toClassEntity(ClassDTO classDTO);
}



