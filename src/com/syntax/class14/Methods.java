package com.syntax.class14;

public class Methods {

    int [] doubleTheArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]*2;
        }
        return arr;
    }
}
