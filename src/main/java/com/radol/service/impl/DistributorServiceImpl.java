package com.radol.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.radol.dto.DistributorDTO;
import com.radol.dto.request.DistributorRequestDTO;
import com.radol.mapper.DistributorMapper;
import com.radol.model.Distributor;
import com.radol.repository.DistributorRepository;
import com.radol.service.DistributorService;

@Service
public class DistributorServiceImpl implements DistributorService {
    @Autowired
    private final DistributorRepository distributorRepository;
    private final DistributorMapper distributorMapper;

    public DistributorServiceImpl(DistributorRepository distributorRepository, DistributorMapper distributorMapper) {
        this.distributorRepository = distributorRepository;
        this.distributorMapper = distributorMapper;
    }

    @Override
    public DistributorDTO save(DistributorDTO dto) {
        Distributor distributor = distributorMapper.toEntity(dto);
        return distributorMapper.toDTO(distributorRepository.save(distributor));
    }

    @Override
    public DistributorDTO findById(Integer id) {
        return distributorRepository.findById(id)
                .map(distributorMapper::toDTO)
                .orElseThrow(() -> new RuntimeException("Distributor not found"));
    }

    @Override
    public List<DistributorDTO> findAll() {
        return distributorRepository.findAll().stream()
                .map(distributorMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public DistributorDTO update(Integer id, DistributorDTO dto) {
        Distributor distributor = distributorMapper.toEntity(dto);
        distributor.setDistributorId(id);
        return distributorMapper.toDTO(distributorRepository.save(distributor));
    }

    @Override
    public void deleteById(Integer id) {
        distributorRepository.deleteById(id);
    }

	@Override
	public DistributorDTO saveDistributorRequest(DistributorRequestDTO dto) {

	    
		Distributor distributor = new Distributor();
		distributor.setDistributorName(dto.getDistributorName());
		distributor.setDistributorAddress(dto.getDistributorAddress());
		distributor.setDistributorCountry(dto.getDistributorCountry());
		distributor.setDistributorStatus(dto.getDistributorStatus());

		distributorRepository.save(distributor);
		return distributorMapper.toDTO(distributor); //
	}

	@Override
	public DistributorDTO updateDistributor(Integer id, DistributorRequestDTO dto) {
		Distributor distributor = new Distributor();
		distributor.setDistributorId(id);
		distributor.setDistributorName(dto.getDistributorName());
		distributor.setDistributorAddress(dto.getDistributorAddress());
		distributor.setDistributorCountry(dto.getDistributorCountry());
		distributor.setDistributorStatus(dto.getDistributorStatus());
		
		return distributorMapper.toDTO(distributorRepository.save(distributor));
	}
	
    
    
}
