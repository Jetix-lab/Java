package org.test;

import java.util.Scanner;

public class Stringequals {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter String 1:");
        String string1 = scanner.nextLine();

        System.out.println("Enter String 2:");
        String string2 = scanner.nextLine();

        // Check equality using equals() method
        if (string1.equals(string2)) {
            System.out.println("Using equals(): Strings are Equal");
        } else {
            System.out.println("Using equals(): Strings are Not Equal");
        }

        // Check equality ignoring case using equalsIgnoreCase() method
        if (string1.equalsIgnoreCase(string2)) {
            System.out.println("Using equalsIgnoreCase(): Strings are Equal");
        } else {
            System.out.println("Using equalsIgnoreCase(): Strings are Not Equal");
        }

        scanner.close();
    }
}
