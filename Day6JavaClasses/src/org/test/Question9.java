package org.test;

public class Question9 {

	public static void main(String[] args) {
		
		//9.1
		String a = "Welcome to class java";
		boolean startsWith = a.startsWith("Welcome");
		System.out.println(startsWith);
		
		//9.2
		String b = "Hai i am nisha";
		boolean startsWith2 = b.startsWith("welcome");
		System.out.println(startsWith2);
		
		//9.3
		boolean endsWith = a.endsWith(a);
		System.out.println(endsWith);
		
		//9.4
		String c = "Welcome to java class";
		boolean endsWith2 = c.endsWith("java");
		System.out.println(endsWith2);
		
		//9.5
		boolean empty = c.isEmpty();
		System.out.println(empty);
		
		//9.6
		String d = " ";
		boolean empty2 = d.isEmpty();
		System.out.println(empty2);
		
		
	}

}
