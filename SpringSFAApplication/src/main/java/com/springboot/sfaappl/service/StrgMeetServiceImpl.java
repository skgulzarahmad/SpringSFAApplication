package com.springboot.sfaappl.service;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.sfaappl.dto.StrgMeetDTO;
import com.springboot.sfaappl.dto.StrgMeetItemsDTO;
import com.springboot.sfaappl.entity.StrgMeet;
import com.springboot.sfaappl.entity.StrgMeetItems;
import com.springboot.sfaappl.repository.StrgMeetItemsRepository;
import com.springboot.sfaappl.repository.StrgMeetRepository;


@Service
public class StrgMeetServiceImpl implements StrgMeetService{
	
	private StrgMeetRepository strgMeetRepository;
		
	public StrgMeetServiceImpl(StrgMeetRepository strgMeetRepository) {
		super();
		this.strgMeetRepository = strgMeetRepository;
	}

	@Override
	@Transactional
	public void createStrgMeet(StrgMeetDTO strgMeetDTO) {
		
		//Changed code 
		StrgMeet strgMeet = mapToStrgMeetEntity(strgMeetDTO);
		strgMeet.getMeetItems().forEach(item -> {
			strgMeet.addMeetItems(item);
		});
		
		this.strgMeetRepository.save(strgMeet);

		
		/*
		//Running Code
		StrgMeet strgMeet = mapToStrgMeetEntity(strgMeetDTO);
		
		// Save the Header meet data first to get tranId
	    StrgMeet savedStrgMeet = this.strgMeetRepository.save(strgMeet);
	    
	    //System.out.println("savedStrgMeet ::"+savedStrgMeet);
	    
	    Long tranId = savedStrgMeet.getTranId();
	    
	    System.out.println("tranId =["+tranId+"]");
	    
	    //Set tranId for each StrgMeetItems
        Set<StrgMeetItems> itemsWithTranId = strgMeetDTO.getMeetItems().stream()
            .map(itemDTO -> {
                StrgMeetItems item = mapToStrgMeeItemsEntity(itemDTO);
                item.setTranId(tranId); // Set tranId before saving
                item.setStrgMeet(strgMeet); // Set reference to parent StrgMeet
                System.out.println("tranId11 =["+item.getTranId()+"]");
                return item;
            })
            .collect(Collectors.toSet());
        
        this.strgMeetItemsRepository.saveAll(itemsWithTranId);
        */
        /*
        for(StrgMeetItems meetItem : itemsWithTranId) {
        	System.out.println("meetItem ::"+meetItem);
        	this.strgMeetItemsRepository.save(meetItem);
        }
        */
	    /*
	    savedStrgMeet.getMeetItems().forEach(item -> {
            item.setTranId(savedStrgMeet.getTranId());
            item.setStrgMeet(savedStrgMeet);
        });

        // Save items now that tranId is set
        this.strgMeetRepository.save(savedStrgMeet);
        */
	}

	@Override
	public StrgMeet mapToStrgMeetEntity(StrgMeetDTO strgMeetDTO) {
		
		 StrgMeet strgMeet = new StrgMeet();
	        strgMeet.setEventDate(strgMeetDTO.getEventDate());
	        strgMeet.setEventType(strgMeetDTO.getEventType());
	        strgMeet.setStrgCode(strgMeetDTO.getStrgCode());
	        strgMeet.setStrgName(strgMeetDTO.getStrgName());
	        strgMeet.setSalesPers(strgMeetDTO.getSalesPers());
	        strgMeet.setRouteId(strgMeetDTO.getRouteId());
	        strgMeet.setRouteName(strgMeetDTO.getRouteName());
	        strgMeet.setConfirmed(strgMeetDTO.getConfirmed());

	        // Convert StrgMeetItemDTO to StrgMeetItems entities
	        Set<StrgMeetItems> items = strgMeetDTO.getMeetItems().stream()
	            .map(this::mapToStrgMeeItemsEntity)
	            .collect(Collectors.toSet());
	        strgMeet.setMeetItems(items);

	        return strgMeet;
	}

	@Override
	public StrgMeetItems mapToStrgMeeItemsEntity(StrgMeetItemsDTO strgMeetItemsDTO) {
		StrgMeetItems item = new StrgMeetItems();
		//item.setTranId(strgMeetItemsDTO.getTranId());
        //item.setLineNo(strgMeetItemsDTO.getLineNo());
        item.setStrgCode(strgMeetItemsDTO.getStrgCode());
        item.setItemCode(strgMeetItemsDTO.getItemCode());
        item.setQuantity(strgMeetItemsDTO.getQuantity());

        return item;
	}

	@Override
	public StrgMeetDTO mapToStrgMeetDTOEntity(StrgMeet strgMeet) {
		StrgMeetDTO strgMeetDTO = new StrgMeetDTO();
		strgMeetDTO.setEventDate(strgMeet.getEventDate());
		strgMeetDTO.setEventType(strgMeet.getEventType());
		strgMeetDTO.setStrgCode(strgMeet.getStrgCode());
		strgMeetDTO.setStrgName(strgMeet.getStrgName());
		strgMeetDTO.setSalesPers(strgMeet.getSalesPers());
		strgMeetDTO.setRouteId(strgMeet.getRouteId());
		strgMeetDTO.setRouteName(strgMeet.getRouteName());
		strgMeetDTO.setConfirmed(strgMeet.getConfirmed());

        // Convert StrgMeetItem to StrgMeetItemsDTO entities
        Set<StrgMeetItemsDTO> items = strgMeet.getMeetItems().stream()
            .map(this::mapToStrgMeeItemsDTOEntity)
            .collect(Collectors.toSet());
        strgMeetDTO.setMeetItems(items);

        return strgMeetDTO;
	}

	@Override
	public StrgMeetItemsDTO mapToStrgMeeItemsDTOEntity(StrgMeetItems strgMeetItems) {
		StrgMeetItemsDTO itemDTO = new StrgMeetItemsDTO();
		itemDTO.setLineNo(strgMeetItems.getLineNo());
		itemDTO.setStrgCode(strgMeetItems.getStrgCode());
		itemDTO.setItemCode(strgMeetItems.getItemCode());
		itemDTO.setQuantity(strgMeetItems.getQuantity());

        return itemDTO;
	}
}
