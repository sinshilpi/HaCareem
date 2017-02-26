package com.aman.hack.service;

import com.aman.hack.model.Item;
import com.aman.hack.model.OrderTable;

import java.util.List;

public interface OrderTableService {
    OrderTable findOne(long id);
    OrderTable create(OrderTable orderTable);
//    List<Item> findItem(long id);
}

