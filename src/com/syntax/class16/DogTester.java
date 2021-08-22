package com.syntax.class16;

public class DogTester {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Bingo";
        dog1.color = "white";
        dog1.Breed = "Husky";

        Dog dog2 = new Dog();
        dog2.color = "black";
        System.out.println(dog2.name);
        System.out.println(dog2.Breed);
    }
}
