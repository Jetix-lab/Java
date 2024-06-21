package org.edu;
//child

public class Education extends Medicine{
	public void ug() {
		System.out.println("Undergraduate");

	}

	public void pg() {
		System.out.println("Postgraduate");

	}
	public static void main(String[] args) {
		Education e = new Education();
		e.ug();
		e.pg();
		e.bA();
		e.bBA();
		e.bsc();
		e.bEd();
		e.bTech();
		e.bE();
		e.physiyology();
		e.dental();
		e.mbbs();
	}
}
