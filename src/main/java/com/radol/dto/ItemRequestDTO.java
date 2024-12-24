package com.radol.dto;

import java.util.ArrayList;
import java.util.List;

import com.radol.model.Item.ItemStatus;

public class ItemRequestDTO {
	
	   private Integer itemId;
	    private String itemName;
	    private String itemSku;
	    private ItemStatus itemStatus;
	    private String itemDescription;
	    private Integer modelId;
	    private List<Integer>attributes = new ArrayList<>();
	    private List<Integer> salesCategories = new ArrayList<>();
	    
	    
		public ItemRequestDTO(Integer itemId, String itemName, String itemSku, ItemStatus itemStatus,
				String itemDescription, Integer modelId, List<Integer> attributes, List<Integer> salesCategories) {
			super();
			this.itemId = itemId;
			this.itemName = itemName;
			this.itemSku = itemSku;
			this.itemStatus = itemStatus;
			this.itemDescription = itemDescription;
			this.modelId = modelId;
			this.attributes = attributes;
			this.salesCategories = salesCategories;
		}


		public ItemRequestDTO() {
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


		public Integer getModelId() {
			return modelId;
		}


		public void setModelId(Integer modelId) {
			this.modelId = modelId;
		}


		public List<Integer> getAttributes() {
			return attributes;
		}


		public void setAttributes(List<Integer> attributes) {
			this.attributes = attributes;
		}


		public List<Integer> getSalesCategories() {
			return salesCategories;
		}


		public void setSalesCategories(List<Integer> salesCategories) {
			this.salesCategories = salesCategories;
		}
	    
		
		
		
	    
	    
		
	    
	    
		

}
