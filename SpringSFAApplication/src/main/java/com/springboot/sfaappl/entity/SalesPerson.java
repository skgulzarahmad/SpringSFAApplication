package com.springboot.sfaappl.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="sales_pers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SalesPerson {

	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="sales_pers", length = 10, columnDefinition = "CHAR(10)")
	private String salesPers;
	
	@Column(name="sp_name", length = 60)
	private String spName;
	
	@Column(length = 1)
	private String active;
	
	@Column(length = 100)
	private String addr;
	
	@Column(name="item_ser", length = 5, columnDefinition = "CHAR(5)")
	private String itemSer;
}
