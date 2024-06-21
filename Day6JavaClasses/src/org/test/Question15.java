package org.test;

public class Question15 {
    public static void main(String[] args) {
        String a = "Welcome To Java class @123";

        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int digitCount = 0;
        int specialCharCount = 0;

        // Iterate through each character in the string
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);

            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else {
                specialCharCount++;
            }
        }

        // Output the results
        System.out.println(uppercaseCount);
        System.out.println(lowercaseCount);
        System.out.println(digitCount);
        System.out.println(specialCharCount);
    }
}

