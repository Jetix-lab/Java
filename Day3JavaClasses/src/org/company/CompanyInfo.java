package org.company;

public class CompanyInfo {
	// Method overloaded with no arguments
	public void companyName() {
		System.out.println("Infosys");
	}

	// Method overloaded with one argument
	public void companyName(String name) {
		System.out.println("Company Name: " + name);
	}

	// Method overloaded with two arguments
	public void companyName(String name, String id) {
		System.out.println("Company Name: " + name + ", id: " + id);
	}

	// Method overloaded with three arguments
	public void companyName(String name, String id, String location) {
		System.out.println("Company Name: " + name + ", id: " + id + ", Location: " + location);
	}

	public static void main(String[] args) {
		CompanyInfo company = new CompanyInfo();
		company.companyName(); 
		company.companyName("ABC Corp"); 
		company.companyName("ABC corp", "10124"); 
		company.companyName("ABC Corp", "10124", "123 Street");
	}
}
