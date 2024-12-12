package com.radol.model;



import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "models")
public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "model_id", columnDefinition = "INT UNSIGNED")
    private Integer modelId;

    @Column(name = "model_name", length = 99)
    private String modelName;

    @Column(name = "model_description", length = 4000)
    private String modelDescription;
   

	
    @ManyToOne
    @JoinColumn(name = "model_brand_id", referencedColumnName = "brand_id", nullable = false)
    private Brand brand;
    
    
    @OneToMany(mappedBy="model")
    private List<ModelPicture> modelPictures;


	public Model(Integer modelId, String modelName, String modelDescription, Brand brand,
			List<ModelPicture> modelPictures) {
		super();
		this.modelId = modelId;
		this.modelName = modelName;
		this.modelDescription = modelDescription;
		this.brand = brand;
		this.modelPictures = modelPictures;
	}


	public Model() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Integer getModelId() {
		return modelId;
	}


	public void setModelId(Integer modelId) {
		this.modelId = modelId;
	}


	public String getModelName() {
		return modelName;
	}


	public void setModelName(String modelName) {
		this.modelName = modelName;
	}


	public String getModelDescription() {
		return modelDescription;
	}


	public void setModelDescription(String modelDescription) {
		this.modelDescription = modelDescription;
	}


	public Brand getBrand() {
		return brand;
	}


	public void setBrand(Brand brand) {
		this.brand = brand;
	}


	public List<ModelPicture> getModelPictures() {
		return modelPictures;
	}


	public void setModelPictures(List<ModelPicture> modelPictures) {
		this.modelPictures = modelPictures;
	}
    
    
    

}