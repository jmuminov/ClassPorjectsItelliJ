package com.syntax.class30;

import java.util.*;

public class Demo6 {
    public static void main(String[] args) {
        HashMap<Double, String> employee = new LinkedHashMap<>();
        employee.put(1.0, "Kevin");
        employee.put(2.0, "Michael");
        employee.put(3.0, "Sule");
        employee.put(4.0, "Olena");
        employee.put(5.0, "Noor");
        System.out.println(employee);

        Set<Double> mapKeys = employee.keySet();
        Iterator<Double> iterator = mapKeys.iterator();

        while(iterator.hasNext()) {
            Double key = iterator.next();
            System.out.println(key);
        }
    }
}
