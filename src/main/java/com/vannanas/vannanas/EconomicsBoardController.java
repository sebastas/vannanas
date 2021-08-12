package com.vannanas.vannanas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EconomicsBoardController {


        @GetMapping("/moneyearned")
        public long moneyEarned(int count) {
            return MoneyEarned.calculateMoneyEarned(count);
        }

    @GetMapping("/electricityprice")
    public long electricityPrice() {
        //return ElectricityPrice.getElectricityPrice();
        return 3;
    }

    @GetMapping("/environmentalcost")
    public long environmentalCost() {
        //return EnvironmentalCost.getEnvironmentalCost();
        return 7;
    }
    }

