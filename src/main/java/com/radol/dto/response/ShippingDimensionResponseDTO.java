package com.radol.dto.response;

import java.math.BigDecimal;

public class ShippingDimensionResponseDTO {

	
	 private Integer shippingDimensionId;
	    private BigDecimal height;
	    private BigDecimal width;
	    private BigDecimal length;
	    private BigDecimal weight;
	    
	    
		public ShippingDimensionResponseDTO(Integer shippingDimensionId, BigDecimal height, BigDecimal width, BigDecimal length,
				BigDecimal weight) {
			super();
			this.shippingDimensionId = shippingDimensionId;
			this.height = height;
			this.width = width;
			this.length = length;
			this.weight = weight;
		}
		public ShippingDimensionResponseDTO() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Integer getShippingDimensionId() {
			return shippingDimensionId;
		}
		public void setShippingDimensionId(Integer shippingDimensionId) {
			this.shippingDimensionId = shippingDimensionId;
		}
		public BigDecimal getHeight() {
			return height;
		}
		public void setHeight(BigDecimal height) {
			this.height = height;
		}
		public BigDecimal getWidth() {
			return width;
		}
		public void setWidth(BigDecimal width) {
			this.width = width;
		}
		public BigDecimal getLength() {
			return length;
		}
		public void setLength(BigDecimal length) {
			this.length = length;
		}
		public BigDecimal getWeight() {
			return weight;
		}
		public void setWeight(BigDecimal weight) {
			this.weight = weight;
		}

}
