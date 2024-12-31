package com.radol.dto.request;

public class UomChannelRequestDTO {

    private Integer uomChannelId;
    
    private Integer mappedUomChannelDTOId;
    
    private Integer mappedChannelDTOId;

	public UomChannelRequestDTO(Integer uomChannelId, Integer mappedUomChannelDTOId, Integer mappedChannelDTOId) {
		super();
		this.uomChannelId = uomChannelId;
		this.mappedUomChannelDTOId = mappedUomChannelDTOId;
		this.mappedChannelDTOId = mappedChannelDTOId;
	}

	public UomChannelRequestDTO() {
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
