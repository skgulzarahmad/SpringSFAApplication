package com.springboot.sfaappl.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.sfaappl.dto.CustomerDTO;
import com.springboot.sfaappl.service.CustomerService;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
	
	private CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
	
	@PostMapping("/createCustomer")
	public ResponseEntity<CustomerDTO> createCustomer(@RequestBody CustomerDTO customerDTO){
		
		return new ResponseEntity<CustomerDTO>(this.customerService.createCustomer(customerDTO),HttpStatus.CREATED);
	}

}
