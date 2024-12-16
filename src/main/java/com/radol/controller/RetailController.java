package com.radol.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.radol.dto.ChannelDTO;
import com.radol.dto.DisplayPageDTO;
import com.radol.service.ItemService;



@RestController
@RequestMapping("/retails/api/channels")
public class RetailController {

	
    private final ItemService itemService;

    public RetailController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping

    public ResponseEntity<List<DisplayPageDTO>> getDisplayPage() {
        List<DisplayPageDTO> items = itemService.getDisplayPage();
        return new ResponseEntity<>(items, HttpStatus.OK);
    }
    

}
