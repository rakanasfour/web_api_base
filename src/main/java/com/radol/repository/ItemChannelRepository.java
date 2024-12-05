package com.radol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.radol.model.ItemChannel;


@Repository
public interface ItemChannelRepository extends JpaRepository<ItemChannel, Integer> {

    
}