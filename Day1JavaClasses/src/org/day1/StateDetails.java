package org.day1;

public class StateDetails {

	public void southIndia() {
		System.out.println("South India");
	}

	public void northIndia() {
		System.out.println("North India");
	}

	public static void main(String[] args) {
		StateDetails stateDetails = new StateDetails();
		LanguageInfo l = new LanguageInfo();
		stateDetails.southIndia();
		l.tamilLanguage();
		stateDetails.northIndia();
		l.hindiLanguage();
	}
}
