package com.springboot.sfaappl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.sfaappl.dto.MessagesDTO;
import com.springboot.sfaappl.entity.Messages;
import com.springboot.sfaappl.service.MessagesService;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

	@Autowired
	MessagesService messagesService;
	
	@PostMapping("/createMessage")
	public ResponseEntity<MessagesDTO> createMessage(@RequestBody MessagesDTO messagesDTO){
		
		MessagesDTO message = this.messagesService.createMessage(messagesDTO);
		//MessagesDTO messagesDTO2 = MessagesDTO.builder()
		//		.msgNo(message.getMsgNo())
		//		.msgDescr(message.getMsgDescr())
		//		.build();
		
		return new ResponseEntity<MessagesDTO>(message,HttpStatus.CREATED);
	}
	
	@GetMapping("/{msgNo}")
	public ResponseEntity<MessagesDTO> getMessage(@PathVariable String msgNo){
		MessagesDTO messageDto = messagesService.getMessage(msgNo);
		
		return ResponseEntity.ok(messageDto);
	}
}
