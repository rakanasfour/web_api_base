package com.radol.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.radol.dto.ClassDTO;
import com.radol.dto.request.ClassRequestDTO;
import com.radol.mapper.ClassMapper;
import com.radol.model.ClassEntity;
import com.radol.repository.ClassRepository;
import com.radol.service.ClassService;

@Service
public class ClassServiceImpl implements ClassService {
	
    @Autowired
    private final ClassRepository classRepository;
    private final ClassMapper classMapper;

    

    public ClassServiceImpl(ClassRepository classRepository, ClassMapper classMapper) {
		super();
		this.classRepository = classRepository;
		this.classMapper = classMapper;
	}

	@Override
    public ClassDTO save(ClassDTO dto) {
        ClassEntity classEntity = classMapper.toEntity(dto);
        return classMapper.toDTO(classRepository.save(classEntity));
    }

    @Override
    public ClassDTO findById(Integer id) {
        return classRepository.findById(id)
                .map(classMapper::toDTO)
                .orElseThrow(() -> new RuntimeException("class not found"));
    }
    
    

    @Override
    public List<ClassDTO> findAll() {
        return classRepository.findAll().stream()
                .map(classMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ClassDTO update(Integer id, ClassDTO dto) {
    	ClassEntity classEntity = classMapper.toEntity(dto);
    	classEntity.setClassId(id);
        return classMapper.toDTO(classRepository.save(classEntity));
    }
    
    @Override
    public void deleteById(Integer id) {
    	classRepository.deleteById(id);
    }

	@Override
	public ClassDTO saveClassRequest(ClassRequestDTO dto) {
		
		ClassEntity classEntity = new ClassEntity();
		classEntity.setClassName(dto.getClassName());
		
		classRepository.save(classEntity);
		
		return classMapper.toDTO(classEntity);
		
		
	}

	@Override
	public ClassDTO updateClass(Integer id, ClassRequestDTO dto) {
		ClassEntity classEntity = new ClassEntity();
		classEntity.setClassId(id);
		classEntity.setClassName(dto.getClassName());
        return classMapper.toDTO(classRepository.save(classEntity));
	}

   
}
