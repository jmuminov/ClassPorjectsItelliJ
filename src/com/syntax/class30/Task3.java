package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        Map<String, Double> items = new LinkedHashMap<>();
        items.put("Soap", 5.9);
        items.put("Towel", 5.1);
        items.put("Blanket", 2.1);
        items.put("Pillow", 3.0);
        System.out.println(items.size());

        Set<String> keys = items.keySet();
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if(item.contains("o")) {
                iterator.remove();
            }
        }
        System.out.println(items);
    }
}
