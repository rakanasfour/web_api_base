package com.radol.service;

import com.radol.dto.UomDTO;
import com.radol.dto.request.UOMRequestDTO;
import com.radol.model.Uom;

public interface UomService  extends CrudService<UomDTO, Uom, Integer>  {

		
    UomDTO updateUom(Integer id, UOMRequestDTO dto);

		   
	}