package com.radol.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.radol.dto.UomDTO;
import com.radol.model.Uom;
	
	
	@Mapper(componentModel = "spring", uses= { UomChannelMapper.class})
	public interface UomMapper extends EntityMapper<UomDTO, Uom> {
		
	    @Mapping(source = "uomId", target = "uomId")
	    @Mapping(source = "uomType", target = "uomType")
	    @Mapping(source = "uomQuantity", target = "uomQuantity")
	    @Mapping(source = "uomLevel", target = "uomLevel")
	    @Mapping(source = "uomStatus", target = "uomStatus")
	    @Mapping(source = "uomManufacturerBarcode", target = "uomManufacturerBarcode")
	    @Mapping(source = "uomInternalBarcode", target = "uomInternalBarcode")
	    @Mapping(source = "packaging", target = "packagingId")
	    @Mapping(source = "uomChannels", target = "uomChannels")
	    @Mapping(source = "manufacturerPricing", target = "manufacturerPricing")
		UomDTO toDTO(Uom entity);

			
		 @InheritInverseConfiguration
		Uom toEntity(UomDTO dto);
	
	}
