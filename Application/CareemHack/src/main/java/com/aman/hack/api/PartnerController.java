package com.aman.hack.api;

import com.aman.hack.model.Partner;
import com.aman.hack.service.PartnerService;
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
public class PartnerController {
    @Autowired
    private PartnerService partnerService;

    @RequestMapping(value = "/api/partner/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Partner> getPartner(@PathVariable("id")long id) {
        Partner partner = partnerService.findOne(id);
        return new ResponseEntity<Partner>(partner, HttpStatus.OK);
    }

    @RequestMapping(value = "/api/partner", method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Partner> createPartner(@RequestBody Partner partner ) {
        Partner savedPartner = partnerService.create(partner);
        return new ResponseEntity<Partner>(savedPartner, HttpStatus.CREATED);
    }
}