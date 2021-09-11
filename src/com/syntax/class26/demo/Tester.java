package com.syntax.class26.demo;

public class Tester {
    public static void main(String[] args) {
        Car car = new Mercedes();
        car.start();
        car.stop();
        Drivable drivable = new Mercedes();
        drivable.drive();
        ((Mercedes)drivable).start();
        //drivable.start(); Can't be called
    }
}
