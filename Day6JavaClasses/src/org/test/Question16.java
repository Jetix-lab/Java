package org.test;

public class Question16 {
	public static void main(String[] args) {
		String a = "Welcome";

		// Convert the input string to lowercase to handle case insensitivity
		a = a.toLowerCase();

		// Create a StringBuilder to store the modified string
		StringBuilder string = new StringBuilder();

		// Iterate through each character in the string
		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				string.append('@');
			} else {
				string.append(ch);
			}
		}

		System.out.println(string);
	}
}
