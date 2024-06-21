package org.test;

import java.util.ArrayList;
import java.util.List;

public class Question11 {
	public static void main(String[] args) {
		// 11.1
		List<Integer> li = new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);

		List<Integer> l = new ArrayList<Integer>();
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(80);

		li.removeAll(l);
		System.out.println(li);

		System.out.println("===========================================================");

		// 11.2

		List<Integer> a = new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(90);
		a.add(10);
		a.add(10);
		a.add(40);
		a.add(50);

		List<Integer> b = new ArrayList<>();
		b.add(10);
		b.add(20);
		b.add(60);
		b.add(50);
		b.add(40);
		b.add(70);
		b.add(80);
		b.add(90);
		a.removeAll(b);
		System.out.println(a);

		System.out.println("===========================================================");

		// 11.3
		List<Integer> c = new ArrayList<>();
		c.add(10);
		c.add(20);
		c.add(30);
		c.add(40);
		c.add(50);
		c.add(60);
		c.add(70);
		c.add(80);

		List<Integer> d = new ArrayList<>();
		d.add(100);
		d.add(200);
		d.add(300);
		d.add(400);
		d.add(500);
		d.add(600);
		d.add(700);
		d.add(8000);

		c.removeAll(d);
		System.out.println(c);

	}

}
