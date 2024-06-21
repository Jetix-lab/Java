package org.bank;
class Axis_Bank extends BankInfo {
    public void deposit() {
        System.out.println("AxisBank: Deposit method");
    }

    public static void main(String[] args) {
        // Instantiate AxisBank object and call its methods
        Axis_Bank axisBank = new Axis_Bank();
        axisBank.saving();
        axisBank.fixed();
        axisBank.deposit();
    }
}
