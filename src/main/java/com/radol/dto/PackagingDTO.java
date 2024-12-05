package com.radol.dto;



import com.radol.model.Packaging.PackagingType;

public class PackagingDTO {
    private Integer packagingId;
    private PackagingType packagingType;
   
    
	public PackagingDTO(Integer packagingId, PackagingType packagingType) {
		super();
		this.packagingId = packagingId;
		this.packagingType = packagingType;
		
	}

	public PackagingDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getPackagingId() {
		return packagingId;
	}

	public void setPackagingId(Integer packagingId) {
		this.packagingId = packagingId;
	}

	public PackagingType getPackagingType() {
		return packagingType;
	}

	public void setPackagingType(PackagingType packagingType) {
		this.packagingType = packagingType;
	}

	
	
	
	
    
    
    
}
