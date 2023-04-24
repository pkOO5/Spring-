package com.pranay.playjava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/test-docker")
	public String getString() {
		return "Hello! I'm on cloud";
	}
	
}
