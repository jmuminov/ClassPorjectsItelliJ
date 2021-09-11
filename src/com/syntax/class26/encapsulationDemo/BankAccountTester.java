package com.syntax.class26.encapsulationDemo;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setName("safsadfasf");
        bankAccount.setPassword("123456");
        System.out.println(bankAccount.getBalance("561651"));
    }
}
