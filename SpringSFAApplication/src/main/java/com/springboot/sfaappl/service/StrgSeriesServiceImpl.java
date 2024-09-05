package com.springboot.sfaappl.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.sfaappl.dto.StrgSeriesDTO;
import com.springboot.sfaappl.entity.StrgSeries;
import com.springboot.sfaappl.repository.StrgSeriesRepository;

@Service
public class StrgSeriesServiceImpl implements StrgSeriesService{
	
	private StrgSeriesRepository strgSeriesRepository;
	
	public StrgSeriesServiceImpl(StrgSeriesRepository strgSeriesRepository) {
		super();
		this.strgSeriesRepository = strgSeriesRepository;
	}

	@Override
	public StrgSeriesDTO createStrgSeries(StrgSeriesDTO strgSeriesDTO) {
		StrgSeries strgSeries = StrgSeries.builder()
				.salesPers(strgSeriesDTO.getSalesPers())
				.custCode(strgSeriesDTO.getCustCode())
				.itemSer(strgSeriesDTO.getItemSer())
				.routeId(strgSeriesDTO.getRouteId())
				.build();
		
		StrgSeries newStrgSeries = this.strgSeriesRepository.save(strgSeries);
		StrgSeriesDTO strgSeriesDTO2 = StrgSeriesDTO.builder()
				.salesPers(newStrgSeries.getSalesPers())
				.custCode(newStrgSeries.getCustCode())
				.itemSer(newStrgSeries.getItemSer())
				.routeId(newStrgSeries.getRouteId())
				.build();
		return strgSeriesDTO2;
	}

	@Override
	public List<StrgSeriesDTO> getAllStrgSeries() {
		// TODO Auto-generated method stub
		return null;
	}

}
