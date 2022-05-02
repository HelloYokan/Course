package com.company.Iterator_Compatator.Homework;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class Commodity implements Comparable<Commodity> {
    private String name;
    private int length;
    private int width;
    private int weight;

    public Commodity(String name, int length, int width, int weight) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Commodity commodity = (Commodity) o;
        return length == commodity.length && width == commodity.width && weight == commodity.weight && Objects.equals(name, commodity.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, length, width, weight);
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", weight=" + weight +
                '}';
    }

    public static void addProduct(LinkedList<Commodity> productList) {
        Scanner scanner = new Scanner(System.in);
        Commodity newProduct = new Commodity("new product",10,10,10);

        System.out.println("Enter name of the product : ");
        newProduct.name = scanner.next();

        System.out.println("Enter length of the product : ");
        newProduct.length = scanner.nextInt();

        System.out.println("Enter width of the product : ");
        newProduct.width = scanner.nextInt();

        System.out.println("Enter weight of the product : ");
        newProduct.weight = scanner.nextInt();

        System.out.println("Enter the place(index) where do you want to place a product");
        int input = scanner.nextInt();

        productList.add(input,newProduct);

    }

    public static void removeProduct(LinkedList<Commodity> productList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Here is the list : ");
        System.out.println(productList);

        System.out.println("Which product would you like to remove?\nWrite an index please(starting with '0')");
        int input = scanner.nextInt();
        productList.remove(input);
    }
    public static void replaceProduct(LinkedList<Commodity> productList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Here is the list : ");
        System.out.println(productList);

        System.out.println("Which product would you like to replace?\nWrite an index, please(starting with '0')");
        int input = scanner.nextInt();
        productList.remove(input);
        Commodity.addProduct(productList);
    }
    @Override
    public int compareTo(Commodity o) {
        int result = this.name.compareTo(o.name);
        if (result == 0) {
            result = this.length - o.length;
        }
        return result;
    }
    public static Comparator<Commodity> lengthComparator() {
        return new Comparator<Commodity>() {
            @Override
            public int compare(Commodity o1, Commodity o2) {
                return (int) (o1.getLength() - o2.getLength());
            }
        };
    }
    public static Comparator<Commodity> widthComparator() {
        Comparator<Commodity> widthComparator = new Comparator<Commodity>() {
            @Override
            public int compare(Commodity o1, Commodity o2) {
                return (int) (o1.getWidth() - o2.getWidth());
            }
        };
        return widthComparator;
    }
    public static Comparator<Commodity> weightComparator() {
        Comparator<Commodity> weightComparator = new Comparator<Commodity>() {
            @Override
            public int compare(Commodity o1, Commodity o2) {
                return (int) (o1.getWeight() - o2.getWeight());
            }
        };
        return weightComparator;
    }
}
