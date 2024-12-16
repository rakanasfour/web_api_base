package com.radol.dto;


import java.util.List;

import com.radol.model.Uom.UomStatus;

public class UomDTO {
    private Integer uomId;
    private String uomType;
    private Integer uomLevel;
    private UomStatus uomStatus;
    private String uomManufacturerBarcode;
    private String uomInternalBarcode;
    private Integer shippingDimensionId;
    private PackagingDTO packagingId;
    private Integer itemUomQuantity;
    private List<ItemDTO> items;
    private List<ChannelDTO> channels;
    
	public UomDTO(Integer uomId, String uomType, Integer uomLevel, UomStatus uomStatus, String uomManufacturerBarcode,
			String uomInternalBarcode, Integer shippingDimensionId, PackagingDTO packagingId, Integer itemUomQuantity,
			List<ItemDTO> items, List<ChannelDTO> channels) {
		super();
		this.uomId = uomId;
		this.uomType = uomType;
		this.uomLevel = uomLevel;
		this.uomStatus = uomStatus;
		this.uomManufacturerBarcode = uomManufacturerBarcode;
		this.uomInternalBarcode = uomInternalBarcode;
		this.shippingDimensionId = shippingDimensionId;
		this.packagingId = packagingId;
		this.itemUomQuantity = itemUomQuantity;
		this.items = items;
		this.channels = channels;
	}

	public UomDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getUomId() {
		return uomId;
	}

	public void setUomId(Integer uomId) {
		this.uomId = uomId;
	}

	public String getUomType() {
		return uomType;
	}

	public void setUomType(String uomType) {
		this.uomType = uomType;
	}

	public Integer getUomLevel() {
		return uomLevel;
	}

	public void setUomLevel(Integer uomLevel) {
		this.uomLevel = uomLevel;
	}

	public UomStatus getUomStatus() {
		return uomStatus;
	}

	public void setUomStatus(UomStatus uomStatus) {
		this.uomStatus = uomStatus;
	}

	public String getUomManufacturerBarcode() {
		return uomManufacturerBarcode;
	}

	public void setUomManufacturerBarcode(String uomManufacturerBarcode) {
		this.uomManufacturerBarcode = uomManufacturerBarcode;
	}

	public String getUomInternalBarcode() {
		return uomInternalBarcode;
	}

	public void setUomInternalBarcode(String uomInternalBarcode) {
		this.uomInternalBarcode = uomInternalBarcode;
	}

	public Integer getShippingDimensionId() {
		return shippingDimensionId;
	}

	public void setShippingDimensionId(Integer shippingDimensionId) {
		this.shippingDimensionId = shippingDimensionId;
	}

	public PackagingDTO getPackagingId() {
		return packagingId;
	}

	public void setPackagingId(PackagingDTO packagingId) {
		this.packagingId = packagingId;
	}

	public Integer getItemUomQuantity() {
		return itemUomQuantity;
	}

	public void setItemUomQuantity(Integer itemUomQuantity) {
		this.itemUomQuantity = itemUomQuantity;
	}

	public List<ItemDTO> getItems() {
		return items;
	}

	public void setItems(List<ItemDTO> items) {
		this.items = items;
	}

	public List<ChannelDTO> getChannels() {
		return channels;
	}

	public void setChannels(List<ChannelDTO> channels) {
		this.channels = channels;
	}
	
	
    
	
    
	
    
    
	
	
    
    
}
