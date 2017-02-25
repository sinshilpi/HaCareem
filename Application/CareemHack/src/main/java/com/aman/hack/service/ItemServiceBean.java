package com.aman.hack.service;

import com.aman.hack.model.Item;
import com.aman.hack.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by aman.singhal on 2/25/17.
 */
@Service
public class ItemServiceBean implements ItemService {

    @Autowired
    private ItemRepository itemRepository;
    @Override
    public Item findOne(long id) {
        return itemRepository.findOne(id);
    }

    @Override
    public Item create(Item item) {
        return itemRepository.save(item);
    }
}
