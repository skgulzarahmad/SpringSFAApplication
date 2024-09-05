package com.springboot.sfaappl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.sfaappl.entity.SalesPerson;

@Repository
public interface SalesPersonRepository extends JpaRepository<SalesPerson, String>{

}
