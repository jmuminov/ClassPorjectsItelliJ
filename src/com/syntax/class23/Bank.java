package com.syntax.class23;

public class Bank {
    double money;
    double fee;

    public Bank(double money) {
        this.money = money;
    }
    public void chargeFee() {
        if(money < 1000) {
            fee = money * 0.01;
        } else {
            fee = money * 0.02;
        }
    }
}

class BOA extends Bank {
    BOA(double money) {
        super(money);
    }
    @Override
    public void chargeFee() {
        if(money < 500) {
            fee = money * 0.02;
        } else {
            fee = 0;
        }
    }
}

class Chase extends Bank {
    Chase(double money) {
        super(money);
    }
    @Override
    public void chargeFee() {
        fee = 0;
    }
}
