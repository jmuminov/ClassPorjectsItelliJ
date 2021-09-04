package com.syntax.class24.castingdemo.Task;

public class SyntaxStudent extends Student{
    SyntaxStudent(String name) {
        super(name);
    }
    @Override
    void study() {
        System.out.println(name + " studies for 6 months");
    }
    void graduate() {
        System.out.println(name + " graduates in 6 months");
    }
}
