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

import com.radol.dto.ClassDTO;
import com.radol.dto.request.ClassRequestDTO;
import com.radol.service.ClassService;

@RestController
@RequestMapping("/api/classes")
public class ClassController implements CrudController<ClassDTO, Integer> {

    private final ClassService classService;

    
    
    public ClassController(ClassService classService) {
		super();
		this.classService = classService;
	}

	@GetMapping
    @Override
    public ResponseEntity<List<ClassDTO>> getAll() {
        List<ClassDTO> classEntity = classService.findAll();
        return new ResponseEntity<>(classEntity, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<ClassDTO> getById(@PathVariable Integer id) {
    	ClassDTO classEntity = classService.findById(id);
        return new ResponseEntity<>(classEntity, HttpStatus.OK);
    }

    @PostMapping
    @Override
    public ResponseEntity<ClassDTO> create(@RequestBody ClassDTO dto) {
    	ClassDTO classEntity = classService.save(dto);
        return new ResponseEntity<>(classEntity, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    @Override
    public ResponseEntity<ClassDTO> update(@PathVariable Integer id, @RequestBody ClassDTO dto) {
    	ClassDTO classEntity = classService.update(id, dto);
        return new ResponseEntity<>(classEntity, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    @Override
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
    	classService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
    @PostMapping("/request")
    public ResponseEntity<ClassDTO> sendRequest(@RequestBody ClassRequestDTO dto) {
    	ClassDTO classEntity = classService.saveClassRequest(dto);
        return new ResponseEntity<>(classEntity, HttpStatus.CREATED);
    }
}
