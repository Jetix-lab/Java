package org.test;

import java.util.Scanner;

public class EmailVerify {
	private static boolean isValidEmail(String email) {
		if(email.contains("@")){
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Your Emailid");
		String email = scanner.nextLine();
        boolean isValid = isValidEmail(email);

        // Displaying the result
        if (isValid) {
            System.out.println("Valid email address");
        } else {
            System.out.println("Invalid email address");
        }
	}


}
