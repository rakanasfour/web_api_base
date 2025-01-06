package com.radol.dto;

import com.radol.model.ManufacturerFacility.FacilityStatus;

public class ManufacturerFacilityDTO {

    private Integer facilityId;
    private String facilityName;
    private String facilityCountry;
    private FacilityStatus facilityStatus; // Optional: Use String if you prefer to map directly to enum values
    private Integer manufacturerId; 
    
	public ManufacturerFacilityDTO(Integer facilityId, String facilityName, String facilityCountry,
			FacilityStatus facilityStatus, Integer manufacturerId) {
		super();
		this.facilityId = facilityId;
		this.facilityName = facilityName;
		this.facilityCountry = facilityCountry;
		this.facilityStatus = facilityStatus;
		this.manufacturerId = manufacturerId;
	}

	public ManufacturerFacilityDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getFacilityId() {
		return facilityId;
	}

	public void setFacilityId(Integer facilityId) {
		this.facilityId = facilityId;
	}

	public String getFacilityName() {
		return facilityName;
	}

	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}

	public String getFacilityCountry() {
		return facilityCountry;
	}

	public void setFacilityCountry(String facilityCountry) {
		this.facilityCountry = facilityCountry;
	}

	public FacilityStatus getFacilityStatus() {
		return facilityStatus;
	}

	public void setFacilityStatus(FacilityStatus facilityStatus) {
		this.facilityStatus = facilityStatus;
	}

	public Integer getManufacturerId() {
		return manufacturerId;
	}

	public void setManufacturerId(Integer manufacturerId) {
		this.manufacturerId = manufacturerId;
	}
    
	
	
    
	
	
    
    
	

    
    
    
}
