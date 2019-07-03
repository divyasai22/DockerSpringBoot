package com.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.model.User;


public interface UserRepository extends JpaRepository<User, Long> {

	/*
	 * @GetMapping("${getUserDetails}") public ResponseEntity<User>
	 * getUserDetails();
	 */
	


}
