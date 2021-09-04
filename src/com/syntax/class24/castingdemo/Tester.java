package com.syntax.class24.castingdemo;

public class Tester {
    public static void main(String[] args) {
        Abdullah abdullah = new Abdul("Abdul");
        abdullah.eat();
        abdullah.sleep();

        Abdul abdul = (Abdul) abdullah;
    }
}
