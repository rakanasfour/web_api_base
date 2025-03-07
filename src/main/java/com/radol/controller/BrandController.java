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

import com.radol.dto.BrandDTO;
import com.radol.dto.BrandModelDTO;
import com.radol.dto.request.BrandRequestDTO;
import com.radol.service.BrandService;

@RestController
@RequestMapping("/api/brands")
public class BrandController implements CrudController<BrandDTO, Integer> {

    private final BrandService brandService;

    public BrandController(BrandService brandService) {
        this.brandService = brandService;
    }

    
    @GetMapping
    @Override
    public ResponseEntity<List<BrandDTO>> getAll() {
        List<BrandDTO> brands = brandService.findAll();
        return new ResponseEntity<>(brands, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<BrandDTO> getById(@PathVariable Integer id) {
        BrandDTO brand = brandService.findById(id);
        return new ResponseEntity<>(brand, HttpStatus.OK);
    }

    @PostMapping
    @Override
    public ResponseEntity<BrandDTO> create(@RequestBody BrandDTO dto) {
        BrandDTO brand = brandService.save(dto);
        return new ResponseEntity<>(brand, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    @Override
    public ResponseEntity<BrandDTO> update(@PathVariable Integer id, @RequestBody BrandDTO dto) {
        BrandDTO brand = brandService.update(id, dto);
        return new ResponseEntity<>(brand, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    @Override
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        brandService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @GetMapping("/models-brand")
    public ResponseEntity<List<BrandModelDTO>> getAllBrandsWithModels() {
        List<BrandModelDTO> brandModelDTOs = brandService.getAllBrandsWithModels();
        return ResponseEntity.ok(brandModelDTOs);
    }
    
    @GetMapping("/list/models-brand")
    public ResponseEntity<List<BrandDTO>> getAllBrandsWithModelList() {
        List<BrandDTO> brandDTOs = brandService.getAllBrandsWithModelList();
        return ResponseEntity.ok(brandDTOs);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<BrandDTO> updateBrand(@PathVariable Integer id, @RequestBody BrandRequestDTO dto) {
        BrandDTO brandDTO = brandService.updateBrand(id, dto);
        return new ResponseEntity<>(brandDTO, HttpStatus.OK);
    }

}
