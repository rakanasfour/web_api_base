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
@Table(name = "brand_pictures")
public class BrandPicture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "brand_picture_id", columnDefinition = "INT UNSIGNED")
    private Integer brandPictureId;

    @Column(name = "brand_picture_name", length = 300)
    private String brandPictureName;

    @Column(name = "brand_picture_link", length = 300, nullable = false)
    private String brandPictureLink;

	public BrandPicture(Integer brandPictureId, String brandPictureName, String brandPictureLink) {
		super();
		this.brandPictureId = brandPictureId;
		this.brandPictureName = brandPictureName;
		this.brandPictureLink = brandPictureLink;
	}

	public BrandPicture() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getBrandPictureId() {
		return brandPictureId;
	}

	public void setBrandPictureId(Integer brandPictureId) {
		this.brandPictureId = brandPictureId;
	}

	public String getBrandPictureName() {
		return brandPictureName;
	}

	public void setBrandPictureName(String brandPictureName) {
		this.brandPictureName = brandPictureName;
	}

	public String getBrandPictureLink() {
		return brandPictureLink;
	}

	public void setBrandPictureLink(String brandPictureLink) {
		this.brandPictureLink = brandPictureLink;
	}

    
    
    
    
}
