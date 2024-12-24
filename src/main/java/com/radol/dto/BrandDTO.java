package com.radol.dto;

import java.util.List;

import com.radol.model.Brand.BrandStatus;


public class BrandDTO {

    private Integer brandId;
    private String brandName;
    private String brandDescription;
    private BrandStatus brandStatus; 
    private Integer manufacturerId;
    private List<ModelDTO> models;
    private Integer distributorId;
    
	public BrandDTO(Integer brandId, String brandName, String brandDescription, BrandStatus brandStatus,
			Integer manufacturerId, List<ModelDTO> models, Integer distributorId) {
		super();
		this.brandId = brandId;
		this.brandName = brandName;
		this.brandDescription = brandDescription;
		this.brandStatus = brandStatus;
		this.manufacturerId = manufacturerId;
		this.models = models;
		this.distributorId = distributorId;
	}

	public BrandDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBrandDescription() {
		return brandDescription;
	}

	public void setBrandDescription(String brandDescription) {
		this.brandDescription = brandDescription;
	}

	public BrandStatus getBrandStatus() {
		return brandStatus;
	}

	public void setBrandStatus(BrandStatus brandStatus) {
		this.brandStatus = brandStatus;
	}

	public Integer getManufacturerId() {
		return manufacturerId;
	}

	public void setManufacturerId(Integer manufacturerId) {
		this.manufacturerId = manufacturerId;
	}

	public List<ModelDTO> getModels() {
		return models;
	}

	public void setModels(List<ModelDTO> models) {
		this.models = models;
	}

	public Integer getDistributorId() {
		return distributorId;
	}

	public void setDistributorId(Integer distributorId) {
		this.distributorId = distributorId;
	}

	
	
    
    
    
    
    
    
    
}