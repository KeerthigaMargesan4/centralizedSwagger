package com.person.web.rest.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/person")
public class PersonResource {	
	
	@GetMapping
	public ResponseEntity< String> getAllPersons(){
		return ResponseEntity.ok("Success");
	}
	
}
