package com.radol.dto.response;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.radol.dto.AttributeDTO;
import com.radol.dto.ChannelDTO;
import com.radol.dto.DocumentStorageDTO;
import com.radol.dto.ItemPictureDTO;
import com.radol.dto.SalesCategoryDTO;
import com.radol.dto.UomDTO;
import com.radol.model.Item.ItemStatus;

public class ItemResponseDTO {
	


    private Integer itemId;
    private String itemName;
    private String itemSku;
    private String itemDescription;
    private String itemAvailability;
    private String itemMsaPromoItem;
    private Timestamp itemCreatedAt;
    private Timestamp itemUpdatedAt;
    private String itemUpdatedAtBy;
    private ItemStatus itemStatus;
    private Integer modelId;
    private Integer complianceCategory;
    private List<ItemPictureDTO> itemPictures;
    private List<ChannelDTO> channels;
    private List<AttributeDTO>attributes = new ArrayList<>();
    private List<SalesCategoryDTO> salesCategories;
    
    private List<UomResponseDTO> uoms;
    
    
    private List<DocumentStorageDTO> documentStorages;


	public ItemResponseDTO(Integer itemId, String itemName, String itemSku, String itemDescription,
			String itemAvailability, String itemMsaPromoItem, Timestamp itemCreatedAt, Timestamp itemUpdatedAt,
			String itemUpdatedAtBy, ItemStatus itemStatus, Integer modelId, Integer complianceCategory,
			List<ItemPictureDTO> itemPictures, List<ChannelDTO> channels, List<AttributeDTO> attributes,
			List<SalesCategoryDTO> salesCategories, List<UomResponseDTO> uoms,
			List<DocumentStorageDTO> documentStorages) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemSku = itemSku;
		this.itemDescription = itemDescription;
		this.itemAvailability = itemAvailability;
		this.itemMsaPromoItem = itemMsaPromoItem;
		this.itemCreatedAt = itemCreatedAt;
		this.itemUpdatedAt = itemUpdatedAt;
		this.itemUpdatedAtBy = itemUpdatedAtBy;
		this.itemStatus = itemStatus;
		this.modelId = modelId;
		this.complianceCategory = complianceCategory;
		this.itemPictures = itemPictures;
		this.channels = channels;
		this.attributes = attributes;
		this.salesCategories = salesCategories;
		this.uoms = uoms;
		this.documentStorages = documentStorages;
	}


	public ItemResponseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Integer getItemId() {
		return itemId;
	}


	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public String getItemSku() {
		return itemSku;
	}


	public void setItemSku(String itemSku) {
		this.itemSku = itemSku;
	}


	public String getItemDescription() {
		return itemDescription;
	}


	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}


	public String getItemAvailability() {
		return itemAvailability;
	}


	public void setItemAvailability(String itemAvailability) {
		this.itemAvailability = itemAvailability;
	}


	public String getItemMsaPromoItem() {
		return itemMsaPromoItem;
	}


	public void setItemMsaPromoItem(String itemMsaPromoItem) {
		this.itemMsaPromoItem = itemMsaPromoItem;
	}


	public Timestamp getItemCreatedAt() {
		return itemCreatedAt;
	}


	public void setItemCreatedAt(Timestamp itemCreatedAt) {
		this.itemCreatedAt = itemCreatedAt;
	}


	public Timestamp getItemUpdatedAt() {
		return itemUpdatedAt;
	}


	public void setItemUpdatedAt(Timestamp itemUpdatedAt) {
		this.itemUpdatedAt = itemUpdatedAt;
	}


	public String getItemUpdatedAtBy() {
		return itemUpdatedAtBy;
	}


	public void setItemUpdatedAtBy(String itemUpdatedAtBy) {
		this.itemUpdatedAtBy = itemUpdatedAtBy;
	}


	public ItemStatus getItemStatus() {
		return itemStatus;
	}


	public void setItemStatus(ItemStatus itemStatus) {
		this.itemStatus = itemStatus;
	}


	public Integer getModelId() {
		return modelId;
	}


	public void setModelId(Integer modelId) {
		this.modelId = modelId;
	}


	public Integer getComplianceCategory() {
		return complianceCategory;
	}


	public void setComplianceCategory(Integer complianceCategory) {
		this.complianceCategory = complianceCategory;
	}


	public List<ItemPictureDTO> getItemPictures() {
		return itemPictures;
	}


	public void setItemPictures(List<ItemPictureDTO> itemPictures) {
		this.itemPictures = itemPictures;
	}


	public List<ChannelDTO> getChannels() {
		return channels;
	}


	public void setChannels(List<ChannelDTO> channels) {
		this.channels = channels;
	}


	public List<AttributeDTO> getAttributes() {
		return attributes;
	}


	public void setAttributes(List<AttributeDTO> attributes) {
		this.attributes = attributes;
	}


	public List<SalesCategoryDTO> getSalesCategories() {
		return salesCategories;
	}


	public void setSalesCategories(List<SalesCategoryDTO> salesCategories) {
		this.salesCategories = salesCategories;
	}


	public List<UomResponseDTO> getUoms() {
		return uoms;
	}


	public void setUoms(List<UomResponseDTO> uoms) {
		this.uoms = uoms;
	}


	public List<DocumentStorageDTO> getDocumentStorages() {
		return documentStorages;
	}


	public void setDocumentStorages(List<DocumentStorageDTO> documentStorages) {
		this.documentStorages = documentStorages;
	}


	


}
