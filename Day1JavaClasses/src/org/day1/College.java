package org.day1;

public class College {
	public void collegeName() {
		System.out.println("Vels University");

	}

	public void collegeCode() {
		System.out.println("1234");

	}

	public void collegeRank() {
		System.out.println("7");

	}

	public static void main(String[] args) {
		College c = new College();
		Department d = new Department();
		Hostel h = new Hostel();
		Student s = new Student();
		c.collegeName();
		c.collegeCode();
	    c.collegeRank();
        s.studentName();
        s.studentId();
        s.studentDept();
        d.deptName();
        h.hostelName();
	}
}
