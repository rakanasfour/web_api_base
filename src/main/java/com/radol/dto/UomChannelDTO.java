package com.radol.dto;

public class UomChannelDTO {

    private Integer uomChannelId;
    
    private Integer mappedUomChannelDTOId;
    
    private Integer mappedChannelDTOId;

	public UomChannelDTO(Integer uomChannelId, Integer mappedUomChannelDTOId, Integer mappedChannelDTOId) {
		super();
		this.uomChannelId = uomChannelId;
		this.mappedUomChannelDTOId = mappedUomChannelDTOId;
		this.mappedChannelDTOId = mappedChannelDTOId;
	}

	public UomChannelDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getUomChannelId() {
		return uomChannelId;
	}

	public void setUomChannelId(Integer uomChannelId) {
		this.uomChannelId = uomChannelId;
	}

	public Integer getMappedUomChannelDTOId() {
		return mappedUomChannelDTOId;
	}

	public void setMappedUomChannelDTOId(Integer mappedUomChannelDTOId) {
		this.mappedUomChannelDTOId = mappedUomChannelDTOId;
	}

	public Integer getMappedChannelDTOId() {
		return mappedChannelDTOId;
	}

	public void setMappedChannelDTOId(Integer mappedChannelDTOId) {
		this.mappedChannelDTOId = mappedChannelDTOId;
	}

	
    
	
}
