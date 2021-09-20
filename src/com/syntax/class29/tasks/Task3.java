package com.syntax.class29.tasks;

import java.util.ArrayList;
import java.util.Iterator;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("wiskey");
        drinks.add("wine");
        drinks.add("coke");
        drinks.add("beer");
        drinks.add("fanta");
        System.out.println(drinks);
        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).contains("e") || drinks.get(i).contains("a")) {
                drinks.set(i, "water");
            }
        }
        System.out.println(drinks);
    }
}
