package org.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Question6 {
	public static void main(String[] args) {
		// 6.1
		List<Integer> li = new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		System.out.println(li);
		Integer integer = li.get(2);
		System.out.println(integer);

		System.out.println("==========================================================");

		// 6.2
		List<Integer> l = new ArrayList<Integer>();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		l.add(500);
		l.add(600);
		l.add(700);
		System.out.println(l);
		Integer integer2 = l.get(4);
		System.out.println(integer2);

		System.out.println("==========================================================");

		// 6.3
		List<Integer> a = new ArrayList<Integer>();
		a.add(105);
		a.add(205);
		a.add(305);
		a.add(405);
		a.add(505);
		a.add(605);
		a.add(705);
		a.add(805);
		System.out.println(a);
		try {
			Integer inte = a.get(8);

		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("==========================================================");

		// 6.4
		List<Integer> b = new ArrayList<Integer>();
		b.add(105);
		b.add(205);
		b.add(305);
		b.add(405);
		b.add(505);
		b.add(605);
		b.add(705);
		b.add(805);
		System.out.println(b);

		for (int i = 0; i < b.size(); i++) {
			int value = a.get(i);
			System.out.println(value);
		}
		
		System.out.println("==========================================================");

		// 6.5
		
		for (Integer eachloop : b) {
			System.out.println(eachloop);
			
		}

	}

}
