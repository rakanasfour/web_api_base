package com.radol.dto.response;

import java.util.List;

import com.radol.dto.ClassDTO;
import com.radol.dto.ItemDTO;
import com.radol.model.Attribute.AttributeType;

public class AttributeResponseDTO {
	private Integer attributeId;
    private String attributeName;
    private AttributeType attributeType;
    private String attributeAssistText;
    
    private List<ItemDTO> items;
    

    private List<ClassDTO> classes;


	public AttributeResponseDTO(Integer attributeId, String attributeName, AttributeType attributeType,
			String attributeAssistText, List<ItemDTO> items, List<ClassDTO> classes) {
		super();
		this.attributeId = attributeId;
		this.attributeName = attributeName;
		this.attributeType = attributeType;
		this.attributeAssistText = attributeAssistText;
		this.items = items;
		this.classes = classes;
	}


	public AttributeResponseDTO() {
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


	public List<ClassDTO> getClasses() {
		return classes;
	}


	public void setClasses(List<ClassDTO> classes) {
		this.classes = classes;
	}

}
