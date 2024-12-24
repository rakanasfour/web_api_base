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
@Table(name = "attribute_class")
public class AttributeClass {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attribute_class_id", columnDefinition = "INT UNSIGNED")
	private int attributeClassId;
	 @ManyToOne
	 @JoinColumn(name = "attribute_class_attribute_id", nullable = false)
	private Attribute mappedAttributeClass;
	 
	 @ManyToOne
	 @JoinColumn(name = "attribute_class_class_id", nullable = false)
	private ClassEntity mappedClass;

	public AttributeClass(int attributeClassId, Attribute mappedAttributeClass, ClassEntity mappedClass) {
		super();
		this.attributeClassId = attributeClassId;
		this.mappedAttributeClass = mappedAttributeClass;
		this.mappedClass = mappedClass;
	}

	public AttributeClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAttributeClassId() {
		return attributeClassId;
	}

	public void setAttributeClassId(int attributeClassId) {
		this.attributeClassId = attributeClassId;
	}

	public Attribute getMappedAttributeClass() {
		return mappedAttributeClass;
	}

	public void setMappedAttributeClass(Attribute mappedAttributeClass) {
		this.mappedAttributeClass = mappedAttributeClass;
	}

	public ClassEntity getMappedClass() {
		return mappedClass;
	}

	public void setMappedClass(ClassEntity mappedClass) {
		this.mappedClass = mappedClass;
	}
	
	
	
	 
	
	
	
	
	
	

}
