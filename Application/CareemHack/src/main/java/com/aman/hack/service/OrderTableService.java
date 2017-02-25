package com.aman.hack.service;

import com.aman.hack.model.OrderTable;

public interface OrderTableService {
    OrderTable findOne(long id);
    OrderTable create(OrderTable orderTable);
}

