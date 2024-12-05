package com.radol.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.radol.dto.UomPictureDTO;
import com.radol.model.UomPicture;



@Mapper(componentModel = "spring", uses= {UomMapper.class })
public interface UomPictureMapper extends EntityMapper<UomPictureDTO, UomPicture> {
	
	@Mapping(source = "uompicture.uomId", target = "uomId")

	
	 UomPictureDTO toDTO(UomPicture entity);
	 @InheritInverseConfiguration
	UomPicture toEntity(UomPictureDTO dto);




	




}