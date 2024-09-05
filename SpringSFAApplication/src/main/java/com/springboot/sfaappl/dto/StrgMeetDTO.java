package com.springboot.sfaappl.dto;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

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
public class StrgMeetDTO {
	
	private LocalDate eventDate;
	private String eventType;
	private String strgCode;
	private String strgName;
	private String salesPers;
	private Long routeId;
	private String routeName;
	private String confirmed;
	private LocalDate confDate;
	private Set<StrgMeetItemsDTO> meetItems;
}
