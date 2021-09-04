package com.syntax.class24.castingdemo.Task;

public class CollegeStudent extends Student{
    CollegeStudent(String name) {
        super(name);
    }
    @Override
    void study() {
        System.out.println(name + " studies for 4 years");
    }
    void credits() {
        System.out.println(name + " needs 120 credits to graduate");
    }
}
