package com.syntax.class26.encapsulation;

public class PersonTester {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Jamol");
        person.setAge(28);
        person.setWeight(180);
/*        person.name = "Jamol";
        person.age = 28;
        person.weight = 180;
        person.height = 6;*/
        person.printInfo();
    }

}
