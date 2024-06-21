package org.bank;

public class AxisBank implements BankInfo {
	// Override deposit method

	@Override
	public void saving() {
		System.out.println("AxisBank Savings Acc");
	}

	@Override
	public void fixed() {
		System.out.println("AxisBank Fixed Acc");
	}

	@Override
	public void deposit() {
		System.out.println("AxisBank deposit Acc");
	}

	public static void main(String[] args) {
		AxisBank axisBank = new AxisBank();
		axisBank.saving();
		axisBank.fixed();
		axisBank.deposit(); // This will execute the overridden deposit method in Axis

	}
}
