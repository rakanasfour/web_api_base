package com.radol.mapper.channel;

import org.mapstruct.Mapper;

import com.radol.dto.response.BrandModelResponseDTO;
import com.radol.model.Brand;
import com.radol.model.Model;

@Mapper(componentModel = "spring")
public interface BrandModelMapperChannel {
    BrandModelResponseDTO toDTO(Brand brand, Model model);
}
