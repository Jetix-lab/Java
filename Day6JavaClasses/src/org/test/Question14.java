package org.test;

public class Question14 {
	    public static void main(String[] args) {
	        String a = "Welcome";

	        a = a.toLowerCase();

	        int vowelCount = 0;
	        int count = 0;

	        // Iterate through each character in the string
	        for (int i = 0; i < a.length(); i++) {
	            char ch = a.charAt(i);

	            if (Character.isLetter(ch)) {
	                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                    vowelCount++;
	                } else {
	                    count++;
	                }
	            }
	        }

	        // Output the results
	        System.out.println(vowelCount);
	        System.out.println(count);
	    }
	}


