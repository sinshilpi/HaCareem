package com.aman.hack.service;

import com.aman.hack.model.OrderTable;
import com.aman.hack.repository.OrderTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderTableServiceBean implements OrderTableService{
    @Autowired
    private OrderTableRepository orderTableRepository;

    @Override
    public OrderTable findOne(long id) {
        return orderTableRepository.findOne(id);
    }

    @Override
    public OrderTable create(OrderTable orderTable) {
        return orderTableRepository.save(orderTable);
    }
}


