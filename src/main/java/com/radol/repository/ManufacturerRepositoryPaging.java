package com.radol.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.radol.model.Manufacturer;

@Repository
public interface ManufacturerRepositoryPaging extends PagingAndSortingRepository<Manufacturer, Integer> {
    // Custom query methods can be added here if needed
}
