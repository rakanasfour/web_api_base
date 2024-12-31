package com.radol.service;

import com.radol.dto.ManufacturerDTO;
import com.radol.dto.request.ManufacturerRequestDTO;
import com.radol.model.Manufacturer;

public interface ManufacturerService  extends CrudService<ManufacturerDTO, Manufacturer, Integer>  {

	
	public ManufacturerDTO saveManufacturerRequest(ManufacturerRequestDTO dto);

	   
}