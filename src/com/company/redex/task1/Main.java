package com.company.redex.task1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> array = new ArrayList<>();

        String input;
        do {
            System.out.println("Please, enter your element");
            input = scanner.nextLine();

            Pattern regEx = Pattern.compile("^a");

            Matcher matcher = regEx.matcher(input);

            if (matcher.find()) {
                array.add(input);
            }

        } while (!input.equalsIgnoreCase("Stop"));

        System.out.println("Your array : " + array);
    }
}
