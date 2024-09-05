package com.springboot.sfaappl.service;

import java.util.List;

import com.springboot.sfaappl.dto.ItemDTO;

public interface ItemService {
	
	ItemDTO createItem(ItemDTO itemDto);
	List<ItemDTO> getAllItems();

}
