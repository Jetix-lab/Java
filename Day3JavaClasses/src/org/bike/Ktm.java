package org.bike;

public class Ktm implements Bike {
	// Override the cost method for Ktm
	@Override
	public void cost() {
		System.out.println("2.2lacs");
	}

	// Override the speed method for Ktm
	@Override
	public void speed() {
		System.out.println("240km");
	}

	public static void main(String[] args) {
		Ktm ktm = new Ktm();
		ktm.cost();
		ktm.cost();
	}
}
