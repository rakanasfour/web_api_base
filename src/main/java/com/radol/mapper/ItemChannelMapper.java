package com.radol.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.radol.dto.ChannelDTO;
import com.radol.dto.ItemChannelDTO;
import com.radol.dto.ItemDTO;
import com.radol.model.ItemChannel;

@Mapper(componentModel = "spring", uses = {ItemMapper.class, ChannelMapper.class})
public interface ItemChannelMapper extends EntityMapper<ItemChannelDTO, ItemChannel> {
/*
    // Map ItemChannelDTO to ItemChannel
    @Mapping(source = "mappedItemChannel.itemId", target = "mappedItemChannelDTOId")
    @Mapping(source = "mappedChannel.channelId", target = "mappedChannelDTOId")
    ItemChannelDTO toDTO(ItemChannel entity);


    @InheritInverseConfiguration
    ItemChannel toEntity(ItemChannelDTO dto);
  */
    // Map ItemChannel to ItemDTO
    @Mapping(source = "mappedItemChannel.itemId", target = "itemId")
    @Mapping(source = "mappedItemChannel.itemName", target = "itemName")
    @Mapping(source = "mappedItemChannel.itemSku", target = "itemSku")
    @Mapping(source = "mappedItemChannel.itemDescription", target = "itemDescription")
    @Mapping(source = "mappedItemChannel.itemType", target = "itemType")
    @Mapping(source = "mappedItemChannel.itemQuantity", target = "itemQuantity")
    @Mapping(source = "mappedItemChannel.itemAvailability", target = "itemAvailability")
    @Mapping(source = "mappedItemChannel.itemMsaPromoItem", target = "itemMsaPromoItem")
    @Mapping(source = "mappedItemChannel.itemBasePrice", target = "itemBasePrice")
    @Mapping(source = "mappedItemChannel.itemWeight", target = "itemWeight")
    @Mapping(source = "mappedItemChannel.itemCreatedAt", target = "itemCreatedAt")
    @Mapping(source = "mappedItemChannel.itemUpdatedAt", target = "itemUpdatedAt")
    @Mapping(source = "mappedItemChannel.itemUpdatedAtBy", target = "itemUpdatedAtBy")
    @Mapping(source = "mappedItemChannel.itemStatus", target = "itemStatus")
   // @Mapping(source = "mappedItemChannel.manufacturerPricing", target = "manufacturerPricing")
  //  @Mapping(source = "mappedItemChannel.distributor", target = "distributor.")
   // @Mapping(source = "mappedItemChannel.itemName", target = "model")
   // @Mapping(source = "mappedItemChannel.complianceCategory", target = "complianceCategory")
    //@Mapping(source = "mappedItemChannel.channels", target = "channels.channelId")
    
    ItemDTO toItemDTO(ItemChannel itemChannel);

	 @InheritInverseConfiguration
    ItemChannel toItemEntity(ItemDTO itemDTO);

    // Map ItemChannel to ChannelDTO
    @Mapping(source = "mappedChannel.channelId", target = "channelId")
    @Mapping(source = "mappedChannel.channelDescription", target = "channelDescription")
    @Mapping(source = "mappedChannel.channelsLevel", target = "channelsLevel")
    @Mapping(source = "mappedChannel.channelDefaultUom", target = "channelDefaultUom")
    ChannelDTO toChannelDTO(ItemChannel itemChannel);

    @InheritInverseConfiguration
    ItemChannel toChannelEntity(ChannelDTO channelDTO);
}
