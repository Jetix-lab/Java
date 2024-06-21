package org.test;

import java.util.Scanner;

public class Checkchar {
	private static boolean isvalidphonenumber(String phoneno) {

		for (int i = 0; i < phoneno.length(); i++) {
			char c = phoneno.charAt(i);
			if (!Character.isDigit(c)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Your phoneno:");
		String phoneno = scan.nextLine();
		boolean isValid = isvalidphonenumber(phoneno);

		// Displaying the result
		if (isValid) {
			System.out.println("Valid phoneno");
		} else {
			System.out.println("Invalid  phoneno");
		}
	}

}
