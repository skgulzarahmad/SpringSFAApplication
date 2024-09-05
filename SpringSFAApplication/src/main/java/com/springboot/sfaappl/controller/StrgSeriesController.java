package com.springboot.sfaappl.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.sfaappl.dto.StrgSeriesDTO;
import com.springboot.sfaappl.service.StrgSeriesService;

@RestController
@RequestMapping("/api/strgseries")
public class StrgSeriesController {
	private StrgSeriesService strgSeriesService;

	public StrgSeriesController(StrgSeriesService strgSeriesService) {
		super();
		this.strgSeriesService = strgSeriesService;
	}
	@PostMapping("/createStrgSeries")
	public ResponseEntity<StrgSeriesDTO> createStrgSeries(@RequestBody StrgSeriesDTO strgSeriesDTO){
		
		return new ResponseEntity<StrgSeriesDTO>(this.strgSeriesService.createStrgSeries(strgSeriesDTO),HttpStatus.CREATED);
	}

}
