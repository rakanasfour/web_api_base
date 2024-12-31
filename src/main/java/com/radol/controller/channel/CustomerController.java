package com.radol.controller.channel;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
import com.radol.service.impl.channel.CustomerServiceImpl;


@RestController
@RequestMapping("customer/api")
public class CustomerController  {

    private final CustomerServiceImpl customerServiceImpl;

    public CustomerController(CustomerServiceImpl customerServiceImpl) {
        this.customerServiceImpl = customerServiceImpl;
    }

    
    @GetMapping("/items")
    public ResponseEntity<List<ItemResponseDTO>> getAllItem() {
        List<ItemResponseDTO> items = customerServiceImpl.findAllItems();
        return new ResponseEntity<>(items, HttpStatus.OK);
    }
    
    
    @GetMapping("/models")
    public ResponseEntity<List<ModelResponseDTO>> getAllModels() {
        List<ModelResponseDTO> models = customerServiceImpl.findAllModels();
        return new ResponseEntity<>(models, HttpStatus.OK);
    }
    
    
    @GetMapping("/channels")
    public ResponseEntity<List<ChannelResponseDTO>> getAllChannels() {
        List<ChannelResponseDTO> channels = customerServiceImpl.findAllChannels();
        return new ResponseEntity<>(channels, HttpStatus.OK);
    }
    
    
    @GetMapping("/classes")
    public ResponseEntity<List<ClassResponseDTO>> getAllClasses() {
        List<ClassResponseDTO> classes = customerServiceImpl.findAllClasses();
        return new ResponseEntity<>(classes, HttpStatus.OK);
    }
    
    
    @GetMapping("/uoms")
    public ResponseEntity<List<UomResponseDTO>> getAllUoms() {
        List<UomResponseDTO> uoms = customerServiceImpl.findAllUoms();
        return new ResponseEntity<>(uoms, HttpStatus.OK);
    }

    
    @GetMapping("/distributors")
    public ResponseEntity<List<DistributorResponseDTO>> getAllDistributors() {
        List<DistributorResponseDTO> distributors = customerServiceImpl.findAllDistributors();
        return new ResponseEntity<>(distributors, HttpStatus.OK);
    }
    
    @GetMapping("/document-storages")
    public ResponseEntity<List<DocumentStorageResponseDTO>> getAllDocumentStorages() {
        List<DocumentStorageResponseDTO> documentStorages = customerServiceImpl.findAllDocumentStorages();
        return new ResponseEntity<>(documentStorages, HttpStatus.OK);
    }
    
    @GetMapping("/item-pictures")
    public ResponseEntity<List<ItemPictureResponseDTO>> getAllItemPictures() {
        List<ItemPictureResponseDTO> itemPictures = customerServiceImpl.findAllItemPictures();
        return new ResponseEntity<>(itemPictures, HttpStatus.OK);
    }

    
    
    @GetMapping("/manufacturers")
    public ResponseEntity<List<ManufacturerResponseDTO>> getAllManufacturers() {
        List<ManufacturerResponseDTO> manufacturers = customerServiceImpl.findAllManufacturers();
        return new ResponseEntity<>(manufacturers, HttpStatus.OK);
    }
    
    
    @GetMapping("/manufacturer-facilities")
    public ResponseEntity<List<ManufacturerFacilityResponseDTO>> getAllManufacturerFacilities() {
        List<ManufacturerFacilityResponseDTO> manufacturerFacilities = customerServiceImpl.findAllManufacturerFacilities();
        return new ResponseEntity<>(manufacturerFacilities, HttpStatus.OK);
    }
    
    @GetMapping("/packagings")
    public ResponseEntity<List<PackagingResponseDTO>> getAllPackagings() {
        List<PackagingResponseDTO> packagings = customerServiceImpl.findAllPackagings();
        return new ResponseEntity<>(packagings, HttpStatus.OK);
    }
    
    @GetMapping("/shipping-dimensions")
    public ResponseEntity<List<ShippingDimensionResponseDTO>> getAllShippingDimensions() {
        List<ShippingDimensionResponseDTO> shippingDimensions = customerServiceImpl.findAllShippingDimensions();
        return new ResponseEntity<>(shippingDimensions, HttpStatus.OK);
    }
    
    
    
    
    
    @GetMapping("/search")
    public ResponseEntity<List<UserResponseDTO>> searchItems(@RequestParam String user) {
        List<UserResponseDTO> users = customerServiceImpl.searchByUserName(user);
        return ResponseEntity.ok(users);
    }
    
    ///get by id 
    
    

    @GetMapping("/items/{id}")
    public ResponseEntity<ItemResponseDTO> getItemById(@PathVariable Integer id) {
    	ItemResponseDTO item = customerServiceImpl.findItemByIdCustomer(id);
        return new ResponseEntity<>(item, HttpStatus.OK);
    }
    
    
    
    
    /*
    @GetMapping("/brands")
    public ResponseEntity<List<ItemResponseDTO>> getAllband() {
        List<ItemResponseDTO> items = customerServiceImpl.findAll();
        return new ResponseEntity<>(items, HttpStatus.OK);
    }
    
    
    @GetMapping("/attrubutes")
    public ResponseEntity<List<ItemResponseDTO>> getAllAttribute() {
        List<ItemResponseDTO> items = customerServiceImpl.findAll();
        return new ResponseEntity<>(items, HttpStatus.OK);
    }
    
    @GetMapping("/manufacturers")
    public ResponseEntity<List<ItemResponseDTO>> getAllManufacturers() {
        List<ItemResponseDTO> items = customerServiceImpl.findAll();
        return new ResponseEntity<>(items, HttpStatus.OK);
    }
    
    @GetMapping("/uoms")
    public ResponseEntity<List<ItemResponseDTO>> getAllUOMs() {
        List<ItemResponseDTO> items = customerServiceImpl.findAll();
        return new ResponseEntity<>(items, HttpStatus.OK);
    }
    
    @GetMapping("/models")
    public ResponseEntity<List<ItemResponseDTO>> getAllModels() {
        List<ItemResponseDTO> items = customerServiceImpl.findAll();
        return new ResponseEntity<>(items, HttpStatus.OK);
    }
    
    
    @GetMapping("/shipping-dimension")
    public ResponseEntity<List<ItemResponseDTO>> getAllShippingDimension() {
        List<ItemResponseDTO> items = customerServiceImpl.findAll();
        return new ResponseEntity<>(items, HttpStatus.OK);
    }
    
    
    @GetMapping("/sales-categories")
    public ResponseEntity<List<ItemResponseDTO>> getAllSalesCategories() {
        List<ItemResponseDTO> items = customerServiceImpl.findAll();
        return new ResponseEntity<>(items, HttpStatus.OK);
    }
    
    
    @GetMapping("/packaging")
    public ResponseEntity<List<ItemResponseDTO>> getAllPackaging() {
        List<ItemResponseDTO> items = customerServiceImpl.findAll();
        return new ResponseEntity<>(items, HttpStatus.OK);
    }
    
    
    @GetMapping("/item-picture")
    public ResponseEntity<List<ItemResponseDTO>> getAllItemPictures() {
        List<ItemResponseDTO> items = customerServiceImpl.findAll();
        return new ResponseEntity<>(items, HttpStatus.OK);
    }
    

    @GetMapping("/{id}")
    public ResponseEntity<ItemResponseDTO> getById(@PathVariable Integer id) {
    	ItemResponseDTO item = customerServiceImpl.findByIdCustomer(id);
        return new ResponseEntity<>(item, HttpStatus.OK);
    }
    
    @GetMapping("/search")
    public ResponseEntity<List<ItemResponseDTO>> searchItems(@RequestParam String item) {
        List<ItemResponseDTO> items = customerServiceImpl.searchByItemName(item);
        return ResponseEntity.ok(items);
    }
    
    */
   

   

}
