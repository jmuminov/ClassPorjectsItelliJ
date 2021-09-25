package com.syntax.class30;

import java.util.HashMap;

public class Demo3 {
    public static void main(String[] args) {
        HashMap<String, Double> groceries = new HashMap<>();
        groceries.put("Egg", 12.0);
        groceries.put("Tomatoes", 5.5);
        groceries.put("Milk", 2.5);
        groceries.put("Potatoes", 4.2);
        groceries.put("Steak", 3.5);
        System.out.println(groceries);
        groceries.put(null, null);
        groceries.put("Shirt", null);
        //groceries.put(null, 5.0);
        groceries.put("Orange", null);
        System.out.println(groceries);
    }
}
