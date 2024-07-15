package org.withoutstatic;

public class Exp5b extends Exp5a {
	
	public void m2() {
		m1();
		System.out.println("Program");
	}
	public static void main(String[] args) {
		Exp5b ex = new Exp5b();
		ex.m2();
	}

}
