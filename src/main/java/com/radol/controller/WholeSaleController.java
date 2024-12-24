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
import com.radol.service.impl.WholeSaleServiceImpl;



@RestController
@RequestMapping("wholesale/api/items")
public class WholeSaleController  {

    private final WholeSaleServiceImpl wholeSaleServiceImpl;

    public WholeSaleController(WholeSaleServiceImpl wholeSaleServiceImpl) {
        this.wholeSaleServiceImpl = wholeSaleServiceImpl;
    }

    @GetMapping
    public ResponseEntity<List<ItemDTO>> getAll() {
        List<ItemDTO> items = wholeSaleServiceImpl.findAll();
        return new ResponseEntity<>(items, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ItemDTO> getById(@PathVariable Integer id) {
        ItemDTO item = wholeSaleServiceImpl.findByIdWholeSale(id);
        return new ResponseEntity<>(item, HttpStatus.OK);
    }

   
    @GetMapping("/search")
    public ResponseEntity<List<ItemDTO>> searchItems(@RequestParam String item) {
        List<ItemDTO> items = wholeSaleServiceImpl.searchByItemName(item);
        return ResponseEntity.ok(items);
    }
   

}
