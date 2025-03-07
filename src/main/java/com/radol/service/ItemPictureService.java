package com.radol.service;

import com.radol.dto.ItemPictureDTO;
import com.radol.dto.request.ItemPictureRequestDTO;
import com.radol.model.ItemPicture;
public interface ItemPictureService  extends CrudService<ItemPictureDTO, ItemPicture, Integer>  {

	

    ItemPictureDTO updateItemPicture(Integer id, ItemPictureRequestDTO dto);

	   
}