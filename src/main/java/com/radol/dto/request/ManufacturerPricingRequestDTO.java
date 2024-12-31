package com.radol.dto.request;

import java.math.BigDecimal;

public class ManufacturerPricingRequestDTO {


	  private Integer pricingId;
	    private BigDecimal pricingList;
	    private BigDecimal pricingMsrp;
	    private BigDecimal pricingRmap;
	    private BigDecimal pricingWholesalePrice;
	    private BigDecimal pricingFederalExciseTax;
	    private BigDecimal pricingCost;
	    

	    

	    public ManufacturerPricingRequestDTO(Integer pricingId, BigDecimal pricingList, BigDecimal pricingMsrp,
				BigDecimal pricingRmap, BigDecimal pricingWholesalePrice, BigDecimal pricingFederalExciseTax,
				BigDecimal pricingCost) {
			super();
			this.pricingId = pricingId;
			this.pricingList = pricingList;
			this.pricingMsrp = pricingMsrp;
			this.pricingRmap = pricingRmap;
			this.pricingWholesalePrice = pricingWholesalePrice;
			this.pricingFederalExciseTax = pricingFederalExciseTax;
			this.pricingCost = pricingCost;
		}
	    
	    

		public ManufacturerPricingRequestDTO() {
			super();
			// TODO Auto-generated constructor stub
		}



		public Integer getPricingId() {
	        return pricingId;
	    }

	    public void setPricingId(Integer pricingId) {
	        this.pricingId = pricingId;
	    }

	    public BigDecimal getPricingList() {
	        return pricingList;
	    }

	    public void setPricingList(BigDecimal pricingList) {
	        this.pricingList = pricingList;
	    }

	    public BigDecimal getPricingMsrp() {
	        return pricingMsrp;
	    }

	    public void setPricingMsrp(BigDecimal pricingMsrp) {
	        this.pricingMsrp = pricingMsrp;
	    }

	    public BigDecimal getPricingRmap() {
	        return pricingRmap;
	    }

	    public void setPricingRmap(BigDecimal pricingRmap) {
	        this.pricingRmap = pricingRmap;
	    }

	    public BigDecimal getPricingWholesalePrice() {
	        return pricingWholesalePrice;
	    }

	    public void setPricingWholesalePrice(BigDecimal pricingWholesalePrice) {
	        this.pricingWholesalePrice = pricingWholesalePrice;
	    }

	    public BigDecimal getPricingFederalExciseTax() {
	        return pricingFederalExciseTax;
	    }

	    public void setPricingFederalExciseTax(BigDecimal pricingFederalExciseTax) {
	        this.pricingFederalExciseTax = pricingFederalExciseTax;
	    }

	    public BigDecimal getPricingCost() {
	        return pricingCost;
	    }

	    public void setPricingCost(BigDecimal pricingCost) {
	        this.pricingCost = pricingCost;
	    }
}