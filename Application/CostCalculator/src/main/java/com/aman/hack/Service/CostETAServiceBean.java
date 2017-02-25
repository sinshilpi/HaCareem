package com.aman.hack.Service;

import com.aman.hack.model.CostETA;
import org.springframework.stereotype.Service;

/**
 * Created by aman.singhal on 2/26/17.
 */
@Service
public class CostETAServiceBean implements CostETAService {

    @Override
    public CostETA findCostETA(long length, long breadth, long height, long distance, long weight)
    {
        int cost = 0;
        //step1:cost calc based on weight
        if(weight<=100)
            cost+=100;
        else if(weight<=300)
            cost+=300;
        else  if(weight<=500)
            cost+=500;
        else
            cost+=1000;
        //step2:cost calc based on volume

        long volume = length*breadth*height;

        if(volume<=100)
            cost+=100;
        else if(volume<=300)
            cost+=300;
        else if(volume<=500)
            cost+=500;
        else
            cost+=1000;

        //step3:cost calc based on distance
        cost+=distance*16;
        //step4:cost calc based on fragility
        cost+=1000;


        //ETA calc
        int ETA = 0;
        if(distance<=100)
            ETA+=4;
        else if(distance<=500)
            ETA+=9;
        else if(distance<=1000)
            ETA+=15;
        else
            ETA+=30;

        CostETA ce = new CostETA();
        ce.setEta(ETA);
        ce.setCost(cost);
        return ce;
    }
}
