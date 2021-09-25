package com.syntax.class30;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Map<String, Integer> fruits = new HashMap<>();
        fruits.put("Kiwi", 10);
        fruits.put("Melon", 5);
        fruits.put("Mango", 7);
        fruits.put("Peach", 9);
        fruits.put("Apple", 12);
        fruits.put("Orange", 19);
        System.out.println(fruits);
        System.out.println(fruits.get("Peach"));
        System.out.println(fruits.containsKey("Mango"));
        System.out.println(fruits.containsValue(29));
        fruits.remove("Orange");
        System.out.println(fruits);
        fruits.replace("peach", 1);
        System.out.println(fruits);
    }
}
