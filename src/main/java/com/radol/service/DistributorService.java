package com.radol.service;

import com.radol.dto.DistributorDTO;
import com.radol.dto.request.DistributorRequestDTO;
import com.radol.model.Distributor;

public interface DistributorService  extends CrudService<DistributorDTO, Distributor, Integer>  {


	public DistributorDTO saveDistributorRequest(DistributorRequestDTO dto);
		   
	}