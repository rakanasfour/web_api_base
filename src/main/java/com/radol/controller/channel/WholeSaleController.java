package com.radol.controller.channel;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.radol.dto.ItemDTO;
import com.radol.dto.response.ChannelResponseDTO;
import com.radol.dto.response.ClassResponseDTO;
import com.radol.dto.response.DistributorResponseDTO;
import com.radol.dto.response.DocumentStorageResponseDTO;
import com.radol.dto.response.ItemPictureResponseDTO;
import com.radol.dto.response.ItemResponseDTO;
import com.radol.dto.response.ManufacturerFacilityResponseDTO;
import com.radol.dto.response.ManufacturerResponseDTO;
import com.radol.dto.response.ModelResponseDTO;
import com.radol.dto.response.PackagingResponseDTO;
import com.radol.dto.response.ShippingDimensionResponseDTO;
import com.radol.dto.response.UomResponseDTO;
import com.radol.dto.response.UserResponseDTO;
import com.radol.service.impl.channel.WholeSaleServiceImpl;



@RestController
@RequestMapping("wholesale/api")
public class WholeSaleController  {

    private final WholeSaleServiceImpl wholeSaleServiceImpl;

    public WholeSaleController(WholeSaleServiceImpl wholeSaleServiceImpl) {
        this.wholeSaleServiceImpl = wholeSaleServiceImpl;
    }

    
    
    

    @GetMapping("/items")
    public ResponseEntity<List<ItemResponseDTO>> getAllItem() {
        List<ItemResponseDTO> items = wholeSaleServiceImpl.findAllItems();
        return new ResponseEntity<>(items, HttpStatus.OK);
    }
    
    
    @GetMapping("/models")
    public ResponseEntity<List<ModelResponseDTO>> getAllModels() {
        List<ModelResponseDTO> models = wholeSaleServiceImpl.findAllModels();
        return new ResponseEntity<>(models, HttpStatus.OK);
    }
    
    
    @GetMapping("/channels")
    public ResponseEntity<List<ChannelResponseDTO>> getAllChannels() {
        List<ChannelResponseDTO> channels = wholeSaleServiceImpl.findAllChannels();
        return new ResponseEntity<>(channels, HttpStatus.OK);
    }
    
    
    @GetMapping("/classes")
    public ResponseEntity<List<ClassResponseDTO>> getAllClasses() {
        List<ClassResponseDTO> classes = wholeSaleServiceImpl.findAllClasses();
        return new ResponseEntity<>(classes, HttpStatus.OK);
    }
    
    
    @GetMapping("/uoms")
    public ResponseEntity<List<UomResponseDTO>> getAllUoms() {
        List<UomResponseDTO> uoms = wholeSaleServiceImpl.findAllUoms();
        return new ResponseEntity<>(uoms, HttpStatus.OK);
    }

    
    @GetMapping("/distributors")
    public ResponseEntity<List<DistributorResponseDTO>> getAllDistributors() {
        List<DistributorResponseDTO> distributors = wholeSaleServiceImpl.findAllDistributors();
        return new ResponseEntity<>(distributors, HttpStatus.OK);
    }
    
    @GetMapping("/document-storages")
    public ResponseEntity<List<DocumentStorageResponseDTO>> getAllDocumentStorages() {
        List<DocumentStorageResponseDTO> documentStorages = wholeSaleServiceImpl.findAllDocumentStorages();
        return new ResponseEntity<>(documentStorages, HttpStatus.OK);
    }
    
    @GetMapping("/item-pictures")
    public ResponseEntity<List<ItemPictureResponseDTO>> getAllItemPictures() {
        List<ItemPictureResponseDTO> itemPictures = wholeSaleServiceImpl.findAllItemPictures();
        return new ResponseEntity<>(itemPictures, HttpStatus.OK);
    }

    
    
    @GetMapping("/manufacturers")
    public ResponseEntity<List<ManufacturerResponseDTO>> getAllManufacturers() {
        List<ManufacturerResponseDTO> manufacturers = wholeSaleServiceImpl.findAllManufacturers();
        return new ResponseEntity<>(manufacturers, HttpStatus.OK);
    }
    
    
    @GetMapping("/manufacturer-facilities")
    public ResponseEntity<List<ManufacturerFacilityResponseDTO>> getAllManufacturerFacilities() {
        List<ManufacturerFacilityResponseDTO> manufacturerFacilities = wholeSaleServiceImpl.findAllManufacturerFacilities();
        return new ResponseEntity<>(manufacturerFacilities, HttpStatus.OK);
    }
    
    @GetMapping("/packagings")
    public ResponseEntity<List<PackagingResponseDTO>> getAllPackagings() {
        List<PackagingResponseDTO> packagings = wholeSaleServiceImpl.findAllPackagings();
        return new ResponseEntity<>(packagings, HttpStatus.OK);
    }
    
    @GetMapping("/shipping-dimensions")
    public ResponseEntity<List<ShippingDimensionResponseDTO>> getAllShippingDimensions() {
        List<ShippingDimensionResponseDTO> shippingDimensions = wholeSaleServiceImpl.findAllShippingDimensions();
        return new ResponseEntity<>(shippingDimensions, HttpStatus.OK);
    }
    
    
    
    
    
    @GetMapping("/search")
    public ResponseEntity<List<UserResponseDTO>> searchItems(@RequestParam String user) {
        List<UserResponseDTO> users = wholeSaleServiceImpl.searchByUserName(user);
        return ResponseEntity.ok(users);
    }
    
    
    
    //get by Id
    
    @GetMapping("/items/{id}")
    public ResponseEntity<ItemResponseDTO> getItemById(@PathVariable Integer id) {
    	ItemResponseDTO item = wholeSaleServiceImpl.findItemByIdWholeSale(id);
        return new ResponseEntity<>(item, HttpStatus.OK);
    }
    
    
    

   

}
