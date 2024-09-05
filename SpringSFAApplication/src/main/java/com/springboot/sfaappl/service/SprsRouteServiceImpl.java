package com.springboot.sfaappl.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.sfaappl.dto.SalesPersonDTO;
import com.springboot.sfaappl.dto.SprsRouteDTO;
import com.springboot.sfaappl.entity.SprsRoute;
import com.springboot.sfaappl.repository.SprsRouteRepository;

@Service
public class SprsRouteServiceImpl implements SprsRouteService{

	private SprsRouteRepository sprsRouteRepository;
	
	public SprsRouteServiceImpl(SprsRouteRepository sprsRouteRepository) {
		super();
		this.sprsRouteRepository = sprsRouteRepository;
	}

	@Override
	public SprsRouteDTO createSprsRoute(SprsRouteDTO sprsRouteDto) {
		SprsRoute sprsRoute = SprsRoute.builder()
				.routeId(sprsRouteDto.getRouteId())
				.routeName(sprsRouteDto.getRouteName())
				.build();
		SprsRoute newRoute = this.sprsRouteRepository.save(sprsRoute);
		
		SprsRouteDTO sprsRouteDTO2 = SprsRouteDTO.builder()
				.routeId(newRoute.getRouteId())
				.routeName(newRoute.getRouteName())
				.build();
		return sprsRouteDTO2;
	}

	@Override
	public List<SalesPersonDTO> getAllSprsRoutes() {
		// TODO Auto-generated method stub
		return null;
	}

}
