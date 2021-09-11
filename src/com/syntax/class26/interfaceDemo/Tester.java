package com.syntax.class26.interfaceDemo;

public class Tester {
    public static void main(String[] args) {
        Trustable trustable = new BOA();
        trustable.trust();

        Bank bank = new BOA();
        bank.trust();
        bank.hasChecking();
        bank.hasSavings();
        bank.hasCreditCard();

        Bank.depositMoney();

        BOA boa = new BOA();
        boa.trust();
        boa.hasChecking();
        boa.hasSavings();
        boa.hasCreditCard();
        boa.financing();
    }
}
