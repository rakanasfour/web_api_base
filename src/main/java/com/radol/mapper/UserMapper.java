package com.radol.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;


import com.radol.dto.UserDTO;
import com.radol.model.User;



@Mapper(componentModel = "spring")
	public interface UserMapper extends EntityMapper<UserDTO, User> {
		
	

	 UserDTO toDTO(User entity);
	 @InheritInverseConfiguration
	User toEntity(UserDTO dto);



	}