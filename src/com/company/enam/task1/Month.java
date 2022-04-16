package com.company.enam.task1;

import java.util.Scanner;

public enum Month {

    JANUARY(30, Seasons.WINTER), FEBRUARY(28, Seasons.WINTER), MARCH(31, Seasons.SPRING), APRIL(30, Seasons.SPRING), MAY(31, Seasons.SPRING), JUNE(30, Seasons.SUMMER), JULY(31, Seasons.SUMMER), AUGUST(31, Seasons.SUMMER), SEPTEMBER(30, Seasons.AUTUMN), OCTOBER(31, Seasons.AUTUMN), NOVEMBER(30, Seasons.AUTUMN), DECEMBER(31, Seasons.WINTER);

    int day;
    Seasons seasons;

    Month(int day, Seasons seasons) {
        this.day = day;
        this.seasons = seasons;
    }

    public static void allWinterMonth() {
        System.out.println("Month in Winter : " + Month.JANUARY + ", " + Month.FEBRUARY + ", " + Month.DECEMBER + "\n");
    }

    public static void allSpringMonth() {
        System.out.println("Month in Spring : " + Month.MARCH + ", " + Month.APRIL + ", " + Month.MAY + "\n");
    }

    public static void allSummerMonth() {
        System.out.println("Month in Summer : " + Month.JUNE + ", " + Month.JULY + ", " + Month.AUGUST + "\n");
    }

    public static void allAutumnMonth() {
        System.out.println("Month in Autumn : " + Month.SEPTEMBER + ", " + Month.OCTOBER + ", " + Month.NOVEMBER + "\n");
    }


    public static Month askUser() {
        Scanner scanner = new Scanner(System.in);
        Month month1 = null;

        do {
            System.out.println("Enter a month you want: ");
            String month = scanner.next();

            try {
                month1 = Month.valueOf(month.toUpperCase());

            } catch (IllegalArgumentException e) {
                System.out.println("This month does not exist." + month);
            }
        } while (month1 == null);
        System.out.println("Month exists");
        return month1;
    }

    public static Month sameDay() {
        System.out.println("Same month with 30 days:");
        for (Month dir : Month.values()) {
            if (dir.day == 30) {
                System.out.println(dir + " : " + dir.day);
            }
        }
        System.out.println("Same months with 31 days:");
        for (Month dir : Month.values()) {
            if (dir.day == 31) {
                System.out.println(dir + " : " + dir.day);
            }
        }
        return null;
    }

    public static int askOperation() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an operation : ");

        return scanner.nextInt();

    }

    public static Month sameSeason() {
        Scanner scanner = new Scanner(System.in);
        Month month1 = null;
        do {
            System.out.println("Enter a month you want: ");
            String season = scanner.next();

            try {
                month1 = Month.valueOf(season.toUpperCase());

            } catch (IllegalArgumentException e) {
                System.out.println("This month does not exist." + season);
            }
        } while (month1 == null);
        if (month1.seasons == Seasons.WINTER) {
            allWinterMonth();
        } else if (month1.seasons == Seasons.SPRING) {
            allSpringMonth();
        } else if (month1.seasons == Seasons.SUMMER) {
            allSummerMonth();
        } else {
            allAutumnMonth();
        }
        return month1;
    }

    public static void lessDay() {
        System.out.println("Months with smaller days: ");
        for (Month dir : Month.values()) {
            if (dir.day < 31) {
                System.out.println(dir);
            }
        }
    }

    public static void moreDay() {
        System.out.println("Months with bigger days:");
        for (Month dir : Month.values()) {
            if (dir.day > 30) {
                System.out.println(dir);
            }
        }
    }

    public static Seasons nextSeason() {
        Scanner scanner = new Scanner(System.in);
        Seasons season = null;
        do {
            System.out.println("Enter a season you want: ");
            String inputedSeason = scanner.next();

            try {
                season = Seasons.valueOf(inputedSeason.toUpperCase());

            } catch (IllegalArgumentException e) {
                System.out.println("This season does not exist." + inputedSeason);
            }
        } while (season == null);
        if (season == Seasons.WINTER) {
            System.out.println(Seasons.SPRING);
        } else if (season == Seasons.SPRING) {
            System.out.println(Seasons.SUMMER);
        } else if (season == Seasons.SUMMER) {
            System.out.println(Seasons.AUTUMN);
        } else {
            System.out.println(Seasons.WINTER);
        }
        return season;
    }

    public static Seasons previousSeason() {
        Scanner scanner = new Scanner(System.in);
        Seasons season = null;
        do {
            System.out.println("Enter a season you want: ");
            String inputedSeason = scanner.next();

            try {
                season = Seasons.valueOf(inputedSeason.toUpperCase());

            } catch (IllegalArgumentException e) {
                System.out.println("This season does not exist." + inputedSeason);
            }
        } while (season == null);
        if (season == Seasons.WINTER) {
            System.out.println(Seasons.AUTUMN);
        } else if (season == Seasons.SPRING) {
            System.out.println(Seasons.WINTER);
        } else if (season == Seasons.SUMMER) {
            System.out.println(Seasons.SPRING);
        } else {
            System.out.println(Seasons.SUMMER);
        }
        return season;
    }

    public static void checkDays() {
        Scanner scanner = new Scanner(System.in);
        Month month1 = null;
        do {
            System.out.println("Enter a month you want: ");
            String month2 = scanner.next();

            try {
                month1 = Month.valueOf(month2.toUpperCase());

            } catch (IllegalArgumentException e) {
                System.out.println("This month does not exist." + month2);
            }
        } while (month1 == null);
        if (month1.day % 2 == 0) {
            System.out.println("This month has odd amount of days");
        } else {
            System.out.println("this month does not have odd amount of days");
        }
    }
}


