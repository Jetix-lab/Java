package org.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Question4 {
	public static void main(String[] args) {
		//4.1
		List<Integer> li = new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
		System.out.println("Arraylist:" +li);
		int size = li.size();
		System.out.println("length of arraylist:" +size);
		
		System.out.println("=======================================================");
		
		//4.2
		List<Integer> a = new LinkedList<Integer>();
		a.add(100);
		a.add(200);
		a.add(300);
		a.add(400);
		a.add(500);
		a.add(600);
		a.add(700);
		System.out.println("linkedlist:" +a);
		int size2 = a.size();
		System.out.println("length of linkedlist:" +size2);
		
		System.out.println("=======================================================");
		
		//4.3
		
		List<Integer> b = new Vector<Integer>();
		b.add(105);
		b.add(205);
		b.add(305);
		b.add(405);
		b.add(505);
		b.add(605);
		b.add(705);
		b.add(805);
		System.out.println("Vector list:"+b);
		int size3 = b.size();
		System.out.println("length of vector:" +size3);
		
		System.out.println("=======================================================");
		
		//4.4
		List<Integer> c = new LinkedList<Integer>();
		c.add(100);
		c.add(200);
		c.add(300);
		c.add(400);
		c.add(500);
		c.add(600);
		c.add(700);
		System.out.println("linkedlist:" +c);
		int size4 = a.size();
		System.out.println("length of linkedlist:" +size4);
		
	}

}
