package com.syntax.class26.demo;

public interface Drivable {
    boolean Fast = true;
    void drive();
}
abstract class Car {
    public void stop() {
        System.out.println("A car can stop");
    }
    public abstract void start();
}
class Mercedes extends Car implements Drivable {

    @Override
    public void drive() {
        System.out.println("Mercedes can drive");
    }

    @Override
    public void start() {
        System.out.println("Mercedes can start");
    }
}
