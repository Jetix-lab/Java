package org.test;

import java.util.Scanner;

public class Addressverify {
	private static boolean isValidAddress(String address) {

		if(address.contains("pincode")){
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Your address");
		String address = scanner.nextLine();
        boolean isValid = isValidAddress(address);

        // Displaying the result
        if (isValid) {
            System.out.println("Valid address");
        } else {
            System.out.println("Invalid  address");
        }
	}


}
