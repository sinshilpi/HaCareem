package com.aman.hack.service;

import com.aman.hack.model.Hub;
import com.aman.hack.repository.HubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HubServiceBean implements HubService{
    @Autowired
    private HubRepository hubRepository;

    @Override
    public Hub findOne(long id) {
        return hubRepository.findOne(id);
    }

    @Override
    public Hub create(Hub hub) {
        return hubRepository.save(hub);
    }
}
