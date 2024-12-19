package com.radol.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.radol.dto.DisplayPageDTO;
import com.radol.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
	
	
	//this just to practice
	//@Query("SELECT new com.radol.dto.DisplayPageDTO(i.itemName, i.itemSku, i.itemDescription, i.itemType) " +
//		       "FROM Item i ")
	
/*

	@Query("SELECT new com.radol.dto.DisplayPageDTO(" +
		       "i.itemName, i.itemSku, i.itemDescription, i.itemType,i.itemQuantity,i.itemBasePrice, i.itemWeight, u.uomType, u.uomLevel, iu.itemUomQuantity) " +
		       "FROM ItemUOM iu " +
		       "JOIN iu.mappedItemUom i " +
		       "JOIN iu.mappedUomItem u " + 
		       "WHERE i.itemId = 1 ") 
		
		
*/
	
	/*
	@Query("SELECT DISTINCT new com.radol.dto.DisplayPageDTO(" +
		       "i.itemName, i.itemSku, i.itemDescription, " +
		       "ip.itemPictureMain, u.uomType, u.uomQuantity, u.uomLevel) " + // Fixed order
		       "FROM Item i " +
		       "JOIN i.uoms u " +
		       "LEFT JOIN i.itemPictures ip " +
		       "WHERE i.itemId = :itemId ")
		List<DisplayPageDTO> getDisplayPage(@Param("itemId") Long itemId);
	
	*/
	
	@Query("SELECT DISTINCT i FROM Item i JOIN FETCH i.uoms u WHERE u.uomLevel < 5 AND u IS NOT NULL")
	List<Item> findUomLevelBelowFiveCustomer();

	
	@Query("SELECT DISTINCT i FROM Item i JOIN FETCH i.uoms u WHERE u.uomLevel < 7 AND u.uomLevel > 4 AND u IS NOT NULL")
	List<Item> findUomLevelBelowSevenRetail();
	
	@Query("SELECT DISTINCT i FROM Item i JOIN FETCH i.uoms u WHERE u.uomLevel < 11 AND u.uomLevel > 4 AND u IS NOT NULL")
	List<Item> findUomLevelBelowElevenWholeSale();
	
	@Query("SELECT i FROM Item i JOIN FETCH i.uoms u " +
		       "WHERE u.uomLevel < 5 AND u IS NOT NULL AND i.itemId = :id")
		Item findByIdQueryCustomer(@Param("id") Integer id);
	
	@Query("SELECT i FROM Item i JOIN FETCH i.uoms u " +
		       "WHERE u.uomLevel < 7 AND u.uomLevel > 4 AND u IS NOT NULL AND i.itemId = :id")
		Item findByIdQueryRetail(@Param("id") Integer id);
	
	
	@Query("SELECT i FROM Item i JOIN FETCH i.uoms u " +
		       "WHERE u.uomLevel < 11 AND u.uomLevel > 4 AND u IS NOT NULL AND i.itemId = :id")
		Item findByIdQueryWholeSale(@Param("id") Integer id);
}