package com.radol.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.radol.model.BrandPicture;
import com.radol.service.impl.BrandPictureServiceImpl;

@RestController
@RequestMapping("/api/brand-picture")
public class BrandPictureController {

	private final BrandPictureServiceImpl brandPictureServiceImpl;
	
	
	
    public BrandPictureController(BrandPictureServiceImpl brandPictureServiceImpl) {
		super();
		this.brandPictureServiceImpl = brandPictureServiceImpl;
	}


	@GetMapping
    public Page<BrandPicture> findAll(@RequestParam int page, @RequestParam int size) {
        return brandPictureServiceImpl.findAll(page,size);
    }
	
	
	
	
	
}

