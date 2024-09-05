package com.springboot.sfaappl.service;

import com.springboot.sfaappl.dto.StrgMeetDTO;
import com.springboot.sfaappl.dto.StrgMeetItemsDTO;
import com.springboot.sfaappl.entity.StrgMeet;
import com.springboot.sfaappl.entity.StrgMeetItems;

public interface StrgMeetService {

	void createStrgMeet(StrgMeetDTO strgMeetDTO);
	
	StrgMeet mapToStrgMeetEntity(StrgMeetDTO strgMeetDTO);
	
	StrgMeetItems mapToStrgMeeItemsEntity(StrgMeetItemsDTO strgMeetItemsDTO);
	
	StrgMeetDTO mapToStrgMeetDTOEntity(StrgMeet strgMeet);
	
	StrgMeetItemsDTO mapToStrgMeeItemsDTOEntity(StrgMeetItems strgMeetItems);
}
