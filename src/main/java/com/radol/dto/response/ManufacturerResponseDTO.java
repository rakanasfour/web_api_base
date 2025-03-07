package com.radol.dto.response;

import java.util.ArrayList;
import java.util.List;

import com.radol.dto.ManufacturerFacilityDTO;
import com.radol.model.Manufacturer.ManufacturerStatus;

public class ManufacturerResponseDTO {

	
	


    private Integer manufacturerId;
    private String manufacturerName;
    private String manufacturerDescription;
    private ManufacturerStatus manufacturerStatus; // Optional: Use String if you prefer to map directly to enum values
    private List<ManufacturerFacilityDTO> manufacturerFacilities = new ArrayList<>();
    
    
	public ManufacturerResponseDTO(Integer manufacturerId, String manufacturerName, String manufacturerDescription,
			ManufacturerStatus manufacturerStatus, List<ManufacturerFacilityDTO> manufacturerFacilities) {
		super();
		this.manufacturerId = manufacturerId;
		this.manufacturerName = manufacturerName;
		this.manufacturerDescription = manufacturerDescription;
		this.manufacturerStatus = manufacturerStatus;
		this.manufacturerFacilities = manufacturerFacilities;
	}
	public ManufacturerResponseDTO() {
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
	public List<ManufacturerFacilityDTO> getManufacturerFacilities() {
		return manufacturerFacilities;
	}
	public void setManufacturerFacilities(List<ManufacturerFacilityDTO> manufacturerFacilities) {
		this.manufacturerFacilities = manufacturerFacilities;
	} ;

   
}
