package com.radol.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.radol.model.Model;

@Repository
public interface ModelRepositoryPaging extends PagingAndSortingRepository<Model, Integer> {
    // Custom query methods can be added here if needed
}