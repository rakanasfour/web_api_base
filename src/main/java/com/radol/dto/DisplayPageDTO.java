package com.radol.dto;

import java.math.BigDecimal;

public class DisplayPageDTO {

	    private String itemName;
	    private String itemSku;
	    private String itemDescription;
	    private BigDecimal itemBasePrice;

	    private String  itemPictures;
		private String uomType;
	    private Integer uomQuantity;
	    private Integer uomLevel;
		public DisplayPageDTO(String itemName, String itemSku, String itemDescription, BigDecimal itemBasePrice,
				String itemPictures, String uomType, Integer uomQuantity, Integer uomLevel) {
			super();
			this.itemName = itemName;
			this.itemSku = itemSku;
			this.itemDescription = itemDescription;
			this.itemBasePrice = itemBasePrice;
			this.itemPictures = itemPictures;
			this.uomType = uomType;
			this.uomQuantity = uomQuantity;
			this.uomLevel = uomLevel;
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
		public BigDecimal getItemBasePrice() {
			return itemBasePrice;
		}
		public void setItemBasePrice(BigDecimal itemBasePrice) {
			this.itemBasePrice = itemBasePrice;
		}
		public String getItemPictures() {
			return itemPictures;
		}
		public void setItemPictures(String itemPictures) {
			this.itemPictures = itemPictures;
		}
		public String getUomType() {
			return uomType;
		}
		public void setUomType(String uomType) {
			this.uomType = uomType;
		}
		public Integer getUomQuantity() {
			return uomQuantity;
		}
		public void setUomQuantity(Integer uomQuantity) {
			this.uomQuantity = uomQuantity;
		}
		public Integer getUomLevel() {
			return uomLevel;
		}
		public void setUomLevel(Integer uomLevel) {
			this.uomLevel = uomLevel;
		}
		
	    
	    
	    

}
