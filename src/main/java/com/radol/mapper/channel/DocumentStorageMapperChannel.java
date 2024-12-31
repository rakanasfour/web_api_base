package com.radol.mapper.channel;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.radol.dto.DocumentStorageDTO;
import com.radol.dto.response.DocumentStorageResponseDTO;
import com.radol.model.DocumentStorage;

@Mapper(componentModel = "spring")
	public interface DocumentStorageMapperChannel extends EntityMapper<DocumentStorageResponseDTO, DocumentStorage> {
		
	
	
	
	 @Mapping(source = "documentSItemId.itemId", target = "itemId")
	
	 DocumentStorageResponseDTO toDTO(DocumentStorage entity );
	 
	 
	 @InheritInverseConfiguration

	 DocumentStorage toEntity(DocumentStorageDTO dto);


	}
