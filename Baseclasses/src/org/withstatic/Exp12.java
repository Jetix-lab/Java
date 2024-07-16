package org.withstatic;
//access static method  into non static method --->classname.methodname
public class Exp12 {
	public static void n1() {
		
		System.out.println("java");
	}
public void n2() {
	Exp12.n1();
	System.out.println("program");
}
public static void main(String[] args) {
	Exp12 e = new Exp12();
	e.n2();
}
}
