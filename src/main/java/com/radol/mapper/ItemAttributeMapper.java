package com.radol.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import com.radol.dto.AttributeDTO;
import com.radol.dto.ItemAttributeDTO;
import com.radol.dto.ItemDTO;
import com.radol.model.ItemAttribute;


@Mapper(componentModel = "spring", uses= {ItemMapper.class, AttributeMapper.class })
public interface ItemAttributeMapper extends EntityMapper<ItemAttributeDTO, ItemAttribute> {
	
	
	
    @Mapping(source = "mappedItemAttribute.itemId", target = "itemId")
    @Mapping(source = "mappedItemAttribute.itemName", target = "itemName")
    @Mapping(source = "mappedItemAttribute.itemSku", target = "itemSku")
    @Mapping(source = "mappedItemAttribute.itemDescription", target = "itemDescription")
    @Mapping(source = "mappedItemAttribute.itemAvailability", target = "itemAvailability")
    @Mapping(source = "mappedItemAttribute.itemMsaPromoItem", target = "itemMsaPromoItem")
    @Mapping(source = "mappedItemAttribute.itemCreatedAt", target = "itemCreatedAt")
    @Mapping(source = "mappedItemAttribute.itemUpdatedAt", target = "itemUpdatedAt")
    @Mapping(source = "mappedItemAttribute.itemUpdatedAtBy", target = "itemUpdatedAtBy")
    @Mapping(source = "mappedItemAttribute.itemStatus", target = "itemStatus")

	 ItemDTO toItemDTO(ItemAttribute itemAttribute);
	 
	 
	 @InheritInverseConfiguration
	 ItemAttribute toItemEntity(ItemDTO itemDTO);
	 
	    // Map ItemChannel to ChannelDTO
	    @Mapping(source = "mappedAttribute.attributeId", target = "attributeId")
	    @Mapping(source = "mappedAttribute.attributeName", target = "attributeName")
	    @Mapping(source = "mappedAttribute.attributeType", target = "attributeType")
	    @Mapping(source = "mappedAttribute.attributeAssistText", target = "attributeAssistText")
	 
	AttributeDTO toAttributeDTO(ItemAttribute itemAttribute);
	
	
	 @InheritInverseConfiguration
	 ItemAttribute toAttributeEntity(AttributeDTO attribtueDTO);
	
	 
	

}