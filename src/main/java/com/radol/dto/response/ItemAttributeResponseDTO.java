package com.radol.dto.response;

public class ItemAttributeResponseDTO {

    private Integer itemAttributeId;
    private Integer mappedItemAttributeDTOId;      // To hold the ID of the associated item
    private Integer mappedaAttributeDTOId;
    
	public ItemAttributeResponseDTO(Integer itemAttributeId, Integer mappedItemAttributeDTOId, Integer mappedaAttributeDTOId) {
		super();
		this.itemAttributeId = itemAttributeId;
		this.mappedItemAttributeDTOId = mappedItemAttributeDTOId;
		this.mappedaAttributeDTOId = mappedaAttributeDTOId;
	}

	public ItemAttributeResponseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getItemAttributeId() {
		return itemAttributeId;
	}

	public void setItemAttributeId(Integer itemAttributeId) {
		this.itemAttributeId = itemAttributeId;
	}

	public Integer getMappedItemAttributeDTOId() {
		return mappedItemAttributeDTOId;
	}

	public void setMappedItemAttributeDTOId(Integer mappedItemAttributeDTOId) {
		this.mappedItemAttributeDTOId = mappedItemAttributeDTOId;
	}

	public Integer getMappedaAttributeDTOId() {
		return mappedaAttributeDTOId;
	}

	public void setMappedaAttributeDTOId(Integer mappedaAttributeDTOId) {
		this.mappedaAttributeDTOId = mappedaAttributeDTOId;
	}
    
	
	
	
	
	
	
    
    
    
    
}
