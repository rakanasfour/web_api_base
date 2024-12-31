package com.radol.mapper.channel;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.radol.dto.ItemPictureDTO;
import com.radol.dto.response.ItemPictureResponseDTO;
import com.radol.model.ItemPicture;

@Mapper(componentModel = "spring")
	public interface ItemPictureMapperChannel extends EntityMapper<ItemPictureResponseDTO, ItemPicture> {
		


		
	 @Mapping(source = "itemPItemId.itemId", target = "itemId")
	
	 ItemPictureResponseDTO toDTO(ItemPicture entity );
	 
	 
	 @InheritInverseConfiguration

	 ItemPicture toEntity(ItemPictureDTO dto);


	
	}