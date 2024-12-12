package com.radol.dto;

import java.util.List;

import com.radol.model.Attribute.AttributeType;

public class AttributeDTO {

    private Integer attributeId;
    private String attributeName;
    private AttributeType attributeType;
    private String attributeAssistText;
    
    private List<ItemDTO> items;
    



	public AttributeDTO(Integer attributeId, String attributeName, AttributeType attributeType,
			String attributeAssistText, List<ItemDTO> items) {
		super();
		this.attributeId = attributeId;
		this.attributeName = attributeName;
		this.attributeType = attributeType;
		this.attributeAssistText = attributeAssistText;
		this.items = items;
	}
    
	
	public AttributeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Integer getAttributeId() {
		return attributeId;
	}


	public void setAttributeId(Integer attributeId) {
		this.attributeId = attributeId;
	}


	public String getAttributeName() {
		return attributeName;
	}


	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}


	public AttributeType getAttributeType() {
		return attributeType;
	}


	public void setAttributeType(AttributeType attributeType) {
		this.attributeType = attributeType;
	}


	public String getAttributeAssistText() {
		return attributeAssistText;
	}


	public void setAttributeAssistText(String attributeAssistText) {
		this.attributeAssistText = attributeAssistText;
	}


	public List<ItemDTO> getItems() {
		return items;
	}


	public void setItems(List<ItemDTO> items) {
		this.items = items;
	}

	
	
    
    
	
    
    
}