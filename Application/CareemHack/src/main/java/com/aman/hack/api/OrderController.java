package com.aman.hack.api;

import com.aman.hack.model.OrderTable;
import com.aman.hack.service.OrderTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class OrderController {
    @Autowired
    private OrderTableService orderTableService;

    @RequestMapping(value = "/api/orderTable/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OrderTable> getOrderTable(@PathVariable("id")long id) {
        OrderTable orderTable = orderTableService.findOne(id);
        return new ResponseEntity<OrderTable>(orderTable, HttpStatus.OK);
    }

    @RequestMapping(value = "/api/orderTable", method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OrderTable> createOrderTable(@RequestBody OrderTable orderTable ) {
        OrderTable savedPartner = orderTableService.create(orderTable);
        return new ResponseEntity<OrderTable>(savedPartner, HttpStatus.CREATED);
    }
}