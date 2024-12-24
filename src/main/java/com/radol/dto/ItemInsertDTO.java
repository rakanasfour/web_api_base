package com.radol.dto;

import java.util.ArrayList;
import java.util.List;

import com.radol.model.Item.ItemStatus;

public class ItemInsertDTO {
	
    private Integer itemId;
    private String itemName;
    private String itemSku;
    private ItemStatus itemStatus;
    private String itemDescription;

    private List<Integer>attributes = new ArrayList<>();

	public ItemInsertDTO(Integer itemId, String itemName, String itemSku, ItemStatus itemStatus, String itemDescription,
			List<Integer> attributes) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemSku = itemSku;
		this.itemStatus = itemStatus;
		this.itemDescription = itemDescription;
		this.attributes = attributes;
	}

	public ItemInsertDTO() {
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

	public ItemStatus getItemStatus() {
		return itemStatus;
	}

	public void setItemStatus(ItemStatus itemStatus) {
		this.itemStatus = itemStatus;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public List<Integer> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<Integer> attributes) {
		this.attributes = attributes;
	}

	
    
    

    
    
}
