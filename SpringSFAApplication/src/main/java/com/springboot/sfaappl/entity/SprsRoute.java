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
@Table(name="sprs_route")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SprsRoute {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="route_id", length = 3)
	private Long routeId;
	
	@Column(name="route_name", length = 50)
	private String routeName;
}
