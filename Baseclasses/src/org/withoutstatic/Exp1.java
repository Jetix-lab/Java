package org.withoutstatic;

//access onsatnce variable into non static method--->direct access
public class Exp1 {
	int id = 100;
	public void m1() {
		System.out.println(id);
	}
public static void main(String[] args) {
	Exp1 e = new Exp1();
	e.m1();
}
}
