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
@Table(name="strg_customer")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="strg_code", length = 10, columnDefinition = "CHAR(10)")
	private String custCode;
	
	@Column(length = 60)
	private String name;
	
	@Column(length = 100)
	private String addr;
	
	@Column(length = 1)
	private String active;

}
