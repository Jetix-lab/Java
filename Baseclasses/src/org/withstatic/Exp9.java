package org.withstatic;

//access static method  into non static method --->direct access
public class Exp9 {
	public static void m1() {
		System.out.println("java");
		System.out.println("program");
	}

	public void m2() {
		m1();
	}
	public static void main(String[] args) {
		Exp9 e = new Exp9();
		e.m2();
	}
}
