package com.radol.service;

import com.radol.dto.SalesCategoryDTO;
import com.radol.dto.request.SalesCategoryRequestDTO;
import com.radol.model.SalesCategory;

public interface SalesCategoryService  extends CrudService<SalesCategoryDTO, SalesCategory, Integer>  {

	

	
    public SalesCategoryDTO saveSalesCategoryRequest(SalesCategoryRequestDTO dto);
	   
}