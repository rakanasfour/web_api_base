package com.radol.dto;

import com.radol.model.Brand;

public class ModelRequestDTO {
	  private Integer modelId;
	  private String modelName;
	  private String modelDescription;
	  private Integer brand;
	  
	public ModelRequestDTO(Integer modelId, String modelName, String modelDescription, Integer brand) {
		super();
		this.modelId = modelId;
		this.modelName = modelName;
		this.modelDescription = modelDescription;
		this.brand = brand;
	}

	public ModelRequestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getModelId() {
		return modelId;
	}

	public void setModelId(Integer modelId) {
		this.modelId = modelId;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getModelDescription() {
		return modelDescription;
	}

	public void setModelDescription(String modelDescription) {
		this.modelDescription = modelDescription;
	}

	public Integer getBrand() {
		return brand;
	}

	public void setBrand(Integer brand) {
		this.brand = brand;
	}
	  
	
	  
	  
	  
}

  

   


