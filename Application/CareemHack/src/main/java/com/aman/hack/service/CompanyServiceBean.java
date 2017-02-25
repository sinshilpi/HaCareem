package com.aman.hack.service;

import com.aman.hack.model.Company;
import com.aman.hack.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceBean implements CompanyService{
    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public Company findOne(long id) {
        return companyRepository.findOne(id);
    }

    @Override
    public Company create(Company company) {
        return companyRepository.save(company);
    }
}

