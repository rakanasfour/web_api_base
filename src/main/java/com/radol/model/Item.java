package com.radol.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
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
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Integer itemId;

    @Column(name = "item_name", length = 100, nullable = false)
    private String itemName;

    @Column(name = "item_sku", length = 99)
    private String itemSku;

    @Column(name = "item_description", columnDefinition = "TEXT")
    private String itemDescription;

    @Column(name = "item_type", length = 250)
    private String itemType;

    @Column(name = "item_quantity")
    private Integer itemQuantity;

    @Column(name = "item_availability", length = 55)
    private String itemAvailability;

    @Column(name = "item_msa_promo_item", length = 55)
    private String itemMsaPromoItem;

    @Column(name = "item_base_price", precision = 10, scale = 2, nullable = false)
    private BigDecimal itemBasePrice;

    @Column(name = "item_weight", precision = 10, scale = 2, nullable = false)
    private BigDecimal itemWeight;

    @Column(name = "item_created_at", nullable = false, updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp itemCreatedAt;

    @Column(name = "item_updated_at", nullable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp itemUpdatedAt;

    @Column(name = "item_updated_at_by", length = 99)
    private String itemUpdatedAtBy;

    @Enumerated(EnumType.STRING)
    @Column(name = "item_status", nullable = false, columnDefinition = "ENUM('AVAILABLE', 'NOTAVAILABLE', 'DISCONTINUED') DEFAULT 'AVAILABLE'")
    private ItemStatus itemStatus;

    public enum ItemStatus {
        AVAILABLE, NOTAVAILABLE, DISCONTINUED
    }

    @OneToMany(mappedBy = "mappedItemChannel", cascade = CascadeType.ALL)
    private List<ItemChannel> itemChannels;
    
    @OneToMany(mappedBy = "mappedItemAttribute", cascade = CascadeType.ALL)
    private List<ItemAttribute> itemAttributes;
    
    
    @OneToMany(mappedBy="item")
    private List<ItemPicture> itemPictures;
    
    @OneToMany(mappedBy="item")
    private List<DocumentStorage> documentStorages;

	public Item(Integer itemId, String itemName, String itemSku, String itemDescription, String itemType,
			Integer itemQuantity, String itemAvailability, String itemMsaPromoItem, BigDecimal itemBasePrice,
			BigDecimal itemWeight, Timestamp itemCreatedAt, Timestamp itemUpdatedAt, String itemUpdatedAtBy,
			ItemStatus itemStatus, List<ItemChannel> itemChannels, List<ItemAttribute> itemAttributes,
			List<ItemPicture> itemPictures, List<DocumentStorage> documentStorages) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemSku = itemSku;
		this.itemDescription = itemDescription;
		this.itemType = itemType;
		this.itemQuantity = itemQuantity;
		this.itemAvailability = itemAvailability;
		this.itemMsaPromoItem = itemMsaPromoItem;
		this.itemBasePrice = itemBasePrice;
		this.itemWeight = itemWeight;
		this.itemCreatedAt = itemCreatedAt;
		this.itemUpdatedAt = itemUpdatedAt;
		this.itemUpdatedAtBy = itemUpdatedAtBy;
		this.itemStatus = itemStatus;
		this.itemChannels = itemChannels;
		this.itemAttributes = itemAttributes;
		this.itemPictures = itemPictures;
		this.documentStorages = documentStorages;
	}

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemSku() {
		return itemSku;
	}

	public void setItemSku(String itemSku) {
		this.itemSku = itemSku;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public Integer getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(Integer itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public String getItemAvailability() {
		return itemAvailability;
	}

	public void setItemAvailability(String itemAvailability) {
		this.itemAvailability = itemAvailability;
	}

	public String getItemMsaPromoItem() {
		return itemMsaPromoItem;
	}

	public void setItemMsaPromoItem(String itemMsaPromoItem) {
		this.itemMsaPromoItem = itemMsaPromoItem;
	}

	public BigDecimal getItemBasePrice() {
		return itemBasePrice;
	}

	public void setItemBasePrice(BigDecimal itemBasePrice) {
		this.itemBasePrice = itemBasePrice;
	}

	public BigDecimal getItemWeight() {
		return itemWeight;
	}

	public void setItemWeight(BigDecimal itemWeight) {
		this.itemWeight = itemWeight;
	}

	public Timestamp getItemCreatedAt() {
		return itemCreatedAt;
	}

	public void setItemCreatedAt(Timestamp itemCreatedAt) {
		this.itemCreatedAt = itemCreatedAt;
	}

	public Timestamp getItemUpdatedAt() {
		return itemUpdatedAt;
	}

	public void setItemUpdatedAt(Timestamp itemUpdatedAt) {
		this.itemUpdatedAt = itemUpdatedAt;
	}

	public String getItemUpdatedAtBy() {
		return itemUpdatedAtBy;
	}

	public void setItemUpdatedAtBy(String itemUpdatedAtBy) {
		this.itemUpdatedAtBy = itemUpdatedAtBy;
	}

	public ItemStatus getItemStatus() {
		return itemStatus;
	}

	public void setItemStatus(ItemStatus itemStatus) {
		this.itemStatus = itemStatus;
	}

	public List<ItemChannel> getItemChannels() {
		return itemChannels;
	}

	public void setItemChannels(List<ItemChannel> itemChannels) {
		this.itemChannels = itemChannels;
	}

	public List<ItemAttribute> getItemAttributes() {
		return itemAttributes;
	}

	public void setItemAttributes(List<ItemAttribute> itemAttributes) {
		this.itemAttributes = itemAttributes;
	}

	public List<ItemPicture> getItemPictures() {
		return itemPictures;
	}

	public void setItemPictures(List<ItemPicture> itemPictures) {
		this.itemPictures = itemPictures;
	}

	public List<DocumentStorage> getDocumentStorages() {
		return documentStorages;
	}

	public void setDocumentStorages(List<DocumentStorage> documentStorages) {
		this.documentStorages = documentStorages;
	}

	
    
    

}
