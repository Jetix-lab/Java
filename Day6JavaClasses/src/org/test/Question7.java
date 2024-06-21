package org.test;

public class Question7 {
	public static void main(String[] args) {
		
		String S = "Welcome to java class";
		String replace = S.replace("Welcome to java class", "Welcome to java SQL");
		System.out.println("BEFORE REPLACE:"+S);
		System.out.println("AFTER REPLACE:"+replace);
		System.out.println("==================================");
		
		String s1="Greens Adayar";
		String rep = s1.replace("Greens Adayar","Greens Omr");
		System.out.println("BEFORE REPLACE:"+s1);
		System.out.println("AFTER REPLACE:"+rep);
		System.out.println("==================================");
		
		String s2="Welcome To Java";
		String change = s2.replace(" ","#");
		System.out.println("BEFORE REPLACE:"+s2);
		System.out.println("AFTER REPLACE:"+change);
		System.out.println("==================================");
		
		String s3  = "Nishakerala24@gmail.com";
		String replace1 = s3.replace("gmail","yahoo");
		System.out.println("BEFORE REPLACE:"+s3);
		System.out.println("AFTER REPLACE:"+replace1);
		System.out.println("==================================");
		
		String s4="18/22 sivan koil street,koyambedu,chennai, pincode-600107";
		String replace2 = s4.replace(",pincode-600107", "");
		System.out.println("before replace:"+s4);
		System.out.println("after replace:"+ replace2);
	}
	}
	


