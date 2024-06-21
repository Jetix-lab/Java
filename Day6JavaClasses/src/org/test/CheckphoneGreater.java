package org.test;

import java.util.Scanner;

public class CheckphoneGreater {
	private static boolean isvalidphonenumber(String phoneno) {

		int maxLength=10;
      if (phoneno.length() > maxLength) {
          System.out.println("Phone number exceeds maximum");
          }
          else {
          	System.out.println("invalidnumber");
          }
	return false;}

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
