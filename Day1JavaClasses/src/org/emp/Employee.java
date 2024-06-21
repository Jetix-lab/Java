package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {
	public void empName() {
		System.out.println("Mike");
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		Company co = new Company();
		Client c = new Client();
		Project p = new Project();

		e.empName();
		co.companyName();
		c.clientName();
		p.projectName();
		

	}
}
