package com.springboot.sfaappl.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.sfaappl.dto.SalesPersonDTO;
import com.springboot.sfaappl.service.SalesPersonService;

@RestController
@RequestMapping("/api/salesperson")
public class SalesPersonController {

	private SalesPersonService salesPersonService;

	public SalesPersonController(SalesPersonService salesPersonService) {
		super();
		this.salesPersonService = salesPersonService;
	}
	
	@PostMapping("/createSalesPerson")
	public ResponseEntity<SalesPersonDTO> createSalesPerson(@RequestBody SalesPersonDTO salesPersonDTO){
		
		SalesPersonDTO salesPerson = this.salesPersonService.createSalesPerson(salesPersonDTO);
		
		return new ResponseEntity<SalesPersonDTO>(salesPerson,HttpStatus.CREATED);
	}
	
}
