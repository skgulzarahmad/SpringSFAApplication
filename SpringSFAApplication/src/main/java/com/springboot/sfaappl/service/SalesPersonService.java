package com.springboot.sfaappl.service;

import java.util.List;

import com.springboot.sfaappl.dto.SalesPersonDTO;

public interface SalesPersonService {
	
	SalesPersonDTO createSalesPerson(SalesPersonDTO salesPersonDto);
	
	List<SalesPersonDTO> getAllSalesPersons();

}
