package com.syntax.class24.castingdemo.Task;

public class SchoolStudent extends Student{
    SchoolStudent(String name) {
        super(name);
    }
    @Override
    void study() {
        System.out.println(name + " studies for 12 years");
    }
    void age() {
        System.out.println(name + " starts school at age of 5-6");
    }
}
