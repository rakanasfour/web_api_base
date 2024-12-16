package com.radol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.radol.model.UomChannel;


@Repository
public interface UomChannelRepository extends JpaRepository<UomChannel, Integer> {

    
}