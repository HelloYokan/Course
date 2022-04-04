package com.company.lesson5_class_constructor.Constructor.homework.task2;

class Circle {
    private double radius;
    private double diameter;

    public Circle (double radius, double diameter) {
        this.diameter = diameter;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double CalculateSquare() {
        return (Math.PI * Math.pow(diameter/2, 2));
    }

    public double CalculateLength() {
        return (2 * Math.PI * radius);
    }

    public void GetAllInfo() {
        System.out.println("Square of the circle : " + CalculateSquare() + "\nLength of the circle : " + CalculateLength());
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(14,28);

        circle.CalculateLength();

        circle.CalculateSquare();

        circle.GetAllInfo();
    }
}
