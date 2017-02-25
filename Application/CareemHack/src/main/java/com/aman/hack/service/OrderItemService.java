package com.aman.hack.service;

import com.aman.hack.model.OrderItem;

public interface OrderItemService {
    OrderItem findOne(long id);
    OrderItem create(OrderItem orderItem);
}

