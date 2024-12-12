package com.radol.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.radol.dto.ManufacturerFacilityDTO;
import com.radol.mapper.ManufacturerFacilityMapper;
import com.radol.model.ManufacturerFacility;
import com.radol.repository.ManufacturerFacilityRepository;
import com.radol.service.ManufacturerFacilityService;

@Service
public class ManufacturerFacilityServiceImpl implements ManufacturerFacilityService {
    @Autowired
    private final ManufacturerFacilityRepository manufacturerFacilityRepository;
    private final ManufacturerFacilityMapper manufacturerFacilityMapper;

    public ManufacturerFacilityServiceImpl(ManufacturerFacilityRepository manufacturerFacilityRepository, ManufacturerFacilityMapper manufacturerFacilityMapper) {
        this.manufacturerFacilityRepository = manufacturerFacilityRepository;
        this.manufacturerFacilityMapper = manufacturerFacilityMapper;
    }

    @Override
    public ManufacturerFacilityDTO save(ManufacturerFacilityDTO dto) {
        ManufacturerFacility manufacturerFacility = manufacturerFacilityMapper.toEntity(dto);
        return manufacturerFacilityMapper.toDTO(manufacturerFacilityRepository.save(manufacturerFacility));
    }

    @Override
    public ManufacturerFacilityDTO findById(Integer id) {
        return manufacturerFacilityRepository.findById(id)
                .map(manufacturerFacilityMapper::toDTO)
                .orElseThrow(() -> new RuntimeException("ManufacturerFacility not found"));
    }

    @Override
    public List<ManufacturerFacilityDTO> findAll() {
        return manufacturerFacilityRepository.findAll().stream()
                .map(manufacturerFacilityMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ManufacturerFacilityDTO update(Integer id, ManufacturerFacilityDTO dto) {
        ManufacturerFacility manufacturerFacility = manufacturerFacilityMapper.toEntity(dto);
        manufacturerFacility.setFacilityId(id);
        return manufacturerFacilityMapper.toDTO(manufacturerFacilityRepository.save(manufacturerFacility));
    }

    @Override
    public void deleteById(Integer id) {
        manufacturerFacilityRepository.deleteById(id);
    }
}
