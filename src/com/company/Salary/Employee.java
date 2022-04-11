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
        System.out.println("Employee who have per hour salary.\nhow much have you worked this month?\n" + getHour());
        System.out.println("So your salary will be " + (getHour() * getMoney()) + "$");
    }
}
