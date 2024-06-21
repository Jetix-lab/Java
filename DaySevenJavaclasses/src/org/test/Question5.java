package org.test;

import java.util.ArrayList;
import java.util.List;

public class Question5 {
	public static void main(String[] args) {
		// 5.1
		List<Integer> li = new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		System.out.println(li);
		int indexOf = li.indexOf(10);
		System.out.println(indexOf);

		System.out.println("==================================================");

		// 5.2
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
		int indexOf2 = a.indexOf(10);
		System.out.println(indexOf2);
		// 5.3
		int indexOf3 = a.indexOf(50);
		System.out.println(indexOf3);
		// 5.4
		int indexOf4 = a.indexOf(90);
		System.out.println(indexOf4);

		System.out.println("==================================================");

		// 5.5
		List<Integer> b = new ArrayList<Integer>();
		b.add(10);
		b.add(20);
		b.add(30);
		b.add(90);
		b.add(10);
		b.add(10);
		b.add(40);
		b.add(50);
		b.add(10);
		System.out.println(b);

		int ToFind = 10;
		// Iterate over the list to find all occurrences of the value
		for (int i = 0; i < b.size(); i++) {
			if (b.get(i) == ToFind) {
				System.out.println(i);

			}
		}
		System.out.println("==================================================");
		// 5.6
		List<Integer> c = new ArrayList<Integer>();
		c.add(10);
		c.add(20);
		c.add(30);
		c.add(90);
		c.add(10);
		c.add(10);
		c.add(40);
		c.add(50);
		c.add(10);
		System.out.println(c);
		int valueToFind = 70;
		for (int i = 0; i < c.size(); i++) {
			if (c.get(i) == valueToFind) {
				c.add(i);
			}
		}
		// Check if the value was found and print appropriate message
		if (!c.equals(valueToFind)) {
			System.out.println("Value " + valueToFind + " is not present in the list.");
		} else {
			System.out.println("Index of value " + valueToFind + ": " +c );
		}
	}
}
