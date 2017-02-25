package com.aman.hack.service;

import com.aman.hack.model.Hub;

public interface HubService {

    Hub findOne(long id);
    Hub create(Hub hub);
}
