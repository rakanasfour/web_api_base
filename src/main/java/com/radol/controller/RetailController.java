package com.radol.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.radol.dto.ItemDTO;
import com.radol.service.impl.RetailServiceImpl;



@RestController
@RequestMapping("retail/api/items")
public class RetailController {

    private final RetailServiceImpl retailServiceImpl;

    public RetailController(RetailServiceImpl retailServiceImpl) {
    	this.retailServiceImpl=retailServiceImpl;
    	}

    @GetMapping
    public ResponseEntity<List<ItemDTO>> getAll() {
        List<ItemDTO> items = retailServiceImpl.findAll();
        return new ResponseEntity<>(items, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ItemDTO> getById(@PathVariable Integer id) {
        ItemDTO item = retailServiceImpl.findById(id);
        return ResponseEntity.ok(item); 
    }

    @GetMapping("/search")
    public ResponseEntity<List<ItemDTO>> searchItems(@RequestParam String item) {
        List<ItemDTO> items = retailServiceImpl.searchByItemName(item);
        return ResponseEntity.ok(items);
    }
   

}

