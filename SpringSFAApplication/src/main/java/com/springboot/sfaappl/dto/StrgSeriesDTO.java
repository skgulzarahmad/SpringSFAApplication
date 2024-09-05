package com.springboot.sfaappl.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StrgSeriesDTO {
	
	private String salesPers;
	
	private String custCode;
	
	private String itemSer;
	
	private Long routeId;

	@Override
	public String toString() {
		return "StrgSeriesDTO [salesPers=" + salesPers + ", custCode=" + custCode + ", itemSer=" + itemSer
				+ ", routeId=" + routeId + "]";
	}
	

}
