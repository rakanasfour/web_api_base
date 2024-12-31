package com.radol.mapper.channel;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.radol.dto.ChannelDTO;
import com.radol.dto.response.ChannelResponseDTO;
import com.radol.model.Channel;

@Mapper(componentModel = "spring",uses = UomChannelMapperChannel.class)
	public interface ChannelMapperChannel extends EntityMapper<ChannelResponseDTO, Channel> {
	
    @Mapping(source = "channelId", target = "channelId")
    @Mapping(source = "channelDescription", target = "channelDescription")
    @Mapping(source = "uomChannels", target = "uoms")
	ChannelResponseDTO toDTO(Channel channel);

    
    @InheritInverseConfiguration
    Channel toEntity(ChannelDTO channelDTO);


	}
