package com.springboot.sfaappl.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="strg_meet_items")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StrgMeetItems {

	//@Column(name="tran_id")
	//private Long tranId;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="line_no")
	private Integer lineNo;
	
	@Column(name="strg_code")
	private String strgCode;
	
	@Column(name="item_code")
	private String itemCode;
	
	//@Column(precision = 14,scale = 3)
	private Double quantity;
	
	@ManyToOne
    @JoinColumn(name = "tran_id", nullable = false)
    private StrgMeet strgMeet; // Reference to StrgMeet 

	@Override
	public String toString() {
		return "StrgMeetItems [lineNo=" + lineNo + ", strgCode=" + strgCode + ", itemCode="
				+ itemCode + ", quantity=" + quantity + "]";
	}
	
	
}
