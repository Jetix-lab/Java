package org.withstatic;

public class Exp11b extends Exp11a{
	
	public void m2() {
		m1();
		System.out.println("java program");
	}
public static void main(String[] args) {
	Exp11b e = new Exp11b();
	e.m2();
}
}
