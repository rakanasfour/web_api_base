package com.radol.service.impl.channel;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import com.radol.dto.response.BrandResponseDTO;
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
import com.radol.mapper.channel.BrandMapperChannel;
import com.radol.mapper.channel.ChannelMapperChannel;
import com.radol.mapper.channel.ClassMapperChannel;
import com.radol.mapper.channel.DistributorMapperChannel;
import com.radol.mapper.channel.DocumentStorageMapperChannel;
import com.radol.mapper.channel.ItemMapperChannel;
import com.radol.mapper.channel.ItemPictureMapperChannel;
import com.radol.mapper.channel.ManufacturerFacilityMapperChannel;
import com.radol.mapper.channel.ManufacturerMapperChannel;
import com.radol.mapper.channel.ModelMapperChannel;
import com.radol.mapper.channel.PackagingMapperChannel;
import com.radol.mapper.channel.ShippingDimensionMapperChannel;
import com.radol.mapper.channel.UomMapperChannel;
import com.radol.mapper.channel.UserMapperChannel;
import com.radol.repository.BrandRepository;
import com.radol.repository.ChannelRepository;
import com.radol.repository.ClassRepository;
import com.radol.repository.DistributorRepository;
import com.radol.repository.DocumentStorageRepository;
import com.radol.repository.ItemPictureRepository;
import com.radol.repository.ItemRepository;
import com.radol.repository.ManufacturerFacilityRepository;
import com.radol.repository.ManufacturerRepository;
import com.radol.repository.ModelRepository;
import com.radol.repository.PackagingRepository;
import com.radol.repository.ShippingDimensionRepository;
import com.radol.repository.UomRepository;
import com.radol.repository.UserRepository;

@Service
public class WholeSaleServiceImpl {
	

	
	
	
	
	  @Autowired
	    @Lazy
	    private final UserRepository userRepository;
	    @Autowired
	    @Lazy
	    private final UserMapperChannel userMapper;
	    @Autowired
	    @Lazy
	    private final ItemRepository itemRepository;
	    @Autowired
	    @Lazy
	    private final ItemMapperChannel itemMapper;
	    @Autowired
	    @Lazy
	    private final BrandRepository brandRepository;
	    @Autowired
	    @Lazy
	    private final BrandMapperChannel brandMapper;
	    
	    @Autowired
	    @Lazy
	    private final ModelRepository modelRepository;

	    @Autowired
	    @Lazy
	    private final ModelMapperChannel modelMapper;
	  
	    @Autowired
	    @Lazy
	    private final ChannelRepository channelRepository;

	    @Autowired
	    @Lazy
	    private final ChannelMapperChannel channelMapper;
	 
	    @Autowired
	    @Lazy
	    private final UomRepository uomRepository;

	    @Autowired
	    @Lazy
	    private final UomMapperChannel uomMapper;

	    
	    @Autowired
	    @Lazy
	    private final ClassRepository classRepository;

	    @Autowired
	    @Lazy
	    private final ClassMapperChannel classMapper;

	    
	    @Autowired
	    @Lazy
	    private final DistributorRepository distributorRepository;
	    @Autowired
	    @Lazy
	    private final DistributorMapperChannel distributorMapper;


	    @Autowired
	    @Lazy
	    private final DocumentStorageRepository documentStorageRepository;

	    @Autowired
	    @Lazy
	    private final DocumentStorageMapperChannel documentStorageMapper;

	    @Autowired
	    @Lazy
	    private final ItemPictureRepository itemPictureRepository;

	    @Autowired
	    @Lazy
	    private final ItemPictureMapperChannel itemPictureMapper;


	    @Autowired
	    @Lazy
	    private final ManufacturerRepository manufacturerRepository;

	    @Autowired
	    @Lazy
	    private final ManufacturerMapperChannel manufacturerMapper;

	    @Autowired
	    @Lazy
	    private final ManufacturerFacilityRepository manufacturerFacilityRepository;

	    @Autowired
	    @Lazy
	    private final ManufacturerFacilityMapperChannel manufacturerFacilityMapper;


	    @Autowired
	    @Lazy
	    private final PackagingRepository packagingRepository;

	    @Autowired
	    @Lazy
	    private final PackagingMapperChannel packagingMapper;


	    @Autowired
	    @Lazy
	    private final ShippingDimensionRepository shippingDimensionRepository;

	    @Autowired
	    @Lazy
	    private final ShippingDimensionMapperChannel shippingDimensionMapper;

	    
	    

		public WholeSaleServiceImpl(UserRepository userRepository, UserMapperChannel userMapper,
				ItemRepository itemRepository, ItemMapperChannel itemMapper, BrandRepository brandRepository,
				BrandMapperChannel brandMapper, ModelRepository modelRepository, ModelMapperChannel modelMapper,
				ChannelRepository channelRepository, ChannelMapperChannel channelMapper, UomRepository uomRepository,
				UomMapperChannel uomMapper, ClassRepository classRepository, ClassMapperChannel classMapper,
				DistributorRepository distributorRepository, DistributorMapperChannel distributorMapper,
				DocumentStorageRepository documentStorageRepository, DocumentStorageMapperChannel documentStorageMapper,
				ItemPictureRepository itemPictureRepository, ItemPictureMapperChannel itemPictureMapper,
				ManufacturerRepository manufacturerRepository, ManufacturerMapperChannel manufacturerMapper,
				ManufacturerFacilityRepository manufacturerFacilityRepository,
				ManufacturerFacilityMapperChannel manufacturerFacilityMapper, PackagingRepository packagingRepository,
				PackagingMapperChannel packagingMapper, ShippingDimensionRepository shippingDimensionRepository,
				ShippingDimensionMapperChannel shippingDimensionMapper) {
			super();
			this.userRepository = userRepository;
			this.userMapper = userMapper;
			this.itemRepository = itemRepository;
			this.itemMapper = itemMapper;
			this.brandRepository = brandRepository;
			this.brandMapper = brandMapper;
			this.modelRepository = modelRepository;
			this.modelMapper = modelMapper;
			this.channelRepository = channelRepository;
			this.channelMapper = channelMapper;
			this.uomRepository = uomRepository;
			this.uomMapper = uomMapper;
			this.classRepository = classRepository;
			this.classMapper = classMapper;
			this.distributorRepository = distributorRepository;
			this.distributorMapper = distributorMapper;
			this.documentStorageRepository = documentStorageRepository;
			this.documentStorageMapper = documentStorageMapper;
			this.itemPictureRepository = itemPictureRepository;
			this.itemPictureMapper = itemPictureMapper;
			this.manufacturerRepository = manufacturerRepository;
			this.manufacturerMapper = manufacturerMapper;
			this.manufacturerFacilityRepository = manufacturerFacilityRepository;
			this.manufacturerFacilityMapper = manufacturerFacilityMapper;
			this.packagingRepository = packagingRepository;
			this.packagingMapper = packagingMapper;
			this.shippingDimensionRepository = shippingDimensionRepository;
			this.shippingDimensionMapper = shippingDimensionMapper;
		}


		public List<ItemResponseDTO> findAllItems() {
	        return itemRepository.findUomLevelBelowElevenWholeSale().stream()
	                .map(itemMapper::toDTO) // Handle only the mapping
	                .collect(Collectors.toList());
	    }
		
		
	    public List<BrandResponseDTO> findAllBrands() {
	        return brandRepository.findAll().stream()
	                .map(brandMapper::toDTO)
	                .collect(Collectors.toList());
	    }
		
	    
	    public List<ModelResponseDTO> findAllModels() {
	        return modelRepository.findAll().stream()
	                .map(modelMapper::toDTO)
	                .collect(Collectors.toList());
	    }
	    
	    public List<ChannelResponseDTO> findAllChannels() {
	        return channelRepository.findAll().stream()
	                .map(channelMapper::toDTO)
	                .collect(Collectors.toList());
	    }
		
		
	    
	    public List<ClassResponseDTO> findAllClasses() {
	        return classRepository.findAll().stream()
	                .map(classMapper::toDTO)
	                .collect(Collectors.toList());
	    }
	    
	    public List<UomResponseDTO> findAllUoms() {
	        return uomRepository.findAll().stream()
	                .map(uomMapper::toDTO)
	                .collect(Collectors.toList());
	    }
	    
	    

		public List<DistributorResponseDTO> findAllDistributors() {
		    return distributorRepository.findAll().stream()
		            .map(distributorMapper::toDTO)
		            .collect(Collectors.toList());
		}
		    
		public List<DocumentStorageResponseDTO> findAllDocumentStorages() {
		    return documentStorageRepository.findAll().stream()
		            .map(documentStorageMapper::toDTO)
		            .collect(Collectors.toList());
		}
	    
		
		public List<ItemPictureResponseDTO> findAllItemPictures() {
		    return itemPictureRepository.findAll().stream()
		            .map(itemPictureMapper::toDTO)
		            .collect(Collectors.toList());
		}
		
		public List<ManufacturerResponseDTO> findAllManufacturers() {
		    return manufacturerRepository.findAll().stream()
		            .map(manufacturerMapper::toDTO)
		            .collect(Collectors.toList());
		}

		public List<ManufacturerFacilityResponseDTO> findAllManufacturerFacilities() {
		    return manufacturerFacilityRepository.findAll().stream()
		            .map(manufacturerFacilityMapper::toDTO)
		            .collect(Collectors.toList());
		}
		
		
		public List<PackagingResponseDTO> findAllPackagings() {
		    return packagingRepository.findAll().stream()
		            .map(packagingMapper::toDTO)
		            .collect(Collectors.toList());
		}
		
		public List<ShippingDimensionResponseDTO> findAllShippingDimensions() {
		    return shippingDimensionRepository.findAll().stream()
		            .map(shippingDimensionMapper::toDTO)
		            .collect(Collectors.toList());
		}
		
		
	    public ItemResponseDTO findItemByIdWholeSale(Integer id) {
	        return Optional.ofNullable(itemRepository.findItemByIdWholeSale(id)) // Ensure null safety
	                .map(itemMapper::toDTO)
	                .orElseThrow(() -> new RuntimeException("Item not found with ID: " + id));
	    }
	/*
	    
	    public ItemDTO findByIdCustomer(Integer id) {
	        return Optional.ofNullable(itemRepository.findByIdCustomer(id)) // Ensure null safety
	                .map(itemMapper::toDTO)
	                .orElseThrow(() -> new RuntimeException("Item not found with ID: " + id));
	    }
	    
	    public List<ItemDTO> searchByItemName(String itemName) {
	        return itemRepository.findByItemNameCustomer(itemName).stream()
	                .map(itemMapper::toDTO)
	                .collect(Collectors.toList());
	    }
	    */
	    
	    public List<UserResponseDTO> searchByUserName(String userName) {
	        return userRepository.findByUserNameCustomer(userName).stream()
	                .map(userMapper::toDTO)
	                .collect(Collectors.toList());
	    }

   

    
    public List<ItemResponseDTO> searchByItemName(String itemName) {
        return itemRepository.findByItemNameWholeSale(itemName).stream()
                .map(itemMapper::toDTO)
                .collect(Collectors.toList());
    }
    


    
}
