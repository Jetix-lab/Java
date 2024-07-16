package org.withstatic;

//access static variable into non static method --->direct access
public class Exp7 {
	static int value = 100;
	
	public void m1() {
		System.out.println(value);
	}
public static void main(String[] args) {
	Exp7 e = new Exp7();
	e.m1();
}
}
