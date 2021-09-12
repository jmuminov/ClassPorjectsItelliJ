package com.syntax.class27.Task11;

public class ShapeTester {
    public static void main(String[] args) {
        Circle circle = new Circle(8);
        Square square = new Square(8);
        circle.calculateArea();
        circle.calculatePerimeter();
        square.calculateArea();
        square.calculatePerimeter();
    }
}
