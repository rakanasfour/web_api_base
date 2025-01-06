package com.radol.service;

import com.radol.dto.ModelDTO;
import com.radol.dto.request.ModelRequestDTO;
import com.radol.model.Model;

public interface ModelService  extends CrudService<ModelDTO, Model, Integer>  {

	
	public ModelDTO saveModelRequest(ModelRequestDTO dto);
    ModelDTO updateModel(Integer id, ModelRequestDTO dto);

	

	   
}