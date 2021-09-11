package com.syntax.class26.interfaceDemo;

public interface Trustable {
    void trust();
}
interface Bank extends Trustable{
    void hasChecking();
    void hasSavings();
    default void hasCreditCard() {
        System.out.println("Almost all of the banks have credit cards");
    }
    static void depositMoney() {
        System.out.println("You can deposit in your bank");
    }
}
class FinancialInstitutation {
    public void financing() {
        System.out.println("All the financial institutes deal with finances");
    }
}
class BOA extends FinancialInstitutation implements Bank {

    @Override
    public void trust() {
        System.out.println("You can not trust BOA with your money");
    }

    @Override
    public void hasChecking() {
        System.out.println("BOA has 3 checking accounts");
    }

    @Override
    public void hasSavings() {
        System.out.println("BOA has 2 savings accounts");
    }
}
