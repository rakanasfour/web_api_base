package com.radol.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.radol.dto.ChannelDTO;
import com.radol.dto.ItemDTO;
import com.radol.dto.UomChannelDTO;
import com.radol.dto.UomDTO;
import com.radol.model.UomChannel;

@Mapper(componentModel = "spring", uses = {UomMapper.class, ChannelMapper.class})
public interface UomChannelMapper extends EntityMapper<UomChannelDTO, UomChannel> {
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
   
    UomDTO toUomDTO(UomChannel uomChannel);

	 @InheritInverseConfiguration
	 UomChannel toUomEntity(UomDTO uomDTO);

    // Map ItemChannel to ChannelDTO
    @Mapping(source = "mappedChannel.channelId", target = "channelId")
    @Mapping(source = "mappedChannel.channelDescription", target = "channelDescription")
    @Mapping(source = "mappedChannel.channelsLevel", target = "channelsLevel")
    @Mapping(source = "mappedChannel.channelDefaultUom", target = "channelDefaultUom")
    ChannelDTO toChannelDTO(UomChannel uomChannel);

    @InheritInverseConfiguration
    UomChannel toChannelEntity(ChannelDTO channelDTO);
}
