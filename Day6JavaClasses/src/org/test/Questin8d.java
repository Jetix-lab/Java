package org.test;

	public class Questin8d {
		public static void main(String[] args) {
			String a = "WelComeToJava";
			int uppercaseCount = 0;
			int lowercaseCount = 0;

			// Iterate through each character in the string
			for (int i = 0; i < a.length(); i++) {
				char ch = a.charAt(i);

				// Check if the character is uppercase
				if (Character.isUpperCase(ch)) {
					uppercaseCount++;
				}

				// Check if the character is lowercase
				if (Character.isLowerCase(ch)) {
					lowercaseCount++;
				}
			}

			// Output the counts
			System.out.println("UpperCase=" + uppercaseCount);
			System.out.println("LowerCase=" + lowercaseCount);

			int length = a.length();
			System.out.println(length);
		}
	}


