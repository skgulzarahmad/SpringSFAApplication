package com.springboot.sfaappl.dto;

import java.time.LocalDate;
import java.util.Set;

import com.springboot.sfaappl.entity.StrgMeetItems;

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
public class StrgMeetItemsDTO {
	private Long tranId;
	private Integer lineNo;
    private String strgCode;
    private String itemCode;
    private Double quantity;
}
