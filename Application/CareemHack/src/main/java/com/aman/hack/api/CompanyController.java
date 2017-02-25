package com.aman.hack.api;

import com.aman.hack.model.Company;
import com.aman.hack.service.CompanyService;
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
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @RequestMapping(value = "/api/company/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Company> getCompany(@PathVariable("id")long id) {
        Company company = companyService.findOne(id);
        return new ResponseEntity<Company>(company, HttpStatus.OK);
    }

    @RequestMapping(value = "/api/company", method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Company> createCompany(@RequestBody Company company ) {
        Company savedCompany = companyService.create(company);
        return new ResponseEntity<Company>(savedCompany, HttpStatus.CREATED);
    }
}