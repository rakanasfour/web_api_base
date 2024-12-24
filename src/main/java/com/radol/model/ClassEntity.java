package com.radol.model;

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
@Table(name = "classes")
public class ClassEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "class_id", columnDefinition = "INT UNSIGNED")
    private Integer classId;

    @Column(name = "class_name", length = 99, nullable = false)
    private String className;

 
    @OneToMany(mappedBy = "mappedClass", cascade = CascadeType.ALL)
    private List<AttributeClass> attributeClasses;


	public ClassEntity(Integer classId, String className, List<AttributeClass> attributeClasses) {
		super();
		this.classId = classId;
		this.className = className;
		this.attributeClasses = attributeClasses;
	}


	public ClassEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Integer getClassId() {
		return classId;
	}


	public void setClassId(Integer classId) {
		this.classId = classId;
	}


	public String getClassName() {
		return className;
	}


	public void setClassName(String className) {
		this.className = className;
	}


	public List<AttributeClass> getAttributeClasses() {
		return attributeClasses;
	}


	public void setAttributeClasses(List<AttributeClass> attributeClasses) {
		this.attributeClasses = attributeClasses;
	}



	
    
	
  
}
