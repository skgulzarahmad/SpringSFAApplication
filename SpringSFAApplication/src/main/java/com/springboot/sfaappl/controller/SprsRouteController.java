package com.springboot.sfaappl.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.sfaappl.dto.SprsRouteDTO;
import com.springboot.sfaappl.service.SprsRouteService;

@RestController
@RequestMapping("/api/sprsroute")
public class SprsRouteController {
	private SprsRouteService sprsRouteService;

	public SprsRouteController(SprsRouteService sprsRouteService) {
		super();
		this.sprsRouteService = sprsRouteService;
	}
	
	@PostMapping("/createSprsRoute")
	public ResponseEntity<SprsRouteDTO> createSprsRoute(@RequestBody SprsRouteDTO sprsRouteDTO){
		return new ResponseEntity<SprsRouteDTO>(this.sprsRouteService.createSprsRoute(sprsRouteDTO), HttpStatus.CREATED);
	}
}
