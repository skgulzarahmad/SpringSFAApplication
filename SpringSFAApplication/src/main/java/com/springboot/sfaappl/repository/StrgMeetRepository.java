package com.springboot.sfaappl.repository;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springboot.sfaappl.entity.StrgMeet;

@Repository
public interface StrgMeetRepository extends JpaRepository<StrgMeet, Long>{
	
	boolean existsBySalesPersAndEventDateAndStrgCode(String salesPers, LocalDate eventDate, String strgCode);
	
	//Customer findByStrgCode(String strgCode);
	
	//Using custom defined query
	@Query("select active from Customer where custCode=:strgCode")
	boolean isCustomerActive(String strgCode);

}
