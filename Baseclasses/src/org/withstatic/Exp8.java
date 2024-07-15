package org.withstatic;

//access static variable into static method --->direct access
public class Exp8 {
	static int name=200;
	
	public static void m1() {
		System.out.println(name);
	}
	public static void main(String[] args) {
		m1();
	}

}
