package com.zensar.springbootDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String sayHello1() {
		return "<h2> Welcome to Spring Boot </h2>";
	}

}
