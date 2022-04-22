package com.company.redex.task2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<String> email = new LinkedList<>();

        String inputedEmail;
        do {
            System.out.println("Enter E-mail : ");
            inputedEmail = scanner.nextLine();

            Pattern pattern = Pattern.compile("@gmail.com");
            Matcher matcher = pattern.matcher(inputedEmail);

            if (matcher.find()) {
                email.add(inputedEmail);
            }
        } while (!inputedEmail.equalsIgnoreCase("Stop"));

        System.out.println(email);
    }
}
