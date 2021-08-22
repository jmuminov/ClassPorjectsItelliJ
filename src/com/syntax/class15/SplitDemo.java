package com.syntax.class15;

public class SplitDemo {

    public static void main(String[] args) {

        String str = "This   is Batch 10 Batch 10 is great";
        String[] strArr = str.split(" ");
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);
        System.out.println(strArr[3]);
    }
}
