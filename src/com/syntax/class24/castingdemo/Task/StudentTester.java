package com.syntax.class24.castingdemo.Task;

public class StudentTester {
    public static void main(String[] args) {
        Student student = new SyntaxStudent("Jamol");
        student.study();
        student.learn();
        ((SyntaxStudent)student).graduate();
       /* Student safina = new CollegeStudent("Safina");
        safina.study();
        safina.learn();
        ((CollegeStudent)safina).credits();
        Student lamis = new SchoolStudent("Lamis");
        lamis.study();
        lamis.learn();
        ((SchoolStudent)lamis).age();*/
    }
}
