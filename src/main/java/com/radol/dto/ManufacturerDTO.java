package com.radol.dto;

import java.util.List;

import com.radol.model.Manufacturer.ManufacturerStatus;

public class ManufacturerDTO {

    private Integer manufacturerId;
    private String manufacturerName;
    private String manufacturerDescription;
    private ManufacturerStatus manufacturerStatus; // Optional: Use String if you prefer to map directly to enum values
    private List<ManufacturerFacilityDTO> manufacturerFacility;
    private List<BrandDTO> brand;
    
    
	public ManufacturerDTO(Integer manufacturerId, String manufacturerName, String manufacturerDescription,
			ManufacturerStatus manufacturerStatus, List<ManufacturerFacilityDTO> manufacturerFacility,
			List<BrandDTO> brand) {
		super();
		this.manufacturerId = manufacturerId;
		this.manufacturerName = manufacturerName;
		this.manufacturerDescription = manufacturerDescription;
		this.manufacturerStatus = manufacturerStatus;
		this.manufacturerFacility = manufacturerFacility;
		this.brand = brand;
	}


	public ManufacturerDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Integer getManufacturerId() {
		return manufacturerId;
	}


	public void setManufacturerId(Integer manufacturerId) {
		this.manufacturerId = manufacturerId;
	}


	public String getManufacturerName() {
		return manufacturerName;
	}


	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}


	public String getManufacturerDescription() {
		return manufacturerDescription;
	}


	public void setManufacturerDescription(String manufacturerDescription) {
		this.manufacturerDescription = manufacturerDescription;
	}


	public ManufacturerStatus getManufacturerStatus() {
		return manufacturerStatus;
	}


	public void setManufacturerStatus(ManufacturerStatus manufacturerStatus) {
		this.manufacturerStatus = manufacturerStatus;
	}


	public List<ManufacturerFacilityDTO> getManufacturerFacility() {
		return manufacturerFacility;
	}


	public void setManufacturerFacility(List<ManufacturerFacilityDTO> manufacturerFacility) {
		this.manufacturerFacility = manufacturerFacility;
	}


	public List<BrandDTO> getBrand() {
		return brand;
	}


	public void setBrand(List<BrandDTO> brand) {
		this.brand = brand;
	}
	
    
	
	
    
    
	
    
}
