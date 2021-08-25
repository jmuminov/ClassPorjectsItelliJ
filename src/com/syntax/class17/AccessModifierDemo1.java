package com.syntax.class17;

public class AccessModifierDemo1 {
    private String name;
    int age;
    public double height;
    protected String city;

    public void method3() {
        System.out.println(height);
        System.out.println(age);
    }

    private void method1() {
        System.out.println(name);
        System.out.println(age);
    }

    void method2() {
        System.out.println(name);
        System.out.println(age);
        method1();
    }

    protected void method4() {
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        AccessModifierDemo1 accessModifierDemo1 = new AccessModifierDemo1();
        System.out.println(accessModifierDemo1.age);
        System.out.println(accessModifierDemo1.name);
        accessModifierDemo1.method1();
        accessModifierDemo1.method4();
    }

}
