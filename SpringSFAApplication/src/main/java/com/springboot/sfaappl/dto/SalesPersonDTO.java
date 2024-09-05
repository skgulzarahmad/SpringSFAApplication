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
public class SalesPersonDTO {
	
	private String salesPers;
	
	private String spName;
	
	private String active;
	
	private String addr;
	
	private String itemSer;

	@Override
	public String toString() {
		return "SalesPersonDTO [salesPers=" + salesPers + ", spName=" + spName + ", active=" + active + ", addr=" + addr
				+ ", itemSer=" + itemSer + "]";
	} 
	
	

}
