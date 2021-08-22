package com.syntax.class15;

public class HW4 {

    public static void main(String[] args) {

        String word = "Jamoliddin";
        String reversed = "";

        for(int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        System.out.println(reversed);
    }
}
