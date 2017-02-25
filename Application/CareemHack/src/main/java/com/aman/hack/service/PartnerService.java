package com.aman.hack.service;

import com.aman.hack.model.Partner;

public interface PartnerService {
    Partner findOne(long id);
    Partner create(Partner partner);
}
