package org.college;

public class Student extends Hostel {
	public void studentName() {
		System.out.println("James");
	}

	public void studentDept() {
		System.out.println("Coumpter Science");

	}

	public void studentId() {
		System.out.println("12340024097");

	}

	public static void main(String[] args) {
		Student s = new Student();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.dept();
		s.hostelName();
		s.studentName();
		s.studentId();
		s.studentDept();
	}
}
