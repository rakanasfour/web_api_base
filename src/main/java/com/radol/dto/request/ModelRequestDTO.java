package com.radol.dto.request;

public class ModelRequestDTO {
	  private Integer modelId;
	  private String modelName;
	  private String modelDescription;
	  private Integer brandId;
	  
	public ModelRequestDTO(Integer modelId, String modelName, String modelDescription, Integer brandId) {
		super();
		this.modelId = modelId;
		this.modelName = modelName;
		this.modelDescription = modelDescription;
		this.brandId = brandId;
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

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}
	  
	
	
	
	  
	  
	  
	  
	  
}



 


