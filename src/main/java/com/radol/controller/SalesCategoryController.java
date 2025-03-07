package com.radol.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.radol.dto.ManufacturerFacilityDTO;
import com.radol.dto.SalesCategoryDTO;
import com.radol.dto.request.SalesCategoryRequestDTO;
import com.radol.service.SalesCategoryService;

@RestController
@RequestMapping("/api/sales-categories")
public class SalesCategoryController implements CrudController<SalesCategoryDTO, Integer> {

    private final SalesCategoryService salesCategoryService;

    public SalesCategoryController(SalesCategoryService salesCategoryService) {
        this.salesCategoryService = salesCategoryService;
    }

    @GetMapping
    @Override
    public ResponseEntity<List<SalesCategoryDTO>> getAll() {
        List<SalesCategoryDTO> salesCategories = salesCategoryService.findAll();
        return new ResponseEntity<>(salesCategories, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<SalesCategoryDTO> getById(@PathVariable Integer id) {
        SalesCategoryDTO salesCategory = salesCategoryService.findById(id);
        return new ResponseEntity<>(salesCategory, HttpStatus.OK);
    }

    @PostMapping
    @Override
    public ResponseEntity<SalesCategoryDTO> create(@RequestBody SalesCategoryDTO dto) {
        SalesCategoryDTO salesCategory = salesCategoryService.save(dto);
        return new ResponseEntity<>(salesCategory, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    @Override
    public ResponseEntity<SalesCategoryDTO> update(@PathVariable Integer id, @RequestBody SalesCategoryDTO dto) {
        SalesCategoryDTO salesCategory = salesCategoryService.update(id, dto);
        return new ResponseEntity<>(salesCategory, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    @Override
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        salesCategoryService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
    @PostMapping("/request")
    public ResponseEntity<SalesCategoryDTO> sendRequest(@RequestBody SalesCategoryRequestDTO dto) {
    	SalesCategoryDTO salesCategory = salesCategoryService.saveSalesCategoryRequest(dto);
        return new ResponseEntity<>(salesCategory, HttpStatus.CREATED);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<SalesCategoryDTO> updateSalesCategory(@PathVariable Integer id, @RequestBody SalesCategoryRequestDTO dto) {
        SalesCategoryDTO salesCategoryDTO = salesCategoryService.updateSalesCategory(id, dto);
        return new ResponseEntity<>(salesCategoryDTO, HttpStatus.OK);
    }
    
}
