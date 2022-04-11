package com.company.Interfacehw.task2.second;

import com.company.Interfacehw.task2.first.Numerable;

import java.util.Scanner;

public class MyCalculator implements Numerable {
    private static final String plus = "+";
    private static final String minus = "-";
    private static final String multiply = "*";
    private static final String divide = "/";


    @Override
    public double divide(double number1, double number2) {
        return number1 / number2;
    }

    @Override
    public double minus(double number1, double number2) {
        return number1 - number2;
    }

    @Override
    public double multiply(double number1, double number2) {
        return number1 * number2;
    }

    @Override
    public double plus(double number1, double number2) {
        return number1 + number2;
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);

        double number1;
        double number2;
        double result = 0;

        System.out.println("Enter the first number : ");
        number1 = scanner.nextDouble();

        System.out.println("Enter the second number : ");
        number2 = scanner.nextDouble();

        System.out.println("Enter operation you want : ");
        String operation = scanner.next();

        switch (operation) {
            case plus -> result = plus(number1, number2);
            case minus -> result = minus(number1, number2);
            case multiply -> result = multiply(number1, number2);
            case divide -> result = divide(number1, number2);
        }
        System.out.println("Result : " + result);
    }
}
