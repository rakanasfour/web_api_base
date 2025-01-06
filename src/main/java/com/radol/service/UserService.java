package com.radol.service;

import com.radol.dto.UserDTO;
import com.radol.dto.request.UserRequestDTO;
import com.radol.model.User;

public interface UserService  extends CrudService<UserDTO, User, Integer>  {

		

    UserDTO updateUser(Integer id, UserRequestDTO dto);

	}