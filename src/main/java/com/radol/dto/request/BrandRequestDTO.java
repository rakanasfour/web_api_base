package com.radol.dto.request;

import java.util.List;

import com.radol.dto.ModelDTO;
import com.radol.model.Brand.BrandStatus;

public class BrandRequestDTO {

	
	 private Integer brandId;
	    private String brandName;
	    private String brandDescription;
	    private BrandStatus brandStatus; 
	    private Integer manufacturerId;
		public BrandRequestDTO(Integer brandId, String brandName, String brandDescription, BrandStatus brandStatus,
				Integer manufacturerId) {
			super();
			this.brandId = brandId;
			this.brandName = brandName;
			this.brandDescription = brandDescription;
			this.brandStatus = brandStatus;
			this.manufacturerId = manufacturerId;
		}
		public BrandRequestDTO() {
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
	    
	    
	    
		
		
	    
	    
	    
	    
}
