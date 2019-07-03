package com.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/docker")
public class TestController {

	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
}
