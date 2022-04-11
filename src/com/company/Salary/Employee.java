package com.company.Salary;

import java.util.Scanner;

public class Employee implements Salary{
    private double money;
    private double hour;
    public Employee(double money, double hour) {
        this.hour = hour;
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    @Override
    public void salary() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many hours have you worked this month : ");
        this.hour = scanner.nextDouble();

        double salary = this.hour * getMoney();
        System.out.println("So your salary will be " + salary + "$");
    }
}
