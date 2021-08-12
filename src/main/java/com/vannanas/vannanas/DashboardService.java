package com.vannanas.vannanas;

import java.util.ArrayList;


public class DashboardService {

    private double moneyEarnedLastHour;
    private final long maxWaterLevel = 40;
    private final long minWaterLevel = 25;
    private final long fine = 10000;
    private final double maxTurbineEffect = 69.3; //MW per hour

    public double calculateMoneyEarned(long waterLevel, long electricityPrice, ArrayList<Boolean> turbineStatus){
        long activeTurbines = turbineStatus.stream().filter(p -> p == true).count();
        long environmentalCost = calculateEnvironmentalCost(waterLevel);
        double incomeBeforeEnvironmentalCost = electricityPrice*maxTurbineEffect*activeTurbines;

        moneyEarnedLastHour = incomeBeforeEnvironmentalCost-environmentalCost;
        return moneyEarnedLastHour;
    }

    public long calculateEnvironmentalCost(long waterLevel){
        long totalFine = 0;
        //If waterLevel is outside of min and max value sat by the government, a fine is added
        if (waterLevel<minWaterLevel || waterLevel>maxWaterLevel){
            totalFine += fine;
        }
        return totalFine;
    }
}
