package com.syntax.class28.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Michael");
        list.add("Andrei");
        list.add("Sule");
        list.add("Abdul");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Mars");
        list1.add("Eugene");
        list1.add("Dilnoza");
        list.addAll(list1);
    }
}
