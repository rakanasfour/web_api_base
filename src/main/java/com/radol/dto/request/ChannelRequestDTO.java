package com.radol.dto.request;

import java.util.List;

import com.radol.dto.UomDTO;
import com.radol.model.Channel.ChannelUOM;

public class ChannelRequestDTO {
	
	 private Integer channelId;
	    private String channelDescription;

	    
	    private int channelsLevel;
	    
	    private ChannelUOM channelDefaultUom;
	    
	    
	    private List<UomDTO> uoms;


		public ChannelRequestDTO(Integer channelId, String channelDescription, int channelsLevel, ChannelUOM channelDefaultUom,
				List<UomDTO> uoms) {
			super();
			this.channelId = channelId;
			this.channelDescription = channelDescription;
			this.channelsLevel = channelsLevel;
			this.channelDefaultUom = channelDefaultUom;
			this.uoms = uoms;
		}


		public ChannelRequestDTO() {
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


		public List<UomDTO> getUoms() {
			return uoms;
		}


		public void setUoms(List<UomDTO> uoms) {
			this.uoms = uoms;
		}


	    
	    


}
