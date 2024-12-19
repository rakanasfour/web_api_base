package com.radol.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.radol.dto.DocumentStorageDTO;
import com.radol.model.DocumentStorage;

@Mapper(componentModel = "spring")
	public interface DocumentStorageMapper extends EntityMapper<DocumentStorageDTO, DocumentStorage> {
		
	
	
	
	 @Mapping(source = "documentSItemId.itemId", target = "itemId")
	
	 DocumentStorageDTO toDTO(DocumentStorage entity );
	 
	 
	 @InheritInverseConfiguration

	 DocumentStorage toEntity(DocumentStorageDTO dto);


	}
