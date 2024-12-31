package com.radol.dto.response;

import java.math.BigDecimal;
import java.util.List;

import com.radol.dto.ChannelDTO;
import com.radol.dto.ManufacturerPricingDTO;
import com.radol.dto.PackagingDTO;
import com.radol.dto.UomPictureDTO;
import com.radol.model.Uom.UomStatus;
import com.radol.model.Uom.UomType;

public class UomResponseDTO {


	  private Integer uomId;
	    private UomType uomType;
	    private UomType uomSubType;
	    private Integer uomQuantity;
	    private Integer uomLevel;
	    private BigDecimal uomWeight;
	    private UomStatus uomStatus;
	    private String uomManufacturerBarcode;
	    private String uomInternalBarcode;
	    private Integer shippingDimensionId;
	    private PackagingDTO packagingId;
	    private List<UomPictureDTO>uompictures;
	    private Integer itemId;
	    private List<ChannelDTO> uomChannels;
	    private ManufacturerPricingDTO manufacturerPricing;
	    
		public UomResponseDTO(Integer uomId, UomType uomType, UomType uomSubType, Integer uomQuantity, Integer uomLevel,
				BigDecimal uomWeight, UomStatus uomStatus, String uomManufacturerBarcode, String uomInternalBarcode,
				Integer shippingDimensionId, PackagingDTO packagingId, List<UomPictureDTO> uompictures, Integer itemId,
				List<ChannelDTO> uomChannels, ManufacturerPricingDTO manufacturerPricing) {
			super();
			this.uomId = uomId;
			this.uomType = uomType;
			this.uomSubType = uomSubType;
			this.uomQuantity = uomQuantity;
			this.uomLevel = uomLevel;
			this.uomWeight = uomWeight;
			this.uomStatus = uomStatus;
			this.uomManufacturerBarcode = uomManufacturerBarcode;
			this.uomInternalBarcode = uomInternalBarcode;
			this.shippingDimensionId = shippingDimensionId;
			this.packagingId = packagingId;
			this.uompictures = uompictures;
			this.itemId = itemId;
			this.uomChannels = uomChannels;
			this.manufacturerPricing = manufacturerPricing;
		}

		public UomResponseDTO() {
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

		public Integer getUomLevel() {
			return uomLevel;
		}

		public void setUomLevel(Integer uomLevel) {
			this.uomLevel = uomLevel;
		}

		public BigDecimal getUomWeight() {
			return uomWeight;
		}

		public void setUomWeight(BigDecimal uomWeight) {
			this.uomWeight = uomWeight;
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

		public Integer getShippingDimensionId() {
			return shippingDimensionId;
		}

		public void setShippingDimensionId(Integer shippingDimensionId) {
			this.shippingDimensionId = shippingDimensionId;
		}

		public PackagingDTO getPackagingId() {
			return packagingId;
		}

		public void setPackagingId(PackagingDTO packagingId) {
			this.packagingId = packagingId;
		}

		public List<UomPictureDTO> getUompictures() {
			return uompictures;
		}

		public void setUompictures(List<UomPictureDTO> uompictures) {
			this.uompictures = uompictures;
		}

		public Integer getItemId() {
			return itemId;
		}

		public void setItemId(Integer itemId) {
			this.itemId = itemId;
		}

		public List<ChannelDTO> getUomChannels() {
			return uomChannels;
		}

		public void setUomChannels(List<ChannelDTO> uomChannels) {
			this.uomChannels = uomChannels;
		}

		public ManufacturerPricingDTO getManufacturerPricing() {
			return manufacturerPricing;
		}

		public void setManufacturerPricing(ManufacturerPricingDTO manufacturerPricing) {
			this.manufacturerPricing = manufacturerPricing;
		}
		
	    
}
