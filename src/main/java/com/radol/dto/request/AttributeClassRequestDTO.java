package com.radol.dto.request;

public class AttributeClassRequestDTO {
	
	
	private int attributeClassId;
	private int mappedAttributeClassId;
	private int mappedClassId;
	
	public AttributeClassRequestDTO(int attributeClassId, int mappedAttributeClassId, int mappedClassId) {
		super();
		this.attributeClassId = attributeClassId;
		this.mappedAttributeClassId = mappedAttributeClassId;
		this.mappedClassId = mappedClassId;
	}

	public AttributeClassRequestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAttributeClassId() {
		return attributeClassId;
	}

	public void setAttributeClassId(int attributeClassId) {
		this.attributeClassId = attributeClassId;
	}

	public int getMappedAttributeClassId() {
		return mappedAttributeClassId;
	}

	public void setMappedAttributeClassId(int mappedAttributeClassId) {
		this.mappedAttributeClassId = mappedAttributeClassId;
	}

	public int getMappedClassId() {
		return mappedClassId;
	}

	public void setMappedClassId(int mappedClassId) {
		this.mappedClassId = mappedClassId;
	}
	
	
	
	
	

}
