package com.springboot.sfaappl.dto;

import jakarta.persistence.Column;
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
public class SprsRouteDTO {
	
	private Long routeId;
	
	private String routeName;

	@Override
	public String toString() {
		return "SprsRouteDTO [routeId=" + routeId + ", routeName=" + routeName + "]";
	}
	

}
