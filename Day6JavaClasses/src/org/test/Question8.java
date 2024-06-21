package org.test;

public class Question8 {

	public static String convertCase(String input) {
		StringBuilder converted = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);
			if (Character.isLowerCase(currentChar)) {
				converted.append(Character.toUpperCase(currentChar));
			} else {
				converted.append(Character.toLowerCase(currentChar));
			}
		}
		return converted.toString();
	}

	public static void main(String[] args) {
		String input = "WelcomE";
		String output = convertCase(input);
		System.out.println("Input  = " + input);
		System.out.println("Output = " + output);

		String s = "NISHANTHI";
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);

		String a = "nishanthi";
		String upperCase = a.toUpperCase();
		System.out.println(upperCase);

	}

}
