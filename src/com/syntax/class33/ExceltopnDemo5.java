package com.syntax.class33;

public class ExceltopnDemo5 {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            System.out.println("2");
            //System.out.println(10/0);
            System.out.println("3");
            String name = null;
            System.out.println("4");
            name.length();
            System.out.println("5");
            int arr[] = new int[-10];
            System.out.println("6");
        } catch (ArithmeticException e) {
            System.out.println("7");
            System.out.println("Not possible in math");
        } catch (NegativeArraySizeException e) {
            System.out.println("8");
            System.out.println("Please give positive size");
        } catch (NullPointerException e) {
            System.out.println("9");
            System.out.println("Please dont put null");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("10");
        }
        System.out.println("11");
    }
}
