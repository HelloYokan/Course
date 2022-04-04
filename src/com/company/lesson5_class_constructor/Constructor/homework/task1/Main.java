package com.company.lesson5_class_constructor.Constructor.homework.task1;

class Rectangle {
    private double length;
    private double width;

    public Rectangle (double length, double width) {
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
        length = 20;
        width = 30;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double CalculatePerimeter() {
        return (2 * getWidth() + 2 * getLength());
    }

    public double CalculateSquare() {
        return (getWidth() * getLength());
    }

    public void GetALLInfo() {
        System.out.println("Square is " + CalculateSquare());
        System.out.println("Perimeter is " + CalculatePerimeter());
    }

}

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.setLength(40);
        rectangle.setWidth(50);

        rectangle.CalculatePerimeter();

        rectangle.CalculateSquare();

        rectangle.GetALLInfo();

    }
}