package com.syntax.class23;

public class Tester {
    public static void main(String[] args) {
        Bank bank = new Bank(1500);
        bank.chargeFee();
        System.out.println(bank.fee);
        BOA boa = new BOA(1500);
        boa.chargeFee();
        System.out.println(boa.fee);
        Chase chase = new Chase(1500);
        System.out.println(chase.fee);
    }
}
