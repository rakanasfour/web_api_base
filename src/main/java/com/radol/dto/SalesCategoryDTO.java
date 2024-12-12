package com.radol.dto;

import com.radol.model.SalesCategory.MeasurementType;
import com.radol.model.SalesCategory.SystemMeasurement;



public class SalesCategoryDTO {
    private Integer salesCategoryId;
    private String salesCategoryName;
    private  MeasurementType salesCategoryMeasurementType;
    private  SystemMeasurement salesCategorySystemMeasurement;
    
	public SalesCategoryDTO(Integer salesCategoryId, String salesCategoryName,
			MeasurementType salesCategoryMeasurementType, SystemMeasurement salesCategorySystemMeasurement) {
		super();
		this.salesCategoryId = salesCategoryId;
		this.salesCategoryName = salesCategoryName;
		this.salesCategoryMeasurementType = salesCategoryMeasurementType;
		this.salesCategorySystemMeasurement = salesCategorySystemMeasurement;
	}

	public SalesCategoryDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getSalesCategoryId() {
		return salesCategoryId;
	}

	public void setSalesCategoryId(Integer salesCategoryId) {
		this.salesCategoryId = salesCategoryId;
	}

	public String getSalesCategoryName() {
		return salesCategoryName;
	}

	public void setSalesCategoryName(String salesCategoryName) {
		this.salesCategoryName = salesCategoryName;
	}

	public MeasurementType getSalesCategoryMeasurementType() {
		return salesCategoryMeasurementType;
	}

	public void setSalesCategoryMeasurementType(MeasurementType salesCategoryMeasurementType) {
		this.salesCategoryMeasurementType = salesCategoryMeasurementType;
	}

	public SystemMeasurement getSalesCategorySystemMeasurement() {
		return salesCategorySystemMeasurement;
	}

	public void setSalesCategorySystemMeasurement(SystemMeasurement salesCategorySystemMeasurement) {
		this.salesCategorySystemMeasurement = salesCategorySystemMeasurement;
	}
    
	
	
    
    
    
    
}


