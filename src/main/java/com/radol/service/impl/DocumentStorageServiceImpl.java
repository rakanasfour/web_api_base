package com.radol.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.radol.dto.DocumentStorageDTO;
import com.radol.mapper.DocumentStorageMapper;
import com.radol.model.DocumentStorage;
import com.radol.repository.DocumentStorageRepository;
import com.radol.service.DocumentStorageService;


@Service
public class DocumentStorageServiceImpl implements DocumentStorageService {
    @Autowired
    private final DocumentStorageRepository documentStorageRepository;
    private final DocumentStorageMapper documentStorageMapper;

    public DocumentStorageServiceImpl(DocumentStorageRepository documentStorageRepository, DocumentStorageMapper documentStorageMapper) {
        this.documentStorageRepository = documentStorageRepository;
        this.documentStorageMapper = documentStorageMapper;
    }

    @Override
    public DocumentStorageDTO save(DocumentStorageDTO dto) {
        DocumentStorage documentStorage = documentStorageMapper.toEntity(dto);
        return documentStorageMapper.toDTO(documentStorageRepository.save(documentStorage));
    }

    @Override
    public DocumentStorageDTO findById(Integer id) {
        return documentStorageRepository.findById(id)
                .map(documentStorageMapper::toDTO)
                .orElseThrow(() -> new RuntimeException("DocumentStorage not found"));
    }

    @Override
    public List<DocumentStorageDTO> findAll() {
        return documentStorageRepository.findAll().stream()
                .map(documentStorageMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public DocumentStorageDTO update(Integer id, DocumentStorageDTO dto) {
        DocumentStorage documentStorage = documentStorageMapper.toEntity(dto);
        documentStorage.setDocumentStorageId(id);
        return documentStorageMapper.toDTO(documentStorageRepository.save(documentStorage));
    }

    @Override
    public void deleteById(Integer id) {
        documentStorageRepository.deleteById(id);
    }
}
