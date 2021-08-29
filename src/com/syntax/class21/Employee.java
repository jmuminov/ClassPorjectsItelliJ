package com.syntax.class21;

public class Employee extends Person {
    Employee(String name, int age, double height, double weight) {
        super(name, age, height, weight);
    }
    void getPaid() {
        //super("name", 10, 10, 10);
    }
    Employee(String name, int age, double height) {
        super(name, age, height);
    }
    public static void main(String[] args) {
        Employee employee = new Employee("Oxana", 16, 5.5, 35);
        employee.eat();
        employee.sleep();
        System.out.println(employee.name);
        System.out.println(employee.age);
        System.out.println(employee.height);
        System.out.println(employee.weight);
    }
}
