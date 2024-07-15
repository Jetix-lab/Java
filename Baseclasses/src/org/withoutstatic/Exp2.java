package org.withoutstatic;

// access non static method into non static method ----> direct access
public class Exp2 {
	
	public void m1() {
		System.out.println("Ganesh");
	}
	public void m2() {
		m1();
		System.out.println("v");
	}
public static void main(String[] args) {
	Exp2 e = new Exp2();
	e.m2();
}
}
