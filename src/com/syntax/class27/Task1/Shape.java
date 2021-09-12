package com.syntax.class27.Task1;

public interface Shape {
    void calculateArea(double num);
    void calculatePerimeter(double num);
}
class Circle implements Shape{
    @Override
    public void calculateArea(double r) {

        System.out.println(Math.PI*(r*r));
    }
    @Override
    public void calculatePerimeter(double d) {

        System.out.println(2*(Math.PI*d));
    }
}
class Square implements Shape{
    @Override
    public void calculateArea(double length) {

        System.out.println(length*length);
    }

    @Override
    public void calculatePerimeter(double sides) {

        System.out.println(sides*4);
    }
}
