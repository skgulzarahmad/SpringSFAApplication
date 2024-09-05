package com.springboot.sfaappl.dto;

import java.math.BigDecimal;

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
public class ItemDTO {

	private String itemCode;
	
	private String name;
	private BigDecimal rate;
	
	private String itemSer;

	@Override
	public String toString() {
		return "ItemDTO [itemCode=" + itemCode + ", name=" + name + ", rate=" + rate + ", itemSer=" + itemSer + "]";
	}
	

}
