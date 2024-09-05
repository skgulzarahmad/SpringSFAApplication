package com.springboot.sfaappl.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.springboot.sfaappl.dto.StrgMeetDTO;
import com.springboot.sfaappl.dto.StrgMeetItemsDTO;
import com.springboot.sfaappl.entity.StrgMeet;
import com.springboot.sfaappl.entity.StrgMeetItems;


public interface EntityAndDTOMapper {
	
	EntityAndDTOMapper INSTANCE = Mappers.getMapper(EntityAndDTOMapper.class);

    StrgMeetDTO toDto(StrgMeet entity);
    StrgMeet toEntity(StrgMeetDTO dto);

    StrgMeetItemsDTO toDto(StrgMeetItems entity);
    StrgMeetItems toEntity(StrgMeetItemsDTO dto);

}
