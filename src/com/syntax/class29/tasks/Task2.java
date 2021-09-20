package com.syntax.class29.tasks;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Home");
        words.add("Car");
        words.add("Syntax");
        words.add("10");
        words.add("nine");
        Iterator<String> iterator = words.iterator();
        System.out.println(iterator);
        while(iterator.hasNext()) {
            String word = iterator.next();
            if(word.endsWith("e") || word.endsWith("E")) {
                iterator.remove();
            }
        }
        System.out.println(iterator);
    }
}
