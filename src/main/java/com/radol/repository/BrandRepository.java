package com.radol.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.radol.dto.BrandModelDTO;
import com.radol.model.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {
    // Custom query methods can be added here if needed
	
	
	@Query("SELECT new com.radol.dto.BrandModelDTO(b.brandName, m.modelName) " +
	           "FROM Brand b JOIN b.models m")
	    List<BrandModelDTO> findAllBrandsWithModels();
	
	 @Query("SELECT b FROM Brand b JOIN FETCH b.models")
	    List<Brand> findAllBrandsWithModelList();
}