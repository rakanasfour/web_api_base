package com.radol.mapper;

import org.mapstruct.Mapper;

import com.radol.dto.BrandModelDTO;
import com.radol.model.Brand;
import com.radol.model.Model;

@Mapper(componentModel = "spring")
public interface BrandModelMapper {
    BrandModelDTO toDTO(Brand brand, Model model);
}
