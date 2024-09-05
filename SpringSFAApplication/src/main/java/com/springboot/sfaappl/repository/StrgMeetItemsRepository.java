package com.springboot.sfaappl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.sfaappl.entity.StrgMeetItems;
import com.springboot.sfaappl.entity.StrgMeetItemsId;

@Repository
public interface StrgMeetItemsRepository extends JpaRepository<StrgMeetItems, Integer>{

}
