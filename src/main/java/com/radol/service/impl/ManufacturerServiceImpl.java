package com.radol.service.impl;



import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.radol.dto.ManufacturerDTO;
import com.radol.dto.request.ManufacturerRequestDTO;
import com.radol.mapper.ManufacturerFacilityMapper;
import com.radol.mapper.ManufacturerMapper;
import com.radol.model.Manufacturer;
import com.radol.model.ManufacturerFacility;
import com.radol.repository.ManufacturerRepository;
import com.radol.service.ManufacturerService;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;

@Service
public class ManufacturerServiceImpl implements ManufacturerService {
    @Autowired
    private final ManufacturerRepository manufacturerRepository;

    private final ManufacturerMapper manufacturerMapper;
    private final ManufacturerFacilityMapper manufacturerFacilityMapper;
    public ManufacturerServiceImpl(ManufacturerRepository manufacturerRepository, ManufacturerMapper manufacturerMapper
    		 ,ManufacturerFacilityMapper manufacturerFacilityMapper
    		) {
        this.manufacturerRepository = manufacturerRepository;
        this.manufacturerMapper = manufacturerMapper;
        this.manufacturerFacilityMapper = manufacturerFacilityMapper;
    }
    @Transactional
    @Override
    public ManufacturerDTO save(ManufacturerDTO dto) {
   

        Manufacturer manufacturer = manufacturerMapper.toEntity(dto);

        if (dto.getManufacturerFacilities() != null && !dto.getManufacturerFacilities().isEmpty()) {
        	System.out.println("inside the first loop");
            List<ManufacturerFacility> facilities = dto.getManufacturerFacilities().stream()
                .map(facilityDto -> {
                    ManufacturerFacility facility = manufacturerFacilityMapper.toEntity(facilityDto);
       
                    facility.setManufacturer(manufacturer); // Link facility to manufacturer
                    return facility;
                }).collect(Collectors.toList());

            manufacturer.setManufacturerFacilities(facilities);
        }

        Manufacturer savedManufacturer = manufacturerRepository.save(manufacturer);


        return manufacturerMapper.toDTO(savedManufacturer);
    }



    @Override
    public ManufacturerDTO findById(Integer id) {
        return manufacturerRepository.findById(id)
                .map(manufacturerMapper::toDTO)
                .orElseThrow(() -> new RuntimeException("Manufacturer not found"));
    }

    @Override
    public List<ManufacturerDTO> findAll() {
        return manufacturerRepository.findAll().stream()
                .map(manufacturerMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ManufacturerDTO update(Integer id, ManufacturerDTO dto) {
        Manufacturer manufacturer = manufacturerMapper.toEntity(dto);
        manufacturer.setManufacturerId(id);
        return manufacturerMapper.toDTO(manufacturerRepository.save(manufacturer));
    }

    @Override
    public void deleteById(Integer id) {
        manufacturerRepository.deleteById(id);
    }
    
    @Override
	public ManufacturerDTO saveManufacturerRequest(ManufacturerRequestDTO dto) {

    	Manufacturer manufacturer = new Manufacturer();
    	manufacturer.setManufacturerName(dto.getManufacturerName());
    	manufacturer.setManufacturerDescription(dto.getManufacturerDescription());
    	manufacturer.setManufacturerStatus(dto.getManufacturerStatus());
	    manufacturerRepository.save(manufacturer);

	    // Convert and return the DTO
	    return manufacturerMapper.toDTO(manufacturer);
	}
    
    
    @Override
    public ManufacturerDTO updateManufacturer(Integer id, ManufacturerRequestDTO dto) {
        // Retrieve the existing Manufacturer from the database
        Manufacturer existingManufacturer = manufacturerRepository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Manufacturer not found"));

        // Update only the Manufacturer's basic fields
        existingManufacturer.setManufacturerName(dto.getManufacturerName());
        existingManufacturer.setManufacturerDescription(dto.getManufacturerDescription());
        existingManufacturer.setManufacturerStatus(dto.getManufacturerStatus());

        // Save the updated Manufacturer without modifying facilities
        Manufacturer updatedManufacturer = manufacturerRepository.save(existingManufacturer);

        // Convert to DTO and return
        return manufacturerMapper.toDTO(updatedManufacturer);
    }

    
    
}
