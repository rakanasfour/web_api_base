package com.radol.service;


import com.radol.dto.ShippingDimensionDTO;

import com.radol.dto.request.ShippingDimensionRequestDTO;
import com.radol.model.ShippingDimension;

public interface ShippingDimensionService  extends CrudService<ShippingDimensionDTO, ShippingDimension, Integer>  {


    ShippingDimensionDTO updateShippingDimension(Integer id, ShippingDimensionRequestDTO dto);


		   
	}