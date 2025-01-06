package com.radol.service;

import com.radol.dto.ChannelDTO;
import com.radol.dto.request.ChannelRequestDTO;
import com.radol.model.Channel;

public interface ChannelService  extends CrudService<ChannelDTO, Channel, Integer>  {

		
    ChannelDTO updateChannel(Integer id, ChannelRequestDTO dto);

		   
	}