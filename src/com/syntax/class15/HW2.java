package com.syntax.class15;

public class HW2 {

    public static void main(String[] args) {

        String father = "Jamoliddin";
        String mother = "Safina";
        String expectation = "girl";
        String firstHalf = "";
        String secondHalf = "";

        if (expectation.equalsIgnoreCase("girl")) {
            firstHalf = mother.substring(0,mother.length()/2);
            secondHalf = father.substring(father.length()/2);
            System.out.println("Girl's name should be " + firstHalf + secondHalf);
        } else {
            firstHalf = father.substring(0,father.length()/2);
            secondHalf = mother.substring(mother.length()/2);
            System.out.println("Boy's name should be " + firstHalf + secondHalf);
        }
    }
}
