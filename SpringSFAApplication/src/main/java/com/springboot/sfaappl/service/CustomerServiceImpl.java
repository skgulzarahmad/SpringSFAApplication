package com.springboot.sfaappl.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.sfaappl.dto.CustomerDTO;
import com.springboot.sfaappl.entity.Customer;
import com.springboot.sfaappl.repository.CustomerRepository;

import lombok.Builder;

@Service
public class CustomerServiceImpl implements CustomerService{

	private CustomerRepository customerRepository;
		
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}

	@Override
	public CustomerDTO createCustomer(CustomerDTO customerDTO) {
		
		Customer strgCustomer = Customer.builder()
				.custCode(customerDTO.getCustCode())
				.name(customerDTO.getName())
				.addr(customerDTO.getAddr())
				.active(customerDTO.getActive())
				.build();
		
		Customer savedCustomer = this.customerRepository.save(strgCustomer);
		CustomerDTO customerDTO2 = CustomerDTO.builder()
				.custCode(savedCustomer.getCustCode())
				.name(savedCustomer.getName())
				.addr(savedCustomer.getAddr())
				.active(savedCustomer.getActive())
				.build();
		return customerDTO2;
	}

	@Override
	public List<CustomerDTO> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

}
