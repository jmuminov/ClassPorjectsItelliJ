package com.syntax.class16;

public class StudentsTester {
    public static void main(String[] args) {
        Students s1 = new Students();
        Students s2 = new Students();
        Students s3 = new Students();

        s1.studentID = "wqfqw";
        s1.studentName = "Jamoliddin";
        s1.inr();

        s2.studentID = "fwgsd";
        s2.studentName = "Dilnoza";
        s2.inr();

        s3.studentID = "fwsdgsd";
        s3.studentName = "Andrei";
        s3.inr();

        System.out.println("Number of students = " + Students.numberOfStudents);
    }
}
