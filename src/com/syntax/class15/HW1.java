package com.syntax.class15;

public class HW1 {

    public static void main(String[] args) {

        String username = "jmuminov";
        String password = "pass1234";
        String confirmPass = "qazwsx";

        if (!(username.isEmpty() || !password.isEmpty())) {

            if(password.length() >= 8) {

                if(!password.contains(username)) {

                    if(password.equals(confirmPass)) {
                        System.out.println("Your username and password have been created");
                    } else {
                        System.out.println("Passwords do not match");
                    }
                } else {
                    System.out.println("Password cannot contain username");
                }
            } else {
                System.out.println("Password is too short");
            }
        } else {
            System.out.println("Username and Password cannot be empty");
        }
    }
}
