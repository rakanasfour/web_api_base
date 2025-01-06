package com.radol.service;

import com.radol.dto.ManufacturerPricingDTO;
import com.radol.dto.request.ManufacturerPricingRequestDTO;
import com.radol.model.ManufacturerPricing;

public interface ManufacturerPricingService  extends CrudService<ManufacturerPricingDTO, ManufacturerPricing, Integer>  {

	
    ManufacturerPricingDTO updateManufacturerPricing(Integer id, ManufacturerPricingRequestDTO dto);


	   
}