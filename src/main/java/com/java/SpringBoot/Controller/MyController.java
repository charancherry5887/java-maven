package com.java.SpringBoot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	
	@GetMapping("/")
	public String MyMethod() {
		return "Hello! World";
	}
}
