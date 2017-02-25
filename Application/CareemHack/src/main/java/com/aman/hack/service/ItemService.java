package com.aman.hack.service;

import com.aman.hack.model.Item;

public interface ItemService {

    Item findOne(long id);
    Item create(Item item);
}
