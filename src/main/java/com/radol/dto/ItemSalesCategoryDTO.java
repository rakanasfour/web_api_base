package com.radol.dto;

public class ItemSalesCategoryDTO {

    private Integer itemSalesCategoryId;
    private Integer mappedItemSalesCategoryDTOId;             
    private Integer mappedSalesCategoryId;
    
    
	public ItemSalesCategoryDTO(Integer itemSalesCategoryId, Integer mappedItemSalesCategoryDTOId,
			Integer mappedSalesCategoryId) {
		super();
		this.itemSalesCategoryId = itemSalesCategoryId;
		this.mappedItemSalesCategoryDTOId = mappedItemSalesCategoryDTOId;
		this.mappedSalesCategoryId = mappedSalesCategoryId;
	}


	public ItemSalesCategoryDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Integer getItemSalesCategoryId() {
		return itemSalesCategoryId;
	}


	public void setItemSalesCategoryId(Integer itemSalesCategoryId) {
		this.itemSalesCategoryId = itemSalesCategoryId;
	}


	public Integer getMappedItemSalesCategoryDTOId() {
		return mappedItemSalesCategoryDTOId;
	}


	public void setMappedItemSalesCategoryDTOId(Integer mappedItemSalesCategoryDTOId) {
		this.mappedItemSalesCategoryDTOId = mappedItemSalesCategoryDTOId;
	}


	public Integer getMappedSalesCategoryId() {
		return mappedSalesCategoryId;
	}


	public void setMappedSalesCategoryId(Integer mappedSalesCategoryId) {
		this.mappedSalesCategoryId = mappedSalesCategoryId;
	}    
	
	

    
    
    
    
    
}
