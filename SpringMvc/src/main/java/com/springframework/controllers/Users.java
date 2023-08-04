package com.springframework.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first/")

public class Users {
	
	@GetMapping("one")
	public String one() {
		return "one example";
		
	}
	@GetMapping("two")
	public String two() {
		return "two example";
		
	}
	
}
