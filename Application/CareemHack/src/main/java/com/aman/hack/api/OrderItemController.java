package com.aman.hack.api;

import com.aman.hack.model.OrderItem;
import com.aman.hack.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderItemController {

    @Autowired
    private OrderItemService orderItemService;

    @RequestMapping(value = "/api/orderItem/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OrderItem> getOrderItem(@PathVariable("id")long id) {
        OrderItem orderItem = orderItemService.findOne(id);
        return new ResponseEntity<OrderItem>(orderItem, HttpStatus.OK);
    }

    @RequestMapping(value = "/api/orderItem", method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OrderItem> createOrderItem(@RequestBody OrderItem orderItem ) {
        OrderItem savedOrderItem = orderItemService.create(orderItem);
        return new ResponseEntity<OrderItem>(savedOrderItem, HttpStatus.CREATED);
    }
}