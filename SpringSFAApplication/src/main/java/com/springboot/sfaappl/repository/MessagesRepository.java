package com.springboot.sfaappl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.sfaappl.entity.Messages;

@Repository
public interface MessagesRepository extends JpaRepository<Messages, String>{

	
}
