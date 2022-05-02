package com.company.Iterator_Compatator.Homework;

import java.awt.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Commodity product1 = new Commodity("cupboard",30,40,20);
        Commodity product2 = new Commodity("table", 30,20,15);
        Commodity product3 = new Commodity("lamp", 2,3,5);
        LinkedList<Commodity> productList = new LinkedList<Commodity>(Arrays.asList(product1,product2,product3));
        String goOn;
        do {
            Menu(productList);
            System.out.println("Wish to continue?");
            goOn = scanner.next();
        } while (goOn.equalsIgnoreCase("Yes"));

    }
    public static void Menu(LinkedList<Commodity> productList) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an operation:\n1.Add product.\n2.Remove product.\n3.Replace product." +
                "\n4.Sort by name.\n5.Sort by length.\n6.Sort by width.\n7.Sort by weight\n8.Exit program." +
                "\n Enter your operation : ");
        int operation = scanner.nextInt();
        switch (operation) {
            case 1: {
                Commodity.addProduct(productList);
                System.out.println("Here is the new list" + productList);
            } break;
            case 2: {
                Commodity.removeProduct(productList);
                System.out.println("Here is the new list" + productList);
            } break;
            case 3: {
                Commodity.replaceProduct(productList);
                System.out.println("Here is the new list" + productList);
            } break;
            case 4: {
                System.out.println("Sort by name : ");
                Collections.sort(productList);
                show(productList);
            } break;
            case 5: {
                System.out.println("Sort by length : ");
                Collections.sort(productList,Commodity.lengthComparator());
                show(productList);
            } break;
            case 6: {
                System.out.println("Sort by width : ");
                Collections.sort(productList, Commodity.widthComparator());
                show(productList);
            } break;
            case 7: {
                System.out.println("Sort by weight : ");
                Collections.sort(productList, Commodity.weightComparator());
                show(productList);
            }break;
            case 8: {

            }break;
        }
    }
    private static void show(LinkedList<Commodity> commodities) {
        for (Commodity commodity : commodities) {
            System.out.println(commodity);
        }
    }
}
