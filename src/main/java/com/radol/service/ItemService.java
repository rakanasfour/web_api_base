package com.radol.service;

import com.radol.dto.ItemDTO;
import com.radol.dto.ItemRequestDTO;
import com.radol.model.Item;

public interface ItemService  extends CrudService<ItemDTO, Item, Integer>  {
	
	/*
	
	public List<DisplayPageDTO> getDisplayPage(Long itemId);
	*/
    public ItemDTO saveItemRequest(ItemRequestDTO dto);
		   
	}