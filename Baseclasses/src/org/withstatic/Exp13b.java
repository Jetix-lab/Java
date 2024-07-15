package org.withstatic;

public class Exp13b extends Exp13a{
	
	public static void m2() {
		Exp13a.m1();
		System.out.println("Thank you");
	}
	
	public static void main(String[] args) {
		Exp13b.m2();
	}

}
