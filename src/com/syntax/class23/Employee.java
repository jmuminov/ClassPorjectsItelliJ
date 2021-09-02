package com.syntax.class23;

public class Employee {
    String name;
    double salary;


    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;

    }
    void getPaid() {
        System.out.println(name + " is getting paid " + salary + "/anum");
    }

}

class Contractor extends Employee {
    Contractor(String name, double salary) {
        super(name, salary);
    }
    void getPaid() {
        System.out.println(name + " is getting paid " + salary + "/hourly");
    }
}

class FullTimeEmployee extends Employee {
    FullTimeEmployee(String name, double salary) {
        super(name, salary);
    }

    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Dilnoza", 100000);
        fullTimeEmployee.getPaid();
        Contractor contractor = new Contractor("Jesus", 45);
        contractor.getPaid();
    }
}
