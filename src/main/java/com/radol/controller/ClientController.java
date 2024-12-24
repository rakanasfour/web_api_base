package com.radol.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

public interface ClientController {
    ResponseEntity<List<Object>> getAll();
    ResponseEntity<Object> getById(Integer id);
    ResponseEntity<List<Object>> searchItems(String item);
}