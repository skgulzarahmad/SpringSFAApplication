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
public class CustomerDTO {
	
	private String custCode;
	
	private String name;
	
	private String addr;
	
	private String active;

	@Override
	public String toString() {
		return "CustomerDTO [custCode=" + custCode + ", name=" + name + ", addr=" + addr + ", active=" + active + "]";
	}
	
	

}
