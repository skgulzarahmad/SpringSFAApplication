package com.springboot.sfaappl.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.sfaappl.dto.StrgMeetDTO;
import com.springboot.sfaappl.service.StrgMeetService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/strgmeet")
@Validated
public class StrgMeetController {

	private StrgMeetService strgMeetService;

	public StrgMeetController(StrgMeetService strgMeetService) {
		super();
		this.strgMeetService = strgMeetService;
	}
	
	@PostMapping("/createMeeting")
	public ResponseEntity<String> createStrgMeet(@RequestBody @Valid StrgMeetDTO strgMeetDTO){
		this.strgMeetService.createStrgMeet(strgMeetDTO);
		
		return ResponseEntity.ok("Meeting is created Successfully");
	}
}
