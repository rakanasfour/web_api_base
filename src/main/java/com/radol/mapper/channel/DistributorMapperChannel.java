package com.radol.mapper.channel;

import org.mapstruct.Mapper;

import com.radol.dto.response.DistributorResponseDTO;
import com.radol.model.Distributor;

@Mapper(componentModel = "spring")
	public interface DistributorMapperChannel extends EntityMapper<DistributorResponseDTO, Distributor> {
		

	}
