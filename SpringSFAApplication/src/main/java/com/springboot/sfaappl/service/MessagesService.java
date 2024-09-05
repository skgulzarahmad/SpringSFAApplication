package com.springboot.sfaappl.service;

import org.apache.logging.log4j.message.Message;

import com.springboot.sfaappl.dto.MessagesDTO;
import com.springboot.sfaappl.entity.Messages;

public interface MessagesService {

	MessagesDTO createMessage(MessagesDTO messageDto);
	
	MessagesDTO getMessage(String msgNo);
}
