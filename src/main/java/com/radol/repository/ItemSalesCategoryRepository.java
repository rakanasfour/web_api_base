package com.radol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.radol.model.ItemSalesCategory;

@Repository
public interface ItemSalesCategoryRepository extends JpaRepository<ItemSalesCategory, Integer> {


}
