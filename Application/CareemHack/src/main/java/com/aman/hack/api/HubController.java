package com.aman.hack.api;

import com.aman.hack.model.Hub;
import com.aman.hack.service.HubService;
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
public class HubController {
    @Autowired
    private HubService hubService;

    @RequestMapping(value = "/api/hub/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Hub> getHub(@PathVariable("id")long id) {
        Hub hub = hubService.findOne(id);
        return new ResponseEntity<Hub>(hub, HttpStatus.OK);
    }

    @RequestMapping(value = "/api/hub", method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Hub> createHub(@RequestBody Hub hub ) {
        Hub savedHub = hubService.create(hub);
        return new ResponseEntity<Hub>(savedHub, HttpStatus.CREATED);
    }
}
