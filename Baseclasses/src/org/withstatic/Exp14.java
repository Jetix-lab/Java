package org.withstatic;
//access static method  into static method --->classname.methodname
public class Exp14 {
	public static void m1() {
		System.out.println("EmpName:Ramu");
	}

	public static void m2() {
		Exp14.m1();
		System.out.println("EmpId:123");
	}

	public static void main(String[] args) {
		Exp14.m2();
	}
}
