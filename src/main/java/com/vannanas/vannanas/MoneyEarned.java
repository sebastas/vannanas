package com.vannanas.vannanas;

import java.util.ArrayList;

public class MoneyEarned {

    private static long money;
    private static long moneyEarned;

    public static long  calculateMoneyEarned(int count){
        ArrayList<Long> listMoney = new ArrayList<Long>();
        for (int i=0; i<count; i++){
            listMoney.set(i, getMoney());

        }
        moneyEarned= listMoney.get(1) - listMoney.get(0);

        return moneyEarned;
    }


    public static long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }
}
