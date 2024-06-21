package org.test;

import java.util.Scanner;

public class Emailverifies {
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
        boolean present = isValidEmail(email);

        // Displaying the result
        if (present) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
	}


}
