package com.radol.mapper;

import org.mapstruct.Mapper;

import com.radol.dto.DistributorDTO;
import com.radol.model.Distributor;

@Mapper(componentModel = "spring")
	public interface DistributorMapper extends EntityMapper<DistributorDTO, Distributor> {
		

	}
