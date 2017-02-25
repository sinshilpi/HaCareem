package com.aman.hack.api;

import com.aman.hack.Service.CostETAServiceBean;
import com.aman.hack.model.CostETA;
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
public class CostETAController {
    @Autowired
    private CostETAServiceBean costServiceBean;
    @RequestMapping(value = "/api/findCostETA", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CostETA> getItem(@RequestParam("length") long length, @RequestParam("breadth") long breadth,
            @RequestParam("height") long height, @RequestParam("distance") long distance) {
        CostETA cost = costServiceBean.findCostETA(length, breadth, height, distance);
        return new ResponseEntity<CostETA>(cost, HttpStatus.OK);
    }
}
