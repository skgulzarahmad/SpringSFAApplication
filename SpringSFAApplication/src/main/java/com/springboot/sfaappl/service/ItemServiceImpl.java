package com.springboot.sfaappl.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.sfaappl.dto.ItemDTO;
import com.springboot.sfaappl.entity.Item;
import com.springboot.sfaappl.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService{

	private ItemRepository itemRepository;
		
	public ItemServiceImpl(ItemRepository itemRepository) {
		super();
		this.itemRepository = itemRepository;
	}

	@Override
	public ItemDTO createItem(ItemDTO itemDto) {
		
		Item item = Item.builder()
				.itemCode(itemDto.getItemCode())
				.name(itemDto.getName())
				.rate(itemDto.getRate())
				.itemSer(itemDto.getItemSer())
				.build();
		
		Item newItem = this.itemRepository.save(item);
		
		ItemDTO itemDTO2 = ItemDTO.builder()
				.itemCode(newItem.getItemCode())
				.name(newItem.getName())
				.rate(newItem.getRate())
				.itemSer(newItem.getItemSer())
				.build();
		return itemDTO2;
	}

	@Override
	public List<ItemDTO> getAllItems() {
		// TODO Auto-generated method stub
		return null;
	}

}
