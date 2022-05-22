package com.company.Threads;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class MyThread extends Thread{

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("Thread : " + getName() + "started working");
        System.out.println("How many Fibonacci numbers do you want? ");
        int amount = scanner.nextInt();

        int number1 = 0;
        int number2 = 1;
        int number3;


        System.out.print("\nFibonacci numbers : ");
        try {
            System.out.print(number1 + " ");
            System.out.print(number2);
            for (int i = 0; i < amount; i++) {
                Thread.sleep(1000);
                number3 = number1 + number2;
                System.out.print(" "+ number3);
                number1 = number2;
                number2 = number3;
                list.add(number3);
            }
            System.out.println("\nFibonacci reversed :");

            for (int i = list.size() - 1; i>=0; i--) {
                Thread.sleep(1000);

                System.out.print(" " + list.get(i));

            }
            System.out.println(1);
            System.out.println(0);
        } catch (InterruptedException e ) {
            System.out.println("Thread was stopped");
        }
    }
}
