package com.radol.model;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "channels")
public class Channel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "channel_id" , columnDefinition = "INT UNSIGNED")
    private Integer channelId;

    @Column(name = "channel_description", length = 250)
    private String channelDescription;
    
    
    @Column(name = "channels_level")
    private int channelsLevel;

    @Enumerated(EnumType.STRING)
    @Column(name = "channel_default_uom", nullable = false)
    private ChannelUOM channelDefaultUom;

    public enum ChannelUOM {
        SINGLE,
        PACK,
        BOX,
        CASE,
        PALLET
    }
    
    @OneToMany(mappedBy = "mappedChannel", cascade = CascadeType.ALL)
    private List<UomChannel> uomChannels;

	public Channel(Integer channelId, String channelDescription, int channelsLevel, ChannelUOM channelDefaultUom,
			List<UomChannel> uomChannels) {
		super();
		this.channelId = channelId;
		this.channelDescription = channelDescription;
		this.channelsLevel = channelsLevel;
		this.channelDefaultUom = channelDefaultUom;
		this.uomChannels = uomChannels;
	}

	public Channel() {
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

	public List<UomChannel> getUomChannels() {
		return uomChannels;
	}

	public void setUomChannels(List<UomChannel> uomChannels) {
		this.uomChannels = uomChannels;
	}
    
    
    


    
	

    

	
    
    
    

}
