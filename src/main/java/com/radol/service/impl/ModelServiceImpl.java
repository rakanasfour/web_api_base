package com.radol.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.radol.dto.ModelDTO;
import com.radol.dto.ModelRequestDTO;
import com.radol.mapper.ModelMapper;
import com.radol.model.Brand;
import com.radol.model.Model;
import com.radol.repository.BrandRepository;
import com.radol.repository.ModelRepository;
import com.radol.service.ModelService;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ModelServiceImpl implements ModelService {
    @Autowired
    private final ModelRepository modelRepository;
    private final ModelMapper modelMapper;
    private BrandRepository brandRepository;
    


    public ModelServiceImpl(ModelRepository modelRepository, ModelMapper modelMapper, BrandRepository brandRepository) {
		super();
		this.modelRepository = modelRepository;
		this.modelMapper = modelMapper;
		this.brandRepository = brandRepository;
	}

	@Override
    public ModelDTO save(ModelDTO dto) {
        Model model = modelMapper.toEntity(dto);
        return modelMapper.toDTO(modelRepository.save(model));
    }

    @Override
    public ModelDTO findById(Integer id) {
        return modelRepository.findById(id)
                .map(modelMapper::toDTO)
                .orElseThrow(() -> new RuntimeException("Model not found"));
    }

    @Override
    public List<ModelDTO> findAll() {
        return modelRepository.findAll().stream()
                .map(modelMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ModelDTO update(Integer id, ModelDTO dto) {
        Model model = modelMapper.toEntity(dto);
        model.setModelId(id);
        return modelMapper.toDTO(modelRepository.save(model));
    }

    @Override
    public void deleteById(Integer id) {
        modelRepository.deleteById(id);
    }

	@Override
	public ModelDTO saveModelRequest(ModelRequestDTO dto) {
		// Validate brandId in the DTO
	    if (dto.getBrand() == null) {
	        throw new IllegalArgumentException("Brand ID cannot be null");
	    }
	    
	    // Fetch the Brand entity
	    Brand brand = brandRepository.findById(dto.getBrand())
	            .orElseThrow(() -> new EntityNotFoundException("Brand not found with ID: " + dto.getBrand()));

	    
		Model model = new Model();
		model.setModelName(dto.getModelName());
		model.setModelDescription(dto.getModelDescription());
		
		
		model.setBrand(brand);
		return modelMapper.toDTO(model); //
	}
}
