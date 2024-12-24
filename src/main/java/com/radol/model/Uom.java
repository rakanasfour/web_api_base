package com.radol.model;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "uoms")
public class Uom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uom_id" , columnDefinition = "INT UNSIGNED")
    private Integer uomId;
    @Enumerated(EnumType.STRING)
    @Column(name = "uom_type", length = 50, nullable = false)
    private UomType uomType;
    @Enumerated(EnumType.STRING)
    @Column(name = "uom_sub_type", nullable = false)
    private UomType uomSubType;
    
    @Column(name = "uom_quantity", nullable = false)
    private Integer uomQuantity;
    
    @Column(name = "uom_weight", nullable = false)
    private BigDecimal uomWeight;
    @Column(name = "uom_level")
    private Integer uomLevel;

    @Column(name = "uom_created_at", nullable = false, updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp uomCreatedAt;

    @Column(name = "uom_updated_at", nullable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp uomUpdatedAt;

    @Column(name = "uom_updated_at_by", length = 99)
    private String uomUpdatedAtBy;

    @Enumerated(EnumType.STRING)
    @Column(name = "uom_status", nullable = false, columnDefinition = "ENUM('AVAILABLE', 'NOTAVAILABLE', 'DISCONTINUED') DEFAULT 'AVAILABLE'")
    private UomStatus uomStatus;

    public enum UomStatus {
        AVAILABLE,
        NOTAVAILABLE,
        DISCONTINUED
    }
    
    public enum UomType {
        SINGLE,
        SUB_UNIT,
        UNIT,
        CASE,
        PALLET
    }
    

    @Column(name = "uom_manufacturer_barcode", length = 55)
    private String uomManufacturerBarcode;

    @Column(name = "uom_internal_barcode", length = 55)
    private String uomInternalBarcode;

    // One-to-one relationship with ShippingDimension
    @OneToOne
    @JoinColumn(name = "uom_shipping_dimension_id", referencedColumnName = "shipping_dimension_id", unique = true)
    private ShippingDimension shippingDimension;

    // Many-to-one relationship with Packaging
    @ManyToOne
    @JoinColumn(name = "uom_packaging_id",  referencedColumnName ="packaging_id")
    private Packaging packaging;
    
	 @OneToMany(mappedBy="uompicture",cascade= CascadeType.ALL,orphanRemoval =true)
	 private List<UomPicture>uompictures;
	
    @ManyToOne
    @JoinColumn(name = "uom_item_id",  referencedColumnName ="item_id")
    private Item items;
    
    @OneToMany(mappedBy = "mappedUomChannel", cascade = CascadeType.ALL)
    private List<UomChannel> uomChannels;
    
    @OneToOne
    @JoinColumn(name = "uom_manufacturer_pricing_id", referencedColumnName = "m_pricing_id", unique = true)
    private ManufacturerPricing manufacturerPricing;

	public Uom(Integer uomId, UomType uomType, UomType uomSubType, Integer uomQuantity, BigDecimal uomWeight,
			Integer uomLevel, Timestamp uomCreatedAt, Timestamp uomUpdatedAt, String uomUpdatedAtBy,
			UomStatus uomStatus, String uomManufacturerBarcode, String uomInternalBarcode,
			ShippingDimension shippingDimension, Packaging packaging, List<UomPicture> uompictures, Item items,
			List<UomChannel> uomChannels, ManufacturerPricing manufacturerPricing) {
		super();
		this.uomId = uomId;
		this.uomType = uomType;
		this.uomSubType = uomSubType;
		this.uomQuantity = uomQuantity;
		this.uomWeight = uomWeight;
		this.uomLevel = uomLevel;
		this.uomCreatedAt = uomCreatedAt;
		this.uomUpdatedAt = uomUpdatedAt;
		this.uomUpdatedAtBy = uomUpdatedAtBy;
		this.uomStatus = uomStatus;
		this.uomManufacturerBarcode = uomManufacturerBarcode;
		this.uomInternalBarcode = uomInternalBarcode;
		this.shippingDimension = shippingDimension;
		this.packaging = packaging;
		this.uompictures = uompictures;
		this.items = items;
		this.uomChannels = uomChannels;
		this.manufacturerPricing = manufacturerPricing;
	}

	public Uom() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getUomId() {
		return uomId;
	}

	public void setUomId(Integer uomId) {
		this.uomId = uomId;
	}

	public UomType getUomType() {
		return uomType;
	}

	public void setUomType(UomType uomType) {
		this.uomType = uomType;
	}

	public UomType getUomSubType() {
		return uomSubType;
	}

	public void setUomSubType(UomType uomSubType) {
		this.uomSubType = uomSubType;
	}

	public Integer getUomQuantity() {
		return uomQuantity;
	}

	public void setUomQuantity(Integer uomQuantity) {
		this.uomQuantity = uomQuantity;
	}

	public BigDecimal getUomWeight() {
		return uomWeight;
	}

	public void setUomWeight(BigDecimal uomWeight) {
		this.uomWeight = uomWeight;
	}

	public Integer getUomLevel() {
		return uomLevel;
	}

	public void setUomLevel(Integer uomLevel) {
		this.uomLevel = uomLevel;
	}

	public Timestamp getUomCreatedAt() {
		return uomCreatedAt;
	}

	public void setUomCreatedAt(Timestamp uomCreatedAt) {
		this.uomCreatedAt = uomCreatedAt;
	}

	public Timestamp getUomUpdatedAt() {
		return uomUpdatedAt;
	}

	public void setUomUpdatedAt(Timestamp uomUpdatedAt) {
		this.uomUpdatedAt = uomUpdatedAt;
	}

	public String getUomUpdatedAtBy() {
		return uomUpdatedAtBy;
	}

	public void setUomUpdatedAtBy(String uomUpdatedAtBy) {
		this.uomUpdatedAtBy = uomUpdatedAtBy;
	}

	public UomStatus getUomStatus() {
		return uomStatus;
	}

	public void setUomStatus(UomStatus uomStatus) {
		this.uomStatus = uomStatus;
	}

	public String getUomManufacturerBarcode() {
		return uomManufacturerBarcode;
	}

	public void setUomManufacturerBarcode(String uomManufacturerBarcode) {
		this.uomManufacturerBarcode = uomManufacturerBarcode;
	}

	public String getUomInternalBarcode() {
		return uomInternalBarcode;
	}

	public void setUomInternalBarcode(String uomInternalBarcode) {
		this.uomInternalBarcode = uomInternalBarcode;
	}

	public ShippingDimension getShippingDimension() {
		return shippingDimension;
	}

	public void setShippingDimension(ShippingDimension shippingDimension) {
		this.shippingDimension = shippingDimension;
	}

	public Packaging getPackaging() {
		return packaging;
	}

	public void setPackaging(Packaging packaging) {
		this.packaging = packaging;
	}

	public List<UomPicture> getUompictures() {
		return uompictures;
	}

	public void setUompictures(List<UomPicture> uompictures) {
		this.uompictures = uompictures;
	}

	public Item getItems() {
		return items;
	}

	public void setItems(Item items) {
		this.items = items;
	}

	public List<UomChannel> getUomChannels() {
		return uomChannels;
	}

	public void setUomChannels(List<UomChannel> uomChannels) {
		this.uomChannels = uomChannels;
	}

	public ManufacturerPricing getManufacturerPricing() {
		return manufacturerPricing;
	}

	public void setManufacturerPricing(ManufacturerPricing manufacturerPricing) {
		this.manufacturerPricing = manufacturerPricing;
	}

	
    
    
}

