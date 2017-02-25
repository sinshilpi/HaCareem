package com.aman.hack.api;

import com.aman.hack.Service.CostServiceBean;
import com.aman.hack.model.Cost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by aman.singhal on 2/25/17.
 */
@RestController
public class CostController {
    @Autowired
    private CostServiceBean costServiceBean;
    @RequestMapping(value = "/api/findCost", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Cost> getItem(@RequestParam("length") long length, @RequestParam("breadth") long breadth,
            @RequestParam("height") long height, @RequestParam("distance") long distance) {
        Cost cost = costServiceBean.findCost(length, breadth, height, distance);
        return new ResponseEntity<Cost>(cost, HttpStatus.OK);
    }
}
