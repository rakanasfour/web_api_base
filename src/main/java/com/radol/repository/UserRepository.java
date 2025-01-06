package com.radol.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.radol.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	
	@Query("SELECT u FROM User u WHERE u.userName = :username")
	List<User> findByUserNameCustomer(@Param("username") String userName);
	
	
    Optional<User> findByUserName(String userName);

}
