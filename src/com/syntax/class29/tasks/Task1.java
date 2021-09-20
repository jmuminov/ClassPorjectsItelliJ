package com.syntax.class29.tasks;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("Tesla");
        cars.add("BMW");
        cars.add("Nio");
        for (String car : cars) {
            System.out.println(car);
        }
        System.out.println("-----------------------");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println("-----------------------");
        Iterator<String> car = cars.iterator();
        while (car.hasNext()){
            System.out.println(car.next());
        }
    }
}
