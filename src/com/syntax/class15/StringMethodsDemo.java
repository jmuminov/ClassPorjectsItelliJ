package com.syntax.class15;

public class StringMethodsDemo {

    public static void main(String[] args) {

        String str = "I am a good tester. I am a good person";
        System.out.println(str.replace("a", "A"));

        String str2 = "fsd#@!#WDWgeg443g3FEEF4g*^%*h43vw3";
        System.out.println(str2.replaceAll("[0-9]", "+"));

        System.out.println(str2.replaceAll("[a-z0-9]", ""));

        System.out.println(str2.replaceAll("[^a-z0-9A-Z]", ""));
    }
}
