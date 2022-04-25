package com.company.arraylist.task1;

import java.util.LinkedList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        LinkedList<String> slist = new LinkedList<>();
        LinkedList<String> biglist = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        int operation;
        String goOn;
        String input;

        do {
            System.out.println("Enter your word please : ");
            input = scanner.nextLine();
            list.add(input);
            if (input.startsWith("s")) {
                slist.add(input);
            }
            if (input.length() > 5) {
                biglist.add(input);
            }
            if (input.equalsIgnoreCase("break")) {
                list.remove(input);
                biglist.remove(input);
            }
        } while (!input.equalsIgnoreCase("break"));

        do {
            Menu(list, slist, biglist);
            System.out.println("With to continue?");
            goOn = scanner.nextLine();

        } while (goOn.equalsIgnoreCase("Yes"));

    }
    public static void Menu(LinkedList list, LinkedList slist, LinkedList biglist) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an operation:\n1.Print our all words you have written.\n2.Print out all words that start with 's'.\n3.Print out all words which length is bigger than 5.");
        int operation = scanner.nextInt();
        switch (operation) {
            case 1 -> System.out.println("Your words : " + list);
            case 2 -> System.out.println(slist);
            case 3 -> System.out.println(biglist);
        }
    }
}
