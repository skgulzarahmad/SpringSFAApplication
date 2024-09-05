package com.springboot.sfaappl.service;

import java.util.List;

import com.springboot.sfaappl.dto.SalesPersonDTO;
import com.springboot.sfaappl.dto.SprsRouteDTO;

public interface SprsRouteService {
	
	SprsRouteDTO createSprsRoute(SprsRouteDTO sprsRouteDto);
	
	List<SalesPersonDTO> getAllSprsRoutes();

}
