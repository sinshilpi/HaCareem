package com.aman.hack.Service;

import com.aman.hack.model.CostETA;

/**
 * Created by aman.singhal on 2/26/17.
 */
public interface CostETAService {

    CostETA findCostETA(long length, long breadth, long height, long distance, long weight);
}
