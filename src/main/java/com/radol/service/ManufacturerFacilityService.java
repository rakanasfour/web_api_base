package com.radol.service;

import com.radol.dto.ManufacturerFacilityDTO;
import com.radol.dto.ManufacturerFacilityRequestDTO;
import com.radol.model.ManufacturerFacility;

public interface ManufacturerFacilityService  extends CrudService<ManufacturerFacilityDTO, ManufacturerFacility, Integer>  {

	
    public ManufacturerFacilityDTO saveFacilityRequest(ManufacturerFacilityRequestDTO dto);

	

	   
}