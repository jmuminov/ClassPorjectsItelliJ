package com.syntax.class25;

public class FileTester {
    public static void main(String[] args) {
        File java = new JavaFile();
        java.open();
        java.edit();
        java.close();
    }
}
