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
@Table(name = "items_uoms")
public class ItemUOM {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_uom_id" , columnDefinition = "INT UNSIGNED")
    private Integer itemUomId;

    @Column(name = "item_uom_quantity")
    private Integer itemUomQuantity;

    @ManyToOne
    @JoinColumn(name = "item_uom_item_id", nullable = false)
    private Item mappedItemUom;

    @ManyToOne
    @JoinColumn(name = "item_uom_uom_id", nullable = false)
    private Uom mappedUomItem;

	public ItemUOM(Integer itemUomId, Integer itemUomQuantity, Item mappedItemUom, Uom mappedUomItem) {
		super();
		this.itemUomId = itemUomId;
		this.itemUomQuantity = itemUomQuantity;
		this.mappedItemUom = mappedItemUom;
		this.mappedUomItem = mappedUomItem;
	}

	public ItemUOM() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getItemUomId() {
		return itemUomId;
	}

	public void setItemUomId(Integer itemUomId) {
		this.itemUomId = itemUomId;
	}

	public Integer getItemUomQuantity() {
		return itemUomQuantity;
	}

	public void setItemUomQuantity(Integer itemUomQuantity) {
		this.itemUomQuantity = itemUomQuantity;
	}

	public Item getMappedItemUom() {
		return mappedItemUom;
	}

	public void setMappedItemUom(Item mappedItemUom) {
		this.mappedItemUom = mappedItemUom;
	}

	public Uom getMappedUomItem() {
		return mappedUomItem;
	}

	public void setMappedUomItem(Uom mappedUomItem) {
		this.mappedUomItem = mappedUomItem;
	}

	
    
    
    
    
   
}