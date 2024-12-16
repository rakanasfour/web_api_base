package com.radol.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "uoms_channels")
public class UomChannel {
	

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uom_ch_id" , columnDefinition = "INT UNSIGNED")
    private Integer UomChannelId;

    @ManyToOne
    @JoinColumn(name = "uom_ch_channel_id", nullable = false)
    private Channel mappedChannel;

    @ManyToOne
    @JoinColumn(name = "uom_ch_uom_id", nullable = false)
    private Uom mappedUomChannel;

	public UomChannel(Integer uomChannelId, Channel mappedChannel, Uom mappedUomChannel) {
		super();
		UomChannelId = uomChannelId;
		this.mappedChannel = mappedChannel;
		this.mappedUomChannel = mappedUomChannel;
	}

	public UomChannel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getUomChannelId() {
		return UomChannelId;
	}

	public void setUomChannelId(Integer uomChannelId) {
		UomChannelId = uomChannelId;
	}

	public Channel getMappedChannel() {
		return mappedChannel;
	}

	public void setMappedChannel(Channel mappedChannel) {
		this.mappedChannel = mappedChannel;
	}

	public Uom getMappedUomChannel() {
		return mappedUomChannel;
	}

	public void setMappedUomChannel(Uom mappedUomChannel) {
		this.mappedUomChannel = mappedUomChannel;
	}

	
    
	
    
}
