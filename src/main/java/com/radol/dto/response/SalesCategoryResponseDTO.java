package com.radol.dto.response;

import java.util.List;

import com.radol.dto.ItemDTO;
import com.radol.model.SalesCategory.MeasurementType;
import com.radol.model.SalesCategory.SystemMeasurement;

public class SalesCategoryResponseDTO {

	
	 private Integer salesCategoryId;
	    private String salesCategoryName;
	    private  MeasurementType salesCategoryMeasurementType;
	    private  SystemMeasurement salesCategorySystemMeasurement;
	    
	    private List<ItemDTO> items;

		public SalesCategoryResponseDTO(Integer salesCategoryId, String salesCategoryName,
				MeasurementType salesCategoryMeasurementType, SystemMeasurement salesCategorySystemMeasurement,
				List<ItemDTO> items) {
			super();
			this.salesCategoryId = salesCategoryId;
			this.salesCategoryName = salesCategoryName;
			this.salesCategoryMeasurementType = salesCategoryMeasurementType;
			this.salesCategorySystemMeasurement = salesCategorySystemMeasurement;
			this.items = items;
		}

		public SalesCategoryResponseDTO() {
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

		public List<ItemDTO> getItems() {
			return items;
		}

		public void setItems(List<ItemDTO> items) {
			this.items = items;
		}
	    
	    
}
