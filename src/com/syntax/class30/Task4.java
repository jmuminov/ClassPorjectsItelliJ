package com.syntax.class30;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task4 {
    public static void main(String[] args) {
        Map<Integer, String> building = new TreeMap<>();
        building.put(1, "Google");
        building.put(2, "Syntax");
        building.put(3, "Syntax");
        building.put(3, "NotSyntax");
        building.put(4, "Google");
        building.put(5, "Amazon");
        building.put(6, "Ahead");
        building.put(7, "Linux");
        System.out.println(building.size());
        building.put(4, "Ahead");
        building.remove(7);
        System.out.println(building);
    }
}
