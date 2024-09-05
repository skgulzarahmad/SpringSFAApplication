package com.springboot.sfaappl.service;

import java.util.List;

import com.springboot.sfaappl.dto.CustomerDTO;

public interface CustomerService {
	
	CustomerDTO createCustomer(CustomerDTO customerDTO);
	
	List<CustomerDTO> getAllCustomers();

}
