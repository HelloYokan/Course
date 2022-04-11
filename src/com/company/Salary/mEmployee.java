package com.company.Salary;

public class mEmployee implements Salary {
    private double money;
    public mEmployee(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    public void salary() {
        System.out.println("\nEmployee that get paid per month\nPer day you get " + getMoney() + "\nSo salary for 30 days will be " + getMoney() * 30 + "$");
    }
}
