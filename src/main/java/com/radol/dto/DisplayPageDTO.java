package com.radol.dto;

import java.math.BigDecimal;

public class DisplayPageDTO {

	    private String itemName;
	    private String itemSku;
	    private String itemDescription;
	    private String itemType;
	    private Integer itemQuantity;
	    private BigDecimal itemBasePrice;
	    private BigDecimal itemWeight;
	    private String uomType;
	    private Integer uomLevel;
	    private Integer itemUomQuantity;
	    
		public DisplayPageDTO(String itemName, String itemSku, String itemDescription, String itemType,
				Integer itemQuantity, BigDecimal itemBasePrice, BigDecimal itemWeight, String uomType, Integer uomLevel,
				Integer itemUomQuantity) {
			super();
			this.itemName = itemName;
			this.itemSku = itemSku;
			this.itemDescription = itemDescription;
			this.itemType = itemType;
			this.itemQuantity = itemQuantity;
			this.itemBasePrice = itemBasePrice;
			this.itemWeight = itemWeight;
			this.uomType = uomType;
			this.uomLevel = uomLevel;
			this.itemUomQuantity = itemUomQuantity;
		}

		public DisplayPageDTO() {
			super();
			// TODO Auto-generated constructor stub
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

		public String getItemType() {
			return itemType;
		}

		public void setItemType(String itemType) {
			this.itemType = itemType;
		}

		public Integer getItemQuantity() {
			return itemQuantity;
		}

		public void setItemQuantity(Integer itemQuantity) {
			this.itemQuantity = itemQuantity;
		}

		public BigDecimal getItemBasePrice() {
			return itemBasePrice;
		}

		public void setItemBasePrice(BigDecimal itemBasePrice) {
			this.itemBasePrice = itemBasePrice;
		}

		public BigDecimal getItemWeight() {
			return itemWeight;
		}

		public void setItemWeight(BigDecimal itemWeight) {
			this.itemWeight = itemWeight;
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

		public Integer getItemUomQuantity() {
			return itemUomQuantity;
		}

		public void setItemUomQuantity(Integer itemUomQuantity) {
			this.itemUomQuantity = itemUomQuantity;
		}
		
		
	    
		


}
