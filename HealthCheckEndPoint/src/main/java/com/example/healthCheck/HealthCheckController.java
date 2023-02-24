package com.example.healthCheck;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aman")
@CrossOrigin(origins = "http://localhost:4200")
public class HealthCheckController {	
	@GetMapping(path = "/health", produces = "application/json")
	public String applicationStatus() {
		return "Aman";	
	}
}
