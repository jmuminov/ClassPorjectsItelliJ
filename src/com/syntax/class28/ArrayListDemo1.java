package com.syntax.class28;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        int [] arr = {10, 20};
        int [] arr2 = new int[20];
        arr2[2] = 1234;
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("10");
        arrayList.add("20");
        System.out.println(arrayList);
        System.out.println(arrayList.get(2));
        arrayList.set(2, "1000");
        System.out.println(arrayList.get(2));
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(10);
        ArrayList<Object> arrayList2 = new ArrayList<>();
        arrayList2.add(10);
        arrayList2.add("hi");
    }
}
