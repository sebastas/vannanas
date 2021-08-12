package com.vannanas.vannanas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class MoneyEarnedController {

    long moneyEarned;

        @GetMapping("/moneyearned")
        public long moneyEarned(int count) {
            ArrayList<Long> listMoney = new ArrayList<Long>();
            for (int i=0; i<count; i++){
                listMoney.set(i, MoneyEarned.getMoney());

            }
            moneyEarned= listMoney.get(0) + listMoney.get(1);

            return moneyEarned;
        }
    }

