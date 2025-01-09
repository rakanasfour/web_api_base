package com.radol.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.radol.dto.ItemDTO;
import com.radol.dto.request.ItemRequestDTO;
import com.radol.model.Item;

public interface ItemService  extends CrudService<ItemDTO, Item, Integer>  {
	
	/*
	
	public List<DisplayPageDTO> getDisplayPage(Long itemId);
	*/
    public ItemDTO saveItemRequest(ItemRequestDTO dto);
    
    
	public ItemDTO findItemByIdAdminUOM(Integer id);
	
    ItemDTO updateItem(Integer id, ItemRequestDTO dto);
    
    public Page<ItemDTO> findAllwithPaging(int page, int size);

		   
	}