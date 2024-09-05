package com.springboot.sfaappl.entity;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.springboot.sfaappl.validation.ValidateMeeting;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="strg_meet")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ValidateMeeting
public class StrgMeet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="tran_id")
	private Long tranId;
	
	@Column(name="event_date")
	private LocalDate eventDate;
	
	@Column(name="event_type")
    private String eventType;
	
	@Column(name="strg_code")
    private String strgCode;
	
	@Column(name="strg_name")
    private String strgName;
	
	@Column(name="sales_pers")
    private String salesPers;
	
	@Column(name="route_id")
    private Long routeId;
	
	@Column(name="route_name")
    private String routeName;
	
	@Column(name="confirmed")
    private String confirmed;
	
	@Column(name="conf_date")
	private LocalDate confDate;
	
	@OneToMany(mappedBy = "strgMeet", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<StrgMeetItems> meetItems;

	@Override
	public String toString() {
		return "StrgMeet [tranId=" + tranId + ", eventDate=" + eventDate + ", eventType=" + eventType + ", strgCode="
				+ strgCode + ", strgName=" + strgName + ", salesPers=" + salesPers + ", routeId=" + routeId
				+ ", routeName=" + routeName + ", confirmed=" + confirmed + ", confDate=" + confDate + ", meetItems="
				+ meetItems + "]";
	}
	//Added new
	public void addMeetItems(StrgMeetItems meetItem) {
		meetItems.add(meetItem);
		meetItem.setStrgMeet(this);
		
	}
}
