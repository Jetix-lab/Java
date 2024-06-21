package org.add;

public class GreensTech {

	// overloading based on datatype order
	public void greensOmr(int num, String str) {
		System.out.println("Method with int followed by string: " + num + ", " + str);
		// Method logic for integer followed by string
	}

	public void greensOmr(String str, int num) {
		System.out.println("Method with string followed by int: " + str + ", " + num);
		// Method logic for string followed by integer
	}

	// overloading based on datatype count
	public void greensOmr(int num1, int num2) {
		System.out.println("Method with two integers: " + num1 + ", " + num2);
		// Method logic for two integers
	}

	public void greensOmr(int num, int num1, int num2) {
		System.out.println("Method with three integers: " + num + ", " + num1 + ", " + num2);
		// Method logic for three integers
	}

	public void greensOmr(int num, int num1, String str) {
		System.out.println("Method with int, int, and string: " + num + ", " + num1 + ", " + str);
		// Method logic for integer, integer, and string
	}

	// overloading based on datatype number
	public void greensOmr(int num) {
		System.out.println("Method with one integer: " + num);
		// Method logic for one integer
	}

	public void greensOmr1(int num, int num1) {
		System.out.println("Method with two integers: " + num + ", " + num1);
		// Method logic for two integers
	}

	public void greensOmr1(int num, int num1, int num2) {
		System.out.println("Method with three integers: " + num + ", " + num1 + ", " + num2);
		// Method logic for three integers
	}

	public static void main(String[] args) {
		GreensTech obj = new GreensTech();
		obj.greensOmr(10, "Hello");
		obj.greensOmr("Hello", 10);
		obj.greensOmr(5, 10);
		obj.greensOmr(5, 10, 15);
		obj.greensOmr(5, 10, "Hello");
		obj.greensOmr(5);
		obj.greensOmr1(5, 10);
		obj.greensOmr1(5, 10, 15);
	}
}
