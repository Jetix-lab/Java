package org.phone;

public class Phone {

    //passing a integer and then a string
    public void phoneInfo(int phoneNumber, String modelName) {
        System.out.println("PhoneNumber: " + phoneNumber);
        System.out.println("ModelName: " + modelName);
    }

    // passing a string and then an integer
    public void phoneInfo(String modelName, int phoneNumber) {
        phoneInfo(phoneNumber, modelName);
    }

    // passing a two strings
    public void phoneInfo(String mobName1, String mobName2) {
        // This method provides flexibility in accepting two strings
        System.out.println("ModelName 1: " + mobName1);
        System.out.println("ModelName 2: " + mobName2);
    }

    // passing a two integers
    public void phoneInfo(int phoneNo1, int phoneNo2) {
        System.out.println("PhoneNumber 1: " + phoneNo1);
        System.out.println("PhoneNumber 2: " + phoneNo2);
    }
    public static void main(String[] args) {
		Phone myphone = new Phone();
       	myphone.phoneInfo(1234567890, "RealMe");
		myphone.phoneInfo("RealMe", 1234567890);
		myphone.phoneInfo("Iphone", "SamSung");
		myphone.phoneInfo(123, 456);

		
	}
}
