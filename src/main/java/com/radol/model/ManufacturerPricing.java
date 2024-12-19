package com.radol.model;



import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "manufacturer_pricing")
public class ManufacturerPricing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "m_pricing_id", columnDefinition = "INT UNSIGNED")
    private Integer pricingId;

    @Column(name = "m_pricing_list")
    private BigDecimal pricingList;

    @Column(name = "m_pricing_msrp")
    private BigDecimal pricingMsrp;

    @Column(name = "m_pricing_rmap")
    private BigDecimal pricingRmap;

    @Column(name = "m_pricing_wholesale_price")
    private BigDecimal pricingWholesalePrice;

    @Column(name = "m_pricing_federal_excise_tax")
    private BigDecimal pricingFederalExciseTax;

    @Column(name = "m_pricing_cost")
    private BigDecimal pricingCost;

    // One-to-one relationship with Uom
    @OneToOne(mappedBy = "manufacturerPricing")
    private Uom uom;

	public ManufacturerPricing(Integer pricingId, BigDecimal pricingList, BigDecimal pricingMsrp,
			BigDecimal pricingRmap, BigDecimal pricingWholesalePrice, BigDecimal pricingFederalExciseTax,
			BigDecimal pricingCost, Uom uom) {
		super();
		this.pricingId = pricingId;
		this.pricingList = pricingList;
		this.pricingMsrp = pricingMsrp;
		this.pricingRmap = pricingRmap;
		this.pricingWholesalePrice = pricingWholesalePrice;
		this.pricingFederalExciseTax = pricingFederalExciseTax;
		this.pricingCost = pricingCost;
		this.uom = uom;
	}

	public ManufacturerPricing() {
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

	public Uom getUom() {
		return uom;
	}

	public void setUom(Uom uom) {
		this.uom = uom;
	}
    
    
    
    
}

