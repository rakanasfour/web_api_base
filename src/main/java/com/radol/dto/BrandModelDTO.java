package com.radol.dto;

public class BrandModelDTO {
    private String brandName;
    private String modelName;
    
    
	public BrandModelDTO(String brandName, String modelName) {
		super();
		this.brandName = brandName;
		this.modelName = modelName;
	}


	public BrandModelDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getBrandName() {
		return brandName;
	}


	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}


	public String getModelName() {
		return modelName;
	}


	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	
	
    
    
}
