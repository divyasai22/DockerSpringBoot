package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.model.User;
import com.spring.repository.UserRepository;




@RequestMapping
public class UserController {
	
	@Autowired
	private transient UserRepository userRepository;
	
	@RequestMapping("/getUserDetails")
	public ResponseEntity<List<User>> getUserDetails() {
		//User user = new User();
		System.out.println("in project1 ====");
		List<User>  userObj = userRepository.findAll();
		return new ResponseEntity<List<User>>(userObj,HttpStatus.OK);
	}
	
}
