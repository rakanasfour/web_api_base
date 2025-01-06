package com.radol.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.radol.dto.ShippingDimensionDTO;
import com.radol.dto.request.ShippingDimensionRequestDTO;
import com.radol.mapper.ShippingDimensionMapper;
import com.radol.model.ShippingDimension;
import com.radol.repository.ShippingDimensionRepository;
import com.radol.service.ShippingDimensionService;

@Service
public class ShippingDimensionServiceImpl implements ShippingDimensionService {
    @Autowired
    private final ShippingDimensionRepository shippingDimensionRepository;
    private final ShippingDimensionMapper shippingDimensionMapper;

    public ShippingDimensionServiceImpl(ShippingDimensionRepository shippingDimensionRepository, ShippingDimensionMapper shippingDimensionMapper) {
        this.shippingDimensionRepository = shippingDimensionRepository;
        this.shippingDimensionMapper = shippingDimensionMapper;
    }

    @Override
    public ShippingDimensionDTO save(ShippingDimensionDTO dto) {
        ShippingDimension shippingDimension = shippingDimensionMapper.toEntity(dto);
        return shippingDimensionMapper.toDTO(shippingDimensionRepository.save(shippingDimension));
    }

    @Override
    public ShippingDimensionDTO findById(Integer id) {
        return shippingDimensionRepository.findById(id)
                .map(shippingDimensionMapper::toDTO)
                .orElseThrow(() -> new RuntimeException("ShippingDimension not found"));
    }

    @Override
    public List<ShippingDimensionDTO> findAll() {
        return shippingDimensionRepository.findAll().stream()
                .map(shippingDimensionMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ShippingDimensionDTO update(Integer id, ShippingDimensionDTO dto) {
        ShippingDimension shippingDimension = shippingDimensionMapper.toEntity(dto);
        shippingDimension.setShippingDimensionId(id);
        return shippingDimensionMapper.toDTO(shippingDimensionRepository.save(shippingDimension));
    }

    @Override
    public void deleteById(Integer id) {
        shippingDimensionRepository.deleteById(id);
    }
    
    @Override
    public ShippingDimensionDTO updateShippingDimension(Integer id, ShippingDimensionRequestDTO dto) {
        ShippingDimension shippingDimension = new ShippingDimension();
        shippingDimension.setShippingDimensionId(id);
        shippingDimension.setHeight(dto.getHeight());
        shippingDimension.setWidth(dto.getWidth());
        shippingDimension.setLength(dto.getLength());
        shippingDimension.setWeight(dto.getWeight());
        return shippingDimensionMapper.toDTO(shippingDimensionRepository.save(shippingDimension));
    }
}