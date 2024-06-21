package org.day1;

public class InternalStorage {
	public void processorName() {
		System.out.println("Snapdragon");
	}

	public void ramSize() {
		System.out.println("12Gb");
	}
	public static void main(String[] args) {
		InternalStorage i = new InternalStorage();
		ExternalStorage e = new ExternalStorage();
		e.size();
		i.processorName();
		i.ramSize();
		
	}
}
