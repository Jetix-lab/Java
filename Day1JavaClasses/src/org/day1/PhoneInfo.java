package org.day1;

public class PhoneInfo {
	
	public void phoneName() {
		System.out.println("Iphone14");
	}
	public void phoneImeiNum() {
		System.out.println("1234567891023365");
	}
	public void Camera() {
		System.out.println("18MP");	
	}
	public void storage() {
		System.out.println("128Gb");
	}
	public void osName() {
		System.out.println("Ios");
	}
	public static void main(String[] args) {
		PhoneInfo p =  new PhoneInfo();
		p.phoneName();
		p.phoneImeiNum();
		p.Camera();
		p.storage();
		p.osName();
	}

}
