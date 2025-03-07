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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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

    @Column(name = "item_availability", length = 55)
    private String itemAvailability;

    @Column(name = "item_msa_promo_item", length = 55)
    private String itemMsaPromoItem;

    @Column(name = "item_created_at", nullable = false, updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp itemCreatedAt;

    @Column(name = "item_updated_at", nullable = true, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp itemUpdatedAt;

    @Column(name = "item_updated_at_by", length = 99)
    private String itemUpdatedAtBy;


    @Enumerated(EnumType.STRING)
    @Column(name = "item_status", nullable = false, columnDefinition = "ENUM('AVAILABLE', 'NOTAVAILABLE', 'DISCONTINUED') DEFAULT 'AVAILABLE'")
    private ItemStatus itemStatus;

    public enum ItemStatus {
        AVAILABLE, NOTAVAILABLE, DISCONTINUED
    }
    
    @ManyToOne
    @JoinColumn(name = "item_model_id",  referencedColumnName ="model_id",columnDefinition = "INT UNSIGNED")
    private Model model;
    

    @OneToMany(mappedBy = "mappedItemAttribute", cascade = CascadeType.ALL)
    private List<ItemAttribute> itemAttributes;
    
    @OneToMany(mappedBy = "mappedItemSalesCategory", cascade = CascadeType.ALL)
    private List<ItemSalesCategory> itemSalesCategories;
    
    @OneToMany(mappedBy = "items", cascade = CascadeType.ALL)
    private List<Uom> uoms;
    
    @OneToMany(mappedBy="itemPItemId")
    private List<ItemPicture> itemPictures;
    
    
    @OneToMany(mappedBy="documentSItemId")
    private List<DocumentStorage> documentStorages;


	public Item(Integer itemId, String itemName, String itemSku, String itemDescription, String itemAvailability,
			String itemMsaPromoItem, Timestamp itemCreatedAt, Timestamp itemUpdatedAt, String itemUpdatedAtBy,
			ItemStatus itemStatus, Model model, List<ItemAttribute> itemAttributes,
			List<ItemSalesCategory> itemSalesCategories, List<Uom> uoms, List<ItemPicture> itemPictures,
			List<DocumentStorage> documentStorages) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemSku = itemSku;
		this.itemDescription = itemDescription;
		this.itemAvailability = itemAvailability;
		this.itemMsaPromoItem = itemMsaPromoItem;
		this.itemCreatedAt = itemCreatedAt;
		this.itemUpdatedAt = itemUpdatedAt;
		this.itemUpdatedAtBy = itemUpdatedAtBy;
		this.itemStatus = itemStatus;
		this.model = model;
		this.itemAttributes = itemAttributes;
		this.itemSalesCategories = itemSalesCategories;
		this.uoms = uoms;
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


	public Model getModel() {
		return model;
	}


	public void setModel(Model model) {
		this.model = model;
	}


	public List<ItemAttribute> getItemAttributes() {
		return itemAttributes;
	}


	public void setItemAttributes(List<ItemAttribute> itemAttributes) {
		this.itemAttributes = itemAttributes;
	}


	public List<ItemSalesCategory> getItemSalesCategories() {
		return itemSalesCategories;
	}


	public void setItemSalesCategories(List<ItemSalesCategory> itemSalesCategories) {
		this.itemSalesCategories = itemSalesCategories;
	}


	public List<Uom> getUoms() {
		return uoms;
	}


	public void setUoms(List<Uom> uoms) {
		this.uoms = uoms;
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
