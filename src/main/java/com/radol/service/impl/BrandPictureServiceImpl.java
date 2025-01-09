package com.radol.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.radol.model.BrandPicture;
import com.radol.repository.BrandPictureRepository;
import com.radol.repository.BrandPictureRepositoryPaging;
@Service
public class BrandPictureServiceImpl {

	
	private final BrandPictureRepositoryPaging brandPictureRepositoryPaging;

	public BrandPictureServiceImpl(BrandPictureRepositoryPaging brandPictureRepositoryPaging) {
		super();
		this.brandPictureRepositoryPaging = brandPictureRepositoryPaging;
	}
	
	
	
	public Page<BrandPicture> findAll(int page, int size){
		
		
		PageRequest pr = PageRequest.of(page, size);
		return brandPictureRepositoryPaging.findAll(pr);
	}
	
	
	
	
	
}
