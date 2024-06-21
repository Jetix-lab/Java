package org.day1;

public class Employee {
	public void empId() {
		System.out.println("254");
	}
	public void empname() {
		System.out.println("Jack");
	}
	
	public void empDob() {
		System.out.println("24-02-1996");	
	}
	public void empphone() {
		System.out.println("7010725798");
	}
	public void empAddress() {
		System.out.println("No:1,abc st,AnnaNagar,Chennai-600107");
	}
	public void empEmail() {
		System.out.println("jack@gmail.com");
		
	}
	public static void main(String[] args) {
		Employee emp =  new Employee();
		emp.empId();
		emp.empname();
		emp.empDob();
		emp.empphone();
		emp.empAddress();
		emp.empEmail();
	}

}
