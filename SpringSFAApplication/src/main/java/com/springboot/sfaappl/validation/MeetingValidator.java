package com.springboot.sfaappl.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.sfaappl.entity.Messages;
import com.springboot.sfaappl.entity.StrgMeet;
import com.springboot.sfaappl.repository.MessagesRepository;
import com.springboot.sfaappl.repository.StrgMeetRepository;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.Getter;
import lombok.Setter;

@Component
//@Getter
//@Setter
public class MeetingValidator implements ConstraintValidator<ValidateMeeting, StrgMeet>{
	
	@Autowired
	private StrgMeetRepository strgMeetRepository;
	
	//@Autowired
	//private MessagesRepository messagesRepository;
	
	//public MeetingValidator() {
	//	super();
	//}
	
	@Override
	public void initialize(ValidateMeeting constraintAnnotation) {
		// TODO Auto-generated method stub
		//ConstraintValidator.super.initialize(constraintAnnotation);
	}
	
	
	//@Autowired
	//public MeetingValidator(StrgMeetRepository strgMeetRepository, MessagesRepository messagesRepository) {
	//	super();
	//	System.out.println("strgMeetRepository :" + strgMeetRepository);
	//	this.strgMeetRepository = strgMeetRepository;
	//	this.messagesRepository = messagesRepository;
	//}

	@Override
	public boolean isValid(StrgMeet strgMeet, ConstraintValidatorContext context) {
		
		boolean isValid = false;
		// Disable default constraint violation.
		// This is done to display the custom validation message.
	    //context.disableDefaultConstraintViolation();
		
		if(strgMeet == null) {
			return true;
		}
		return  !this.strgMeetRepository.existsBySalesPersAndEventDateAndStrgCode(strgMeet.getSalesPers(), strgMeet.getEventDate(), strgMeet.getStrgCode());
		/*
		boolean isMeetingExist = strgMeetRepository.existsBySalesPersAndEventDateAndStrgCode(strgMeet.getSalesPers(), strgMeet.getEventDate(), strgMeet.getStrgCode());
		if(isMeetingExist) {
			
			String errorMessage = "The salesperson has already met customer " 
                    + strgMeet.getStrgCode() 
                    + " on " 
                    + strgMeet.getEventDate() + ".";
			Messages message = messagesRepository.findById("MEETEXIST").orElseThrow(() -> new RuntimeException("Message does not exist"));
			context.buildConstraintViolationWithTemplate(message.getMsgDescr())
			.addPropertyNode("strgCode")
			.addConstraintViolation();
			
			isValid = false;
		}
		*/
		/*
		boolean isActive = strgMeetRepository.isCustomerActive(strgMeet.getStrgCode());
		if(!isActive) {
			Messages message = messagesRepository.findById("CUSTINACTIVE").orElseThrow(() -> new RuntimeException("Message does not exist"));
			
			context.buildConstraintViolationWithTemplate(message.getMsgDescr())
			.addPropertyNode("strgCode")
			.addConstraintViolation();
			
			isValid = false;
		}
		*/
		//return isValid;
	}

}
