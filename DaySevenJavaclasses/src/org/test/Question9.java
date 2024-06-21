package org.test;

import java.util.ArrayList;
import java.util.List;

public class Question9 {
	public static void main(String[] args) {
		// 9.1
		List<Integer> li = new ArrayList<Integer>();
		li.add(100);
		li.add(200);
		li.add(300);
		li.add(400);
		li.add(500);
		li.add(600);
		li.add(700);
		System.out.println(li);
		li.set(2, 350);
		System.out.println(li);

		System.out.println("==================================================");

		// 9.2
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		l.add(50);
		l.add(10);
		System.out.println(l);
		l.set(7, 90);
		System.out.println(l);

		System.out.println("==================================================");

		// 9.3
		List<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(90);
		a.add(10);
		a.add(10);
		a.add(40);
		a.add(50);
		a.add(30);
		System.out.println(a);

		// Value to replace
		int oldValue = 10;
		int newValue = 100;

		// Iterate through the list and replace oldValue with newValue
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) == oldValue) {
				a.set(i, newValue);
			}
		}
		System.out.println(a);

	}

}
