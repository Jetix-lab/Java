package org.test;

public class Stringindex {
	public static void main(String[] args) {
		String s1 = "GreensTechnology";
		// Find the last index of o

		String s2 = "SeleniumAutomationtool";
		// Find the index of o

		String s3 = "Velmurugan";
		// Find the index of n

		String s4 = "j a v a p r o g r a m";
		// Find the last index of (emptyspace)

		String s5 = "9095484678";
		// the index of 8

		int indexof = s1.indexOf("o");
		System.out.println(indexof);

		int indexof1 = s2.indexOf("o");
		System.out.println(indexof1);

		int indexof2 = s3.indexOf("n");
		System.out.println(indexof2);

		int indexof3 = s4.lastIndexOf(" ");
		System.out.println(indexof3);

		int indexof4 = s5.indexOf("8");
		System.out.println(indexof4);

	}

}
