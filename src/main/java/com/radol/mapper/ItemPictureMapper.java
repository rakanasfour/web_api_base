package com.radol.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.radol.dto.ItemPictureDTO;

import com.radol.model.ItemPicture;

@Mapper(componentModel = "spring")
	public interface ItemPictureMapper extends EntityMapper<ItemPictureDTO, ItemPicture> {
		


		
	 @Mapping(source = "itemPItemId.itemId", target = "itemId")
	
	 ItemPictureDTO toDTO(ItemPicture entity );
	 
	 
	 @InheritInverseConfiguration

	 ItemPicture toEntity(ItemPictureDTO dto);


	
	}