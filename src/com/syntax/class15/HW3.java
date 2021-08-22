package com.syntax.class15;

public class HW3 {

    public static void main(String[] args) {

        String str = "words";

        if (!str.isEmpty()) {
            if (str.length() % 2 != 0 && str.length() >= 3) {
                System.out.println(str.charAt(str.length()/2));
            }
        }
    }
}
