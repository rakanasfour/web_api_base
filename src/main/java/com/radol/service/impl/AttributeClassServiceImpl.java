package com.radol.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.radol.dto.AttributeClassDTO;
import com.radol.mapper.AttributeClassMapper;
import com.radol.model.AttributeClass;
import com.radol.repository.AttributeClassRepository;
import com.radol.service.AttributeClassService;

@Service
public class AttributeClassServiceImpl implements AttributeClassService {
	
	
    @Autowired
    private final AttributeClassRepository attributeClassRepository;
    private final AttributeClassMapper attributeClasMapper;

 
    

    public AttributeClassServiceImpl(AttributeClassRepository attributeClassRepository,
			AttributeClassMapper attributeClasMapper) {
		super();
		this.attributeClassRepository = attributeClassRepository;
		this.attributeClasMapper = attributeClasMapper;
	}

	@Override
    public AttributeClassDTO save(AttributeClassDTO dto) {
		AttributeClass attributeClass = attributeClasMapper.toEntity(dto);
        return attributeClasMapper.toDTO(attributeClassRepository.save(attributeClass));
    }

    @Override
    public AttributeClassDTO findById(Integer id) {
        return attributeClassRepository.findById(id)
                .map(attributeClasMapper::toDTO)
                .orElseThrow(() -> new RuntimeException("AttributeClass not found"));
    }

    @Override
    public List<AttributeClassDTO> findAll() {
        return attributeClassRepository.findAll().stream()
                .map(attributeClasMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public AttributeClassDTO update(Integer id, AttributeClassDTO dto) {
    	AttributeClass attributeClass = attributeClasMapper.toEntity(dto);
        attributeClass.setAttributeClassId(id);
        return attributeClasMapper.toDTO(attributeClassRepository.save(attributeClass));
    }
    
    @Override
    public void deleteById(Integer id) {
    	attributeClassRepository.deleteById(id);
    }



   
}
