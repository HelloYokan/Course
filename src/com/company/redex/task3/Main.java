package com.company.redex.task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your sentence : ");
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("Java");
        Matcher matcher = pattern.matcher(input);

        System.out.println("Does your sentence contains 'Java?'\n" + matcher.find());

        String sentence = input.replaceAll("Java","C#");

        System.out.println("The new sentence will be : " + sentence);

    }
}
