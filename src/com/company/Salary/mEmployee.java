package com.company.Salary;

import java.util.Scanner;

public class mEmployee implements Salary {
    private double money;
    private double days;
    public mEmployee(double money, double days) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getDays() {
        return days;
    }

    public void setDays(double days) {
        this.days = days;
    }

    public void salary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days have you worked this month?");
        this.days = scanner.nextDouble();

        double salary = getMoney() * this.days;
        System.out.println("Your salary this month will be : " + salary);
    }
}
