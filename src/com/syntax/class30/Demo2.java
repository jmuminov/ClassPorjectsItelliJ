package com.syntax.class30;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Demo2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(123, "Olena");
        map.put(124, "Olena1");
        map.put(125, "Olena2");
        map.put(126, "Olena3");
        map.put(127, "Olena4");

        Map<Integer, String> map2 = new TreeMap<>();
        map.put(1234, "Olena");
        map.put(1244, "Olena1");
        map.put(1254, "Olena2");
        map.put(1264, "Olena3");
        map.put(1274, "Olena4");

        //map2.putAll(map);
        map2.remove(1244);
        System.out.println(map2);
    }
}
