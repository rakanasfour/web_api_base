package com.radol.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.radol.dto.ModelPictureDTO;
import com.radol.mapper.ModelPictureMapper;
import com.radol.model.ModelPicture;
import com.radol.repository.ModelPictureRepository;
import com.radol.service.ModelPictureService;

@Service
public class ModelPictureServiceImpl implements ModelPictureService {
    @Autowired
    private final ModelPictureRepository modelPictureRepository;
    private final ModelPictureMapper modelPictureMapper;

    public ModelPictureServiceImpl(ModelPictureRepository modelPictureRepository, ModelPictureMapper modelPictureMapper) {
        this.modelPictureRepository = modelPictureRepository;
        this.modelPictureMapper = modelPictureMapper;
    }

    @Override
    public ModelPictureDTO save(ModelPictureDTO dto) {
        ModelPicture modelPicture = modelPictureMapper.toEntity(dto);
        return modelPictureMapper.toDTO(modelPictureRepository.save(modelPicture));
    }

    @Override
    public ModelPictureDTO findById(Integer id) {
        return modelPictureRepository.findById(id)
                .map(modelPictureMapper::toDTO)
                .orElseThrow(() -> new RuntimeException("ModelPicture not found"));
    }

    @Override
    public List<ModelPictureDTO> findAll() {
        return modelPictureRepository.findAll().stream()
                .map(modelPictureMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ModelPictureDTO update(Integer id, ModelPictureDTO dto) {
        ModelPicture modelPicture = modelPictureMapper.toEntity(dto);
        modelPicture.setModelPictureId(id);
        return modelPictureMapper.toDTO(modelPictureRepository.save(modelPicture));
    }

    @Override
    public void deleteById(Integer id) {
        modelPictureRepository.deleteById(id);
    }
}