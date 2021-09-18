package com.syntax.class28.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Abdul");
        list.add("Andrei");
        list.add("Sule");
        list.add("Andrei");
        list.add("Michael");
        list.add("Andrei");
        list.add("Kevin");
        list.add("Andrei");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Michael");
        list1.add("Andrei");
        list1.add("Kevin");
        list.removeAll(list1);
        System.out.println(list);
    }
}
