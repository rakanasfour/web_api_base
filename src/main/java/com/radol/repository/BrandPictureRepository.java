package com.radol.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.radol.model.BrandPicture;
@Repository
public interface BrandPictureRepository extends PagingAndSortingRepository<BrandPicture, Integer> {

}
