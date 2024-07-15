package org.withstatic;
//access static variable  into non static method --->classname.variablename
public class Exp16 {
	static int data =24;
	public void m1() {
		int i = Exp16.data;
		System.out.println(i);
	}
	public static void main(String[] args) {
		Exp16 e = new Exp16();
		e.m1();
	}

}
