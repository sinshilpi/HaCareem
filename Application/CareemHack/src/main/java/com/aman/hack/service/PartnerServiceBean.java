package com.aman.hack.service;

import com.aman.hack.model.Partner;
import com.aman.hack.repository.PartnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartnerServiceBean implements PartnerService{
    @Autowired
    private PartnerRepository partnerRepository;

    @Override
    public Partner findOne(long id) {
        return partnerRepository.findOne(id);
    }

    @Override
    public Partner create(Partner partner) {
        return partnerRepository.save(partner);
    }
}

