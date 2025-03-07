package com.radol.dto.request;

import java.util.ArrayList;
import java.util.List;

import com.radol.dto.ManufacturerFacilityDTO;
import com.radol.model.Manufacturer.ManufacturerStatus;

public class ManufacturerRequestDTO {

	

    private Integer manufacturerId;
    private String manufacturerName;
    private String manufacturerDescription;
    private ManufacturerStatus manufacturerStatus; // Optional: Use String if you prefer to map directly to enum values
	public ManufacturerRequestDTO(Integer manufacturerId, String manufacturerName, String manufacturerDescription,
			ManufacturerStatus manufacturerStatus) {
		super();
		this.manufacturerId = manufacturerId;
		this.manufacturerName = manufacturerName;
		this.manufacturerDescription = manufacturerDescription;
		this.manufacturerStatus = manufacturerStatus;
	}
	public ManufacturerRequestDTO() {
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
    
    
    
    
    
    

}
