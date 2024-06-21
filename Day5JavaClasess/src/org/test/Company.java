package org.test;

public class Company extends Employee {
	  public Company() {
		  super("Mack");
	    System.out.println("Default const...");
	  }

	  public static void main(String[] args) {
	    Company a = new Company();
	  }

	}