package org.test;

import java.util.ArrayList;
import java.util.List;

public class Question7 {
	public static void main(String[] args) {
		// 7.1
		List<Integer> li = new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		System.out.println(li);
		li.remove(2);
		System.out.println(li);

		System.out.println("========================================");

		// 7.2
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		System.out.println(l);
		try {
			l.remove(10);

		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("========================================");

		// 7.3
		List<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(90);
		a.add(10);
		a.add(10);
		a.add(40);
		int valueToRemove = 10;
		System.out.println(a);
		for (int i = a.size() - 1; i >= 0; i--) {
			if (a.get(i) == valueToRemove) {
				System.out.println(a.remove(i));
				System.out.println(a);
				break;
				
			}
		}

	}

}
