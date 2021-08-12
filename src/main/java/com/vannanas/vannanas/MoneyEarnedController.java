package com.vannanas.vannanas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class MoneyEarnedController {


        @GetMapping("/moneyearned")
        public long moneyEarned(int count) {
            return MoneyEarned.calculateMoneyEarned(count);
        }
    }

