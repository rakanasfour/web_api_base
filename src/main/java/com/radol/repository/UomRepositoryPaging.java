package com.radol.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.radol.model.Uom;

@Repository
public interface UomRepositoryPaging extends PagingAndSortingRepository<Uom, Integer> {
}