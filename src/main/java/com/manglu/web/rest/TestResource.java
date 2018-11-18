package com.manglu.web.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manglu.service.dto.InfoDTO;

@RestController
@RequestMapping("/api")
public class TestResource {
	
	
	@GetMapping("/hello-world") 
    public ResponseEntity<InfoDTO> getAllAlertItems() {
		/*
		 * Here, you can call the service responsible of business logic and return necessary DTO and http code.  	
		 */
        InfoDTO response = new InfoDTO();
        response.setInfo("HELLO WORLD !!!!");
        return new ResponseEntity<InfoDTO>(response, HttpStatus.OK);
    }
	

}
