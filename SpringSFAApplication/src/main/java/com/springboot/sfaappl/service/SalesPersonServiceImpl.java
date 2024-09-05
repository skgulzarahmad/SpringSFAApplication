package com.springboot.sfaappl.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.sfaappl.dto.SalesPersonDTO;
import com.springboot.sfaappl.entity.SalesPerson;
import com.springboot.sfaappl.repository.SalesPersonRepository;

@Service
public class SalesPersonServiceImpl implements SalesPersonService{

	private SalesPersonRepository salesPersonRepository;
		
	public SalesPersonServiceImpl(SalesPersonRepository salesPersonRepository) {
		super();
		this.salesPersonRepository = salesPersonRepository;
	}

	@Override
	public SalesPersonDTO createSalesPerson(SalesPersonDTO salesPersonDto) {
		
		SalesPerson salesPerson = SalesPerson.builder()
				.salesPers(salesPersonDto.getSalesPers())
				.spName(salesPersonDto.getSpName())
				.active(salesPersonDto.getActive())
				.addr(salesPersonDto.getAddr())
				.itemSer(salesPersonDto.getItemSer())
				.build();
		
		SalesPerson newSalesPerson = this.salesPersonRepository.save(salesPerson);
		
		SalesPersonDTO salesPersonDTO2 = SalesPersonDTO.builder()
				.salesPers(newSalesPerson.getSalesPers())
				.spName(newSalesPerson.getSpName())
				.active(newSalesPerson.getActive())
				.addr(newSalesPerson.getAddr())
				.itemSer(newSalesPerson.getItemSer())
				.build();
		
		return salesPersonDTO2;
	}

	@Override
	public List<SalesPersonDTO> getAllSalesPersons() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
