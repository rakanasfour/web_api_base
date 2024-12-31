package com.radol.service;

import com.radol.dto.ClassDTO;
import com.radol.dto.request.ClassRequestDTO;
import com.radol.model.ClassEntity;

public interface ClassService  extends CrudService<ClassDTO, ClassEntity, Integer>  {

    public ClassDTO saveClassRequest(ClassRequestDTO dto);


	   
}