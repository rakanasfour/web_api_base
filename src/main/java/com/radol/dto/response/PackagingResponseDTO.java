package com.radol.dto.response;

import java.util.List;

import com.radol.model.Uom;
import com.radol.model.Packaging.PackagingType;

public class PackagingResponseDTO {
	
	
	 private Integer packagingId;
	    private PackagingType packagingType;
	    
	    private List<Uom> uoms ;
	    

		public PackagingResponseDTO(Integer packagingId, PackagingType packagingType, List<Uom> uoms) {
			super();
			this.packagingId = packagingId;
			this.packagingType = packagingType;
			this.uoms = uoms;
		}


		public PackagingResponseDTO() {
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


		public List<Uom> getUoms() {
			return uoms;
		}


		public void setUoms(List<Uom> uoms) {
			this.uoms = uoms;
		}
	   
		
	    

}
