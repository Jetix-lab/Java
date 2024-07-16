package org.withoutstatic;

//access instance variable into non-static method using object

public class Exp4a {
	int id = 100;
	public void m1() {
		System.out.println(id);
	}

}
