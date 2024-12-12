package com.radol.mapper;

import org.mapstruct.Mapper;

import com.radol.dto.SalesCategoryDTO;
import com.radol.model.SalesCategory;

@Mapper(componentModel = "spring")
public interface SalesCategoryMapper extends EntityMapper<SalesCategoryDTO, SalesCategory> {
	

}
