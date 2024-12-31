package com.radol.mapper.channel;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import com.radol.dto.UserDTO;
import com.radol.dto.response.UserResponseDTO;
import com.radol.model.User;



@Mapper(componentModel = "spring")
	public interface UserMapperChannel {
		

	 UserResponseDTO toDTO(User entity);
	 @InheritInverseConfiguration
	User toEntity(UserDTO dto);



	}