package com.radol.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.radol.dto.BrandDTO;
import com.radol.dto.BrandModelDTO;
import com.radol.mapper.BrandMapper;
import com.radol.model.Brand;
import com.radol.repository.BrandRepository;
import com.radol.service.BrandService;

@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private final BrandRepository brandRepository;
    private final BrandMapper brandMapper;

    public BrandServiceImpl(BrandRepository brandRepository, BrandMapper brandMapper) {
        this.brandRepository = brandRepository;
        this.brandMapper = brandMapper;
    }

    @Override
    public BrandDTO save(BrandDTO dto) {
        Brand brand = brandMapper.toEntity(dto);
        return brandMapper.toDTO(brandRepository.save(brand));
    }

    @Override
    public BrandDTO findById(Integer id) {
        return brandRepository.findById(id)
                .map(brandMapper::toDTO)
                .orElseThrow(() -> new RuntimeException("Brand not found"));
    }

    @Override
    public List<BrandDTO> findAll() {
        return brandRepository.findAll().stream()
                .map(brandMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public BrandDTO update(Integer id, BrandDTO dto) {
        Brand brand = brandMapper.toEntity(dto);
        brand.setBrandId(id);
        return brandMapper.toDTO(brandRepository.save(brand));
    }

    @Override
    public void deleteById(Integer id) {
        brandRepository.deleteById(id);
    }
    
    @Override
    public List<BrandModelDTO> getAllBrandsWithModels() {
        return brandRepository.findAllBrandsWithModels();
    }
    
    @Override
    public List<BrandDTO> getAllBrandsWithModelList() {
        List<Brand> brands = brandRepository.findAllBrandsWithModelList();
        return brands.stream()
                     .map(brandMapper::toDTO)
                     .collect(Collectors.toList());
    }
    

    
}
