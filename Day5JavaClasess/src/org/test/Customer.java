package org.test;

public class Customer {
	public Customer() {
		System.out.println("Super class");
	}

	public Customer(int id) {
		System.out.println("int based constructor in customer:" + id);
	}

}
