package com.radol.dto;

import java.util.List;

import com.radol.model.Channel.ChannelUOM;

public class ChannelDTO {
    private Integer channelId;
    private String channelDescription;

    
    private int channelsLevel;
    
    private ChannelUOM channelDefaultUom;
    
    
    private List<ItemDTO> items;
    
    

	public ChannelDTO(Integer channelId, String channelDescription, List<ItemDTO> items, int channelsLevel,
			ChannelUOM channelDefaultUom) {
		super();
		this.channelId = channelId;
		this.channelDescription = channelDescription;
		this.items = items;
		this.channelsLevel = channelsLevel;
		this.channelDefaultUom = channelDefaultUom;
	}

	public ChannelDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getChannelId() {
		return channelId;
	}

	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}

	public String getChannelDescription() {
		return channelDescription;
	}

	public void setChannelDescription(String channelDescription) {
		this.channelDescription = channelDescription;
	}

	public List<ItemDTO> getItems() {
		return items;
	}

	public void setItems(List<ItemDTO> items) {
		this.items = items;
	}

	public int getChannelsLevel() {
		return channelsLevel;
	}

	public void setChannelsLevel(int channelsLevel) {
		this.channelsLevel = channelsLevel;
	}

	public ChannelUOM getChannelDefaultUom() {
		return channelDefaultUom;
	}

	public void setChannelDefaultUom(ChannelUOM channelDefaultUom) {
		this.channelDefaultUom = channelDefaultUom;
	}
    
	
    
    
    

    

	
	
}
