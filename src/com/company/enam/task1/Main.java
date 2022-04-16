package com.company.enam.task1;


import java.awt.*;
import java.util.Objects;
import java.util.Scanner;

import static com.company.enam.task1.Month.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String goOn;
        do {
            Month month = Menu();
            System.out.println("Wish to continue?");
            goOn = scanner.next();
        } while (goOn.equalsIgnoreCase("yes"));
    }


    public static Month Menu() {

        System.out.println("Choose an operation: \n1. Check if month exists\n2. Print month with same season\n3.Print month with the same amount of days\n4.Print months with smaller amount of days\n5.Print months with bigger amount of days\n6.Print the next season\n7.Print previous season\n8.Check if input month has odd amount off days");
        int numbers = askOperation();
        switch (numbers) {
            case 1 -> {
                askUser();
            }
            case 2 -> {
                sameSeason();
            }
            case 3 -> {
                sameDay();
            }
            case 4 -> {
                lessDay();
            }
            case 5 -> {
                moreDay();
            }
            case 6 -> {
                nextSeason();
            }
            case 7 -> {
                previousSeason();
            }
            case 8 -> {
                checkDays();
            }
        }
        return null;
    }
}

