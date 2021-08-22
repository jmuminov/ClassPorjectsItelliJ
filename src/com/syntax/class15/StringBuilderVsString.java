package com.syntax.class15;

public class StringBuilderVsString {

    public static void main(String[] args) {

        String str = "ABCD";
        System.out.println(str.concat("Z"));
        System.out.println(str);

        StringBuilder str2 = new StringBuilder("ABCD");
        System.out.println(str2.append("Z"));
        System.out.println(str2);

        StringBuilder str3 = new StringBuilder("Sunday");
        System.out.println(str3.reverse());

        String name = "Jamoliddin";
        StringBuilder str4 = new StringBuilder(name);
        System.out.println(str4);

        name = str4.toString();

        StringBuffer strin = new StringBuffer("fsdfsdf");
    }
}
