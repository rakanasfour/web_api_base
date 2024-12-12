package com.radol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.radol.model.ItemUOM;

@Repository
public interface ItemUOMRepository extends JpaRepository<ItemUOM, Integer> {

  // @Transactional
  // void deleteAllByUom(Uom mappedUomItem );
    
    
}

