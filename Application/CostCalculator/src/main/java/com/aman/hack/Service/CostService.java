package com.aman.hack.Service;

import com.aman.hack.model.Cost;

/**
 * Created by aman.singhal on 2/26/17.
 */
public interface CostService {

    Cost findCost(long length, long breadth, long height, long distance);
}
