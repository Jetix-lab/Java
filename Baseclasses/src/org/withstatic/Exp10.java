package org.withstatic;

//access static method  into static method --->direct access
public class Exp10 {
	public static void m1() {
		System.out.println("hello world");
	}
	public static void m2() {
		m1();
		System.out.println("welcome");
	}
	public static void main(String[] args) {
		m2();
		
	}

}
