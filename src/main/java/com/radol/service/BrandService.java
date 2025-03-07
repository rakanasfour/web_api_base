package com.radol.service;

import java.util.List;

import com.radol.dto.BrandDTO;
import com.radol.dto.BrandModelDTO;
import com.radol.dto.request.BrandRequestDTO;
import com.radol.model.Brand;

public interface BrandService  extends CrudService<BrandDTO, Brand, Integer>  {
	 List<BrandModelDTO> getAllBrandsWithModels();
	 
	 List<BrandDTO> getAllBrandsWithModelList();
	 

	 BrandDTO updateBrand(Integer id, BrandRequestDTO dto);


	

	   
}