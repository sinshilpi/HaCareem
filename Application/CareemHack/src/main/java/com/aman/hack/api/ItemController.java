package com.aman.hack.api;

import java.math.BigInteger;
import com.aman.hack.model.Item;
import com.aman.hack.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by aman.singhal on 2/25/17.
 */
@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "/api/item/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Item> getItem(@PathVariable("id")long id) {
        Item item = itemService.findOne(id);
        return new ResponseEntity<Item>(item, HttpStatus.OK);
    }

    @RequestMapping(value = "/api/item", method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Item> createItem(@RequestBody Item item ) {
        Item savedItem = itemService.create(item);
        return new ResponseEntity<Item>(savedItem, HttpStatus.CREATED);
    }
}
