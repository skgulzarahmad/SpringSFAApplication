package com.springboot.sfaappl.service;

import java.util.List;

import com.springboot.sfaappl.dto.StrgSeriesDTO;

public interface StrgSeriesService {
	
	StrgSeriesDTO createStrgSeries(StrgSeriesDTO strgSeriesDTO);
	List<StrgSeriesDTO> getAllStrgSeries();

}
