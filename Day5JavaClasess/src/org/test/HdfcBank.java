package org.test;

public class HdfcBank extends Customer {
	public HdfcBank() {
		super(12);
		System.out.println("Default const...");
	}

	public static void main(String[] args) {
		HdfcBank a = new HdfcBank();
	}

}
