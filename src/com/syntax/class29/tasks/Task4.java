package com.syntax.class29.tasks;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 2; i <= 50; i+=2) {
            num.add(i);
        }
        System.out.println(num);
        Iterator<Integer> iterator = num.iterator();
        while(iterator.hasNext()) {
            if(iterator.next() % 5 == 0) {
                iterator.remove();
            }
        }
        System.out.println(num);
    }
}
