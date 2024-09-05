package com.springboot.sfaappl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.sfaappl.entity.StrgSeries;
import com.springboot.sfaappl.entity.StrgSeriesId;

@Repository
public interface StrgSeriesRepository extends JpaRepository<StrgSeries, StrgSeriesId>{

}
