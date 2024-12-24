package com.radol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.radol.model.AttributeClass;

@Repository
public interface AttributeClassRepository extends JpaRepository<AttributeClass, Integer> {


}
