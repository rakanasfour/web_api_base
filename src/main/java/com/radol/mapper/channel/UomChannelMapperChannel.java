package com.radol.mapper.channel;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.radol.dto.ChannelDTO;
import com.radol.dto.UomDTO;
import com.radol.dto.response.ChannelResponseDTO;
import com.radol.dto.response.UomChannelResponseDTO;
import com.radol.dto.response.UomResponseDTO;
import com.radol.model.UomChannel;

@Mapper(componentModel = "spring", uses = {UomMapperChannel.class, ChannelMapperChannel.class})
public interface UomChannelMapperChannel extends EntityMapper<UomChannelResponseDTO, UomChannel> {
/*
    // Map ItemChannelDTO to ItemChannel
    @Mapping(source = "mappedItemChannel.itemId", target = "mappedItemChannelDTOId")
    @Mapping(source = "mappedChannel.channelId", target = "mappedChannelDTOId")
    ItemChannelDTO toDTO(ItemChannel entity);


    @InheritInverseConfiguration
    ItemChannel toEntity(ItemChannelDTO dto);
  */
    // Map ItemChannel to ItemDTO
    @Mapping(source = "mappedUomChannel.uomId", target = "uomId")
    @Mapping(source = "mappedUomChannel.uomType", target = "uomType")
    @Mapping(source = "mappedUomChannel.uomLevel", target = "uomLevel")
    @Mapping(source = "mappedUomChannel.uomStatus", target = "uomStatus")
    @Mapping(source = "mappedUomChannel.uomManufacturerBarcode", target = "uomManufacturerBarcode")
    @Mapping(source = "mappedUomChannel.uomInternalBarcode", target = "uomInternalBarcode")


   // @Mapping(source = "mappedItemChannel.manufacturerPricing", target = "manufacturerPricing")
  //  @Mapping(source = "mappedItemChannel.distributor", target = "distributor.")
   // @Mapping(source = "mappedItemChannel.itemName", target = "model")
   // @Mapping(source = "mappedItemChannel.complianceCategory", target = "complianceCategory")
    //@Mapping(source = "mappedItemChannel.channels", target = "channels.channelId")
   
    UomResponseDTO toUomDTO(UomChannel uomChannel);

	 @InheritInverseConfiguration
	 UomChannel toUomEntity(UomDTO uomDTO);

    // Map ItemChannel to ChannelDTO
    @Mapping(source = "mappedChannel.channelId", target = "channelId")
    @Mapping(source = "mappedChannel.channelDescription", target = "channelDescription")
    @Mapping(source = "mappedChannel.channelsLevel", target = "channelsLevel")
    @Mapping(source = "mappedChannel.channelDefaultUom", target = "channelDefaultUom")
    ChannelResponseDTO toChannelDTO(UomChannel uomChannel);

    @InheritInverseConfiguration
    UomChannel toChannelEntity(ChannelDTO channelDTO);
}
