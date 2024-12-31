package com.radol.dto.request;

public class ItemSalesCategoryRequestDTO {

    private Integer itemSalesCategoryId;
    private Integer mappedItemSalesCategoryDTOId;             
    private Integer mappedSalesCategoryId;
    
    
	public ItemSalesCategoryRequestDTO(Integer itemSalesCategoryId, Integer mappedItemSalesCategoryDTOId,
			Integer mappedSalesCategoryId) {
		super();
		this.itemSalesCategoryId = itemSalesCategoryId;
		this.mappedItemSalesCategoryDTOId = mappedItemSalesCategoryDTOId;
		this.mappedSalesCategoryId = mappedSalesCategoryId;
	}


	public ItemSalesCategoryRequestDTO() {
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
