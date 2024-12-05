package com.radol.dto;

public class ItemChannelDTO {

    private Integer itemChannelId;
    
    private Integer mappedItemChannelDTOId;
    
    private Integer mappedChannelDTOId;

	public ItemChannelDTO(Integer itemChannelId, Integer mappedItemChannelDTOId, Integer mappedChannelDTOId) {
		super();
		this.itemChannelId = itemChannelId;
		this.mappedItemChannelDTOId = mappedItemChannelDTOId;
		this.mappedChannelDTOId = mappedChannelDTOId;
	}
	
	

	public ItemChannelDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getItemChannelId() {
		return itemChannelId;
	}

	public void setItemChannelId(Integer itemChannelId) {
		this.itemChannelId = itemChannelId;
	}

	public Integer getMappedItemChannelDTOId() {
		return mappedItemChannelDTOId;
	}

	public void setMappedItemChannelDTOId(Integer mappedItemChannelDTOId) {
		this.mappedItemChannelDTOId = mappedItemChannelDTOId;
	}

	public Integer getMappedChannelDTOId() {
		return mappedChannelDTOId;
	}

	public void setMappedChannelDTOId(Integer mappedChannelDTOId) {
		this.mappedChannelDTOId = mappedChannelDTOId;
	} 
    


    
    
	
}
