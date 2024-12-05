package com.radol.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.radol.dto.ChannelDTO;
import com.radol.model.Channel;

@Mapper(componentModel = "spring",uses = ItemChannelMapper.class)
	public interface ChannelMapper extends EntityMapper<ChannelDTO, Channel> {
	
    @Mapping(source = "channelId", target = "channelId")
    @Mapping(source = "channelDescription", target = "channelDescription")
    @Mapping(source = "itemChannels", target = "items")
	ChannelDTO toDTO(Channel channel);

    
    @InheritInverseConfiguration
    Channel toEntity(ChannelDTO channelDTO);


	}
