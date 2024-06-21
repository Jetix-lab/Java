package org.test;

import java.util.ArrayList;
import java.util.List;

public class Question8 {
	public static void main(String[] args) {
		// 8.1
		List<Integer> li = new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
		System.out.println(li);
		li.add(2, 50);
		System.out.println(li);

		System.out.println("==================================");

		// 8.2
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		l.add(50);
		System.out.println(l);
		l.add(70);
		System.out.println(l);

		System.out.println("==================================");

		// 8.3
		List<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(90);
		a.add(10);
		a.add(10);
		a.add(40);
		a.add(50);
		System.out.println(a);
		a.add(8, 80);
		System.out.println(a);

		System.out.println("==================================");

	}

}
