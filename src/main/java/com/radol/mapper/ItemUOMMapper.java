package com.radol.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.radol.dto.ItemDTO;
import com.radol.dto.ItemUOMDTO;
import com.radol.dto.UomDTO;
import com.radol.model.ItemUOM;

@Mapper(componentModel = "spring", uses= {ItemMapper.class, UomMapper.class })
	public interface ItemUOMMapper extends EntityMapper<ItemUOMDTO, ItemUOM> {
		
		
    @Mapping(source = "mappedItemUom.itemId", target = "itemId")
    @Mapping(source = "mappedItemUom.itemName", target = "itemName")
    @Mapping(source = "mappedItemUom.itemSku", target = "itemSku")
    @Mapping(source = "mappedItemUom.itemDescription", target = "itemDescription")
    @Mapping(source = "mappedItemUom.itemType", target = "itemType")
    @Mapping(source = "mappedItemUom.itemQuantity", target = "itemQuantity")
    @Mapping(source = "mappedItemUom.itemAvailability", target = "itemAvailability")
    @Mapping(source = "mappedItemUom.itemMsaPromoItem", target = "itemMsaPromoItem")
    @Mapping(source = "mappedItemUom.itemBasePrice", target = "itemBasePrice")
    @Mapping(source = "mappedItemUom.itemWeight", target = "itemWeight")
    @Mapping(source = "mappedItemUom.itemCreatedAt", target = "itemCreatedAt")
    @Mapping(source = "mappedItemUom.itemUpdatedAt", target = "itemUpdatedAt")
    @Mapping(source = "mappedItemUom.itemUpdatedAtBy", target = "itemUpdatedAtBy")
    @Mapping(source = "mappedItemUom.itemStatus", target = "itemStatus")
    //i need to do more here
    @Mapping(source = "itemUomQuantity", target = "itemUomQuantity")

   // @Mapping(source = "mappedItemChannel.manufacturerPricing", target = "manufacturerPricing")
  //  @Mapping(source = "mappedItemChannel.distributor", target = "distributor.")
   // @Mapping(source = "mappedItemChannel.itemName", target = "model")
   // @Mapping(source = "mappedItemChannel.complianceCategory", target = "complianceCategory")
    //@Mapping(source = "mappedItemChannel.channels", target = "channels.channelId")
    
    ItemDTO toItemDTO(ItemUOM itemUOM);

	 @InheritInverseConfiguration
    ItemUOM toItemEntity(ItemDTO itemDTO);

    // Map ItemChannel to ChannelDTO
    @Mapping(source = "mappedUomItem.uomId", target = "uomId")
    @Mapping(source = "mappedUomItem.uomType", target = "uomType")
    @Mapping(source = "mappedUomItem.uomLevel", target = "uomLevel")
    @Mapping(source = "mappedUomItem.uomManufacturerBarcode", target = "uomManufacturerBarcode")
    
    UomDTO toUomDTO(ItemUOM itemUOM);

    @InheritInverseConfiguration
    ItemUOM toUomEntity(UomDTO uomDTO);
	
	}
	