package org.test;

public class Question11 {

	public static void main(String[] args) {
		// 11.1
		String a = "Nisha";
		String a1 = "Nisha";

		int i = System.identityHashCode(a);
		int i1 = System.identityHashCode(a1);

		System.out.println(i);
		System.out.println(i1);
		
		System.out.println("=======================================");

		// 11.2

		String b = new String("Nisha");
		String b1 = new String("Nisha");

		int z = System.identityHashCode(b);
		int z1 = System.identityHashCode(b1);

		System.out.println(z);
		System.out.println(z1);
		
		System.out.println("=======================================");

		// 11.3

		String c1 = new String("Nisha");
		String c2 = new String("Rengan");
		String c3 = new String("NishaRengan");

		int d = System.identityHashCode(c1);
		int d1 = System.identityHashCode(c2);
		int d2 = System.identityHashCode(c3);

		System.out.println(d);
		System.out.println(d1);
		System.out.println(d2);
		
		System.out.println("=======================================");
		
		//11.4
		String e = "Nisha";
		String e1 = "Rengan";
		String e2 = "NishaRengan";
		
		
		int f = System.identityHashCode(e);
		int f1 = System.identityHashCode(e1);
		int f2 = System.identityHashCode(e2);
		
		System.out.println(f);
		System.out.println(f1);
		System.out.println(f2);
	}
}
