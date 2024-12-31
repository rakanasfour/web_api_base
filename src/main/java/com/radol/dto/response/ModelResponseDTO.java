package com.radol.dto.response;

import java.util.List;

import com.radol.dto.ItemDTO;
import com.radol.dto.ModelPictureDTO;

public class ModelResponseDTO {
	  private Integer modelId;
	    private String modelName;
	    private String modelDescription;
	    private Integer brandId; 
	    private List<ItemDTO> items;
	 //   private Integer manufacturerFacilityId; // ID of the associated Manufacturer Facility
	   private List<ModelPictureDTO> modelPictures; // List of associated ModelPicture DTOs
	   
	public ModelResponseDTO(Integer modelId, String modelName, String modelDescription, Integer brandId, List<ItemDTO> items,
			List<ModelPictureDTO> modelPictures) {
		super();
		this.modelId = modelId;
		this.modelName = modelName;
		this.modelDescription = modelDescription;
		this.brandId = brandId;
		this.items = items;
		this.modelPictures = modelPictures;
	}

	public ModelResponseDTO() {
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

	public List<ItemDTO> getItems() {
		return items;
	}

	public void setItems(List<ItemDTO> items) {
		this.items = items;
	}

	public List<ModelPictureDTO> getModelPictures() {
		return modelPictures;
	}

	public void setModelPictures(List<ModelPictureDTO> modelPictures) {
		this.modelPictures = modelPictures;
	}

	   
	   
	   
	}