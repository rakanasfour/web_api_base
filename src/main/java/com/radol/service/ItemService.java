package com.radol.service;

import java.util.List;

import com.radol.dto.DisplayPageDTO;
import com.radol.dto.ItemDTO;
import com.radol.model.Item;

public interface ItemService  extends CrudService<ItemDTO, Item, Integer>  {
	
	
	
	public List<DisplayPageDTO> getDisplayPage();


		

		   
	}