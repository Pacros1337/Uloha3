package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rodneCislo = sc.next();
        id(rodneCislo);
    }

    public static void id(String rodneCislo) {

        int year = getYear(rodneCislo);
        int month = getMonth(rodneCislo);
        int day = getDay(rodneCislo);

        System.out.println("Year: " + year + " " + "Month: " + month + " " + "Day: " + day);
    }

    private static int getMonth(String id) {
        return Integer.parseInt(id.substring(2, 4));
    }

    private static int getYear(String id) {
        int year = Integer.parseInt(id.substring(0, 2));

        if (year < 21) {
            year = Integer.parseInt(id.substring(0, 2)) + 2000;
        } else {
            year = Integer.parseInt(id.substring(0, 2)) + 1900;
        }

        return year;

    }

    private static int getDay(String id) {
        return Integer.parseInt(id.substring(4, 6));
    }
}
