package com.springboot.sfaappl.service;

import org.springframework.stereotype.Service;

import com.springboot.sfaappl.dto.MessagesDTO;
import com.springboot.sfaappl.entity.Messages;
import com.springboot.sfaappl.repository.MessagesRepository;

import lombok.Builder;

@Service
public class MessagesServiceImpl implements MessagesService{

	private MessagesRepository messagesRepository;
	
	public MessagesServiceImpl(MessagesRepository messagesRepository) {
		super();
		this.messagesRepository = messagesRepository;
	}

	@Override
	public MessagesDTO createMessage(MessagesDTO messageDto) {
		
		Messages message = Messages.builder()
				.msgNo(messageDto.getMsgNo())
				.msgDescr(messageDto.getMsgDescr())
				.build();
		Messages savedMessage = this.messagesRepository.save(message);
		
		MessagesDTO msgDto = MessagesDTO.builder()
				.msgNo(savedMessage.getMsgNo())
				.msgDescr(message.getMsgDescr())
				.build();
		return msgDto;
	}

	@Override
	public MessagesDTO getMessage(String msgNo) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
