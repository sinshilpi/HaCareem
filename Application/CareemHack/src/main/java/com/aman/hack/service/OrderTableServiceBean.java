package com.aman.hack.service;

import com.aman.hack.model.Item;
import com.aman.hack.model.OrderTable;
import com.aman.hack.repository.OrderTableRepository;
import com.aman.hack.repository.OrderTableRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


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

//    @Override
//    public List<Item> findItem(long id) {
//        return orderTableRepository.findItems(id);
//    }
}


