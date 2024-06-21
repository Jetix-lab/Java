package org.test;

import java.util.ArrayList;
import java.util.List;

public class Question10 {
	public static void main(String[] args) {
		// 10.1
		List<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(90);
		list1.add(10);
		list1.add(10);
		list1.add(40);
		list1.add(50);

		List<Integer> list2 = new ArrayList<>();
		list2.add(30);
		list2.add(40);
		list2.add(50);
		list2.add(60);
		list2.add(80);

		list1.retainAll(list2);
		System.out.println("Common Values: " + list1);

		System.out.println("============================================");
		
		// 10.2
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

		List<Integer> li = new ArrayList<Integer>();

		li.add(10);
		li.add(20);
		li.add(60);
		li.add(50);
		li.add(40);
		li.add(70);
		li.add(80);
		li.add(90);

		l.retainAll(li);
		System.out.println("common values: " + l);
		
		System.out.println("============================================");
		
		// 10.3
		List<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		a.add(70);
		a.add(80);
		
		List<Integer> b = new ArrayList<Integer>();
		b.add(100);
		b.add(200);
		b.add(300);
		b.add(400);
		b.add(500);
		b.add(600);
		b.add(700);
		b.add(8000);
		
		a.retainAll(b);
		System.out.println(a);
		
	}
}
