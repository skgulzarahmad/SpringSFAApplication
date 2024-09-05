package com.springboot.sfaappl.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.sfaappl.dto.ItemDTO;
import com.springboot.sfaappl.service.ItemService;

@RestController
@RequestMapping("/api/item")
public class ItemController {
	private ItemService itemService;

	public ItemController(ItemService itemService) {
		super();
		this.itemService = itemService;
	}
	@PostMapping("/createItem")
	public ResponseEntity<ItemDTO> createItem(@RequestBody ItemDTO itemDTO){
		
		return new ResponseEntity<ItemDTO>(this.itemService.createItem(itemDTO), HttpStatus.CREATED);
	}

}
