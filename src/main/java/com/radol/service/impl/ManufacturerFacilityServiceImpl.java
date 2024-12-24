package com.radol.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.radol.dto.ManufacturerFacilityDTO;
import com.radol.dto.ManufacturerFacilityRequestDTO;
import com.radol.mapper.ManufacturerFacilityMapper;
import com.radol.model.Manufacturer;
import com.radol.model.ManufacturerFacility;
import com.radol.repository.ManufacturerFacilityRepository;
import com.radol.repository.ManufacturerRepository;
import com.radol.service.ManufacturerFacilityService;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ManufacturerFacilityServiceImpl implements ManufacturerFacilityService {
    @Autowired
    private final ManufacturerFacilityRepository manufacturerFacilityRepository;
    private final ManufacturerRepository manufacturerRepository;
    private final ManufacturerFacilityMapper manufacturerFacilityMapper;
    
    
    public ManufacturerFacilityServiceImpl(ManufacturerFacilityRepository manufacturerFacilityRepository,
			ManufacturerRepository manufacturerRepository, ManufacturerFacilityMapper manufacturerFacilityMapper) {
		super();
		this.manufacturerFacilityRepository = manufacturerFacilityRepository;
		this.manufacturerRepository = manufacturerRepository;
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
    
    @Override
    public ManufacturerFacilityDTO saveFacilityRequest(ManufacturerFacilityRequestDTO dto) {
    	
    	if(dto.getManufacturerId()==null) {
    		throw new IllegalArgumentException("Manufacturer Id cannot be null");
    	}
    	Manufacturer manufacturer = manufacturerRepository.findById(dto.getManufacturerId())
				.orElseThrow(()-> new EntityNotFoundException("Manufacturer not found with ID:" + dto.getManufacturerId()));
    	ManufacturerFacility facility = new ManufacturerFacility();
    	facility.setFacilityName(dto.getFacilityName());
    	facility.setFacilityCountry(dto.getFacilityCountry());
    	facility.setStatus(dto.getStatus());
    	facility.setManufacturer(manufacturer);

    	return manufacturerFacilityMapper.toDTO(facility);
    	
    }
    
    
}
