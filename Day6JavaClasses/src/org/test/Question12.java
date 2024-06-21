package org.test;

public class Question12 {
	public static void main(String[] args) {
		String a = "Welcome to java class";

		// Split the input string by space
		String[] split = a.split(" ");

		// Output each part
		for (String i : split) {
			System.out.println(i);
		}

		System.out.println("=======================");
		
		//12.1
		String b = "Welcome to java class";
        String[] split2 = b.split("l");
        
        for (String i1 : split2) {
            System.out.println(i1);
        }

	}

}
