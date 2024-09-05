package com.springboot.sfaappl.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="strg_series")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@IdClass(StrgSeriesId.class)
public class StrgSeries {
	
	@Id
	@Column(name="sales_pers", length = 10, columnDefinition = "CHAR(10)")
	private String salesPers;
	
	//@ManyToOne
	//@JoinColumn(name="sales_pers", referencedColumnName = "sales_pers")
	//private SalesPerson salesPerson;
	
	@Id
	@Column(name="cust_code", length = 10, columnDefinition = "CHAR(10)")
	private String custCode;
	
	//@ManyToOne
    //@JoinColumn(name = "strg_code", referencedColumnName = "strg_code")
    //private Customer customer; // Reference to Customer
	
	@Id
	@Column(name="item_ser", length = 5, columnDefinition = "CHAR(5)")
	private String itemSer;
	
	@Id
	@Column(name="route_id", length = 3)
	private Long routeId;
	
	//@ManyToOne
	//@JoinColumn(name="route_id", referencedColumnName = "route_id")
	//private SprsRoute sprsRoute;
	
}
