package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        test();
    }


    private static void test() {
        Integer number1 = 10;
        Integer number2 = 0;
        int result;

        try {
            result = number1 / number2;
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
}