package org.lang;

public class StateDetails extends LanguageInfo {
    public void southIndia() {
        System.out.println("StateDetails: South India");
    }

    public void northIndia() {
        System.out.println("StateDetails: North India");
    }

    public static void main(String[] args) {
        StateDetails stateDetails = new StateDetails();
        
        stateDetails.tamilLanguage();
        stateDetails.englishLanguage();
        stateDetails.hindiLanguage();
        stateDetails.southIndia();
        stateDetails.northIndia();
    }
}
