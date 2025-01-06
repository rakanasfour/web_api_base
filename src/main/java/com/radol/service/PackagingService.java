package com.radol.service;

import com.radol.dto.PackagingDTO;
import com.radol.dto.request.PackagingRequestDTO;
import com.radol.model.Packaging;

public interface PackagingService  extends CrudService<PackagingDTO, Packaging, Integer>  {

    PackagingDTO updatePackaging(Integer id, PackagingRequestDTO dto);


		   
	}