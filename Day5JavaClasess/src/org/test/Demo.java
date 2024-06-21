package org.test;

public class Demo {
	  public Demo() {
	    this("JAVA");
	    System.out.println("Default const...");
	  }

	  public Demo(int id) {
	    this(3456.5678f);
	    System.out.println(id);
	  }

	  public Demo(String name) {
	    this(12);
	    System.out.println(name);
	  }

	  public Demo(float sal) {
	    System.out.println(sal);
	  }

	  public static void main(String[] args) {
		  Demo a = new Demo();
	  }

	}