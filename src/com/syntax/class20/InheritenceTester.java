package com.syntax.class20;

public class InheritenceTester {
    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.eat();
        Tester test = new Tester();
        test.name = "Blake";
        test.eat();
        test.testCode();
    }
}
