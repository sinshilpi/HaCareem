package com.aman.hack.service;

import com.aman.hack.model.Item;

/**
 * Created by aman.singhal on 2/25/17.
 */
public interface ItemService {

    Item findOne(long id);
    Item create(Item item);
}
