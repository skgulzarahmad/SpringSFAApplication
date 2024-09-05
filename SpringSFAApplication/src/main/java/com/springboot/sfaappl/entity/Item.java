package com.springboot.sfaappl.entity;

import java.math.BigDecimal;

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
@Table(name="item")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Item {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="item_code", length = 10, columnDefinition = "CHAR(10)")
	private String itemCode;
	
	@Column(length = 60)
	private String name;
	
	@Column(precision = 14,scale = 3)
	private BigDecimal rate;
	
	@Column(name="item_ser", length = 5, columnDefinition = "CHAR(5)")
	private String itemSer;
}
