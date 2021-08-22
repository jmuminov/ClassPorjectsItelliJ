package com.syntax.class16;

public class SyntaxStudentTester {

    public static void main(String[] args) {

        SyntaxStudents student1 = new SyntaxStudents();
        student1.name = "Jamoliddn";
        student1.age = 28;
        student1.id = "qazedc";
        student1.displayFee();
        SyntaxStudents.schoolName = "Syntax techs";
        System.out.println(SyntaxStudents.schoolName);

        SyntaxStudents student2 = new SyntaxStudents();
        student2.name = "Dilnoza";
        student2.age = 28;
        student2.id = "qwerty";
        System.out.println(SyntaxStudents.schoolName);
    }
}
