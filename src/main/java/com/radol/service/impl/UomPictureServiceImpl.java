package com.radol.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.radol.dto.UomPictureDTO;
import com.radol.dto.request.UOMPictureRequestDTO;
import com.radol.mapper.UomPictureMapper;
import com.radol.model.UomPicture;
import com.radol.repository.UomPictureRepository;
import com.radol.service.UomPictureService;

@Service
public class UomPictureServiceImpl implements UomPictureService {
    @Autowired
    private final UomPictureRepository uomPictureRepository;
    private final UomPictureMapper uomPictureMapper;

    public UomPictureServiceImpl(UomPictureRepository uomPictureRepository, UomPictureMapper uomPictureMapper) {
        this.uomPictureRepository = uomPictureRepository;
        this.uomPictureMapper = uomPictureMapper;
    }

    @Override
    public UomPictureDTO save(UomPictureDTO dto) {
        UomPicture uomPicture = uomPictureMapper.toEntity(dto);
        return uomPictureMapper.toDTO(uomPictureRepository.save(uomPicture));
    }

    @Override
    public UomPictureDTO findById(Integer id) {
        return uomPictureRepository.findById(id)
                .map(uomPictureMapper::toDTO)
                .orElseThrow(() -> new RuntimeException("UomPicture not found"));
    }

    @Override
    public List<UomPictureDTO> findAll() {
        return uomPictureRepository.findAll().stream()
                .map(uomPictureMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public UomPictureDTO update(Integer id, UomPictureDTO dto) {
        UomPicture uomPicture = uomPictureMapper.toEntity(dto);
        uomPicture.setUomPictureId(id);
        return uomPictureMapper.toDTO(uomPictureRepository.save(uomPicture));
    }

    @Override
    public void deleteById(Integer id) {
        uomPictureRepository.deleteById(id);
    }
    
    @Override
    public UomPictureDTO updateUomPicture(Integer id, UOMPictureRequestDTO dto) {
        UomPicture uomPicture = new UomPicture();
        uomPicture.setUomPictureId(id);
        uomPicture.setUomPictureName(dto.getUomPictureName());
        uomPicture.setUomPictureLink(dto.getUomPictureLink());
        return uomPictureMapper.toDTO(uomPictureRepository.save(uomPicture));
    }
}
