package org.emp;

public class Employee {
	// Method overloaded with int argument
	public void empId(int id) {
		System.out.println(id);
	}

	// Method overloaded with String argument
	public void empId(String id) {
		System.out.println(id);
	}

	// Method overloaded with long argument
	public void empId(long id) {
		System.out.println(id);
	}

	public static void main(String[] args) {
		Employee employee = new Employee();

		// Using the empId() method with different data types
		employee.empId(1001); // Calls empId( Int id)
		employee.empId("EMP1002"); // Calls empId(String id)
		employee.empId(1003L); // Calls empId(long id)
	}
}
