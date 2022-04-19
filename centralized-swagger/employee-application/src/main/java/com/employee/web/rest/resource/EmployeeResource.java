package com.employee.web.rest.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/employee")
public class EmployeeResource {	
	
	@GetMapping
	public ResponseEntity<String> getAllEmployees(){
		return ResponseEntity.ok("Success");
	}
}
