package com.springboot.sfaappl.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="messages")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Messages {

	@Id
	@Column(name="msg_no", nullable = false, length = 15, columnDefinition = "CHAR(15)")
	private String msgNo;
	
	@Column(name="msg_descr", nullable = false, length = 60)
	private String msgDescr;
}
