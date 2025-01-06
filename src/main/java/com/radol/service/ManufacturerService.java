package com.radol.service;

import com.radol.dto.ManufacturerDTO;
import com.radol.dto.request.ManufacturerRequestDTO;
import com.radol.model.Manufacturer;

public interface ManufacturerService  extends CrudService<ManufacturerDTO, Manufacturer, Integer>  {

    ManufacturerDTO updateManufacturer(Integer id, ManufacturerRequestDTO dto);

	
	public ManufacturerDTO saveManufacturerRequest(ManufacturerRequestDTO dto);

	   
}