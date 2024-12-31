package com.radol.dto.request;

import com.radol.model.Distributor.DistributorStatus;

public class DistributorRequestDTO {

	
	  private Integer distributorId;
	    private String distributorName;
	    private String distributorAddress;
	    private String distributorCountry;
	   
	    private DistributorStatus distributorStatus;

		public DistributorRequestDTO(Integer distributorId, String distributorName, String distributorAddress,
				String distributorCountry, DistributorStatus distributorStatus) {
			super();
			this.distributorId = distributorId;
			this.distributorName = distributorName;
			this.distributorAddress = distributorAddress;
			this.distributorCountry = distributorCountry;
			this.distributorStatus = distributorStatus;
		}

		public DistributorRequestDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Integer getDistributorId() {
			return distributorId;
		}

		public void setDistributorId(Integer distributorId) {
			this.distributorId = distributorId;
		}

		public String getDistributorName() {
			return distributorName;
		}

		public void setDistributorName(String distributorName) {
			this.distributorName = distributorName;
		}

		public String getDistributorAddress() {
			return distributorAddress;
		}

		public void setDistributorAddress(String distributorAddress) {
			this.distributorAddress = distributorAddress;
		}

		public String getDistributorCountry() {
			return distributorCountry;
		}

		public void setDistributorCountry(String distributorCountry) {
			this.distributorCountry = distributorCountry;
		}

		public DistributorStatus getDistributorStatus() {
			return distributorStatus;
		}

		public void setDistributorStatus(DistributorStatus distributorStatus) {
			this.distributorStatus = distributorStatus;
		}

	    
	    
	    
		
	    
}
