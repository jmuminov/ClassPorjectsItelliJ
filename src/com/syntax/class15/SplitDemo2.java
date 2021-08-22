package com.syntax.class15;

public class SplitDemo2 {

    public static void main(String[] args) {

        String str = "This is Batch 10";
        String[] strArr = str.split("i");
        System.out.println(strArr.length);
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);
    }
}
