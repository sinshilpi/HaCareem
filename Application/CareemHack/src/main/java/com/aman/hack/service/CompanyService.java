package com.aman.hack.service;

import com.aman.hack.model.Company;

public interface CompanyService {
    Company findOne(long id);
    Company create(Company company);
}
