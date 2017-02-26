package com.aman.hack.service;

import com.aman.hack.model.OrderItem;
import com.aman.hack.repository.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderItemServiceBean implements OrderItemService{
    @Autowired
    private OrderItemRepository orderItemRepository;

    @Override
    public OrderItem findOne(long id) {
        return orderItemRepository.findOne(id);
    }

    @Override
    public OrderItem create(OrderItem orderItem) {
        return orderItemRepository.save(orderItem);
    }
}



