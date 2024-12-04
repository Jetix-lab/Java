package org.omrbranch.stepdef;

import org.junit.Assert;
import org.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.*;

public class TC3_SelectHotelPage {
	PageObjectManager pom = new PageObjectManager();

	@When("User save the first hotel name, hotel price")
	public void userSaveTheFirstHotelNameHotelPrice() {
		pom.getSelectHotelpage().firstHotelClick();
		pom.getSelectHotelpage().firsthotelprice();
	}

	@When("User select the first hotel name")
	public void userSelectTheFirstHotelName() {
		pom.getSelectHotelpage().buttonclick();
	}

	@When("User accepts the hotel booking alert")
	public void userAcceptsTheHotelBookingAlert() {
		pom.getSelectHotelpage().handlealertaccept();
	}

	@Then("User should verify after select hotel the success message {string}")
	public void userShouldVerifyAfterSelectHotelTheSuccessMessage(String ExceptedMessage) {
		Assert.assertEquals("verify the Success msg", "ExceptedMessage", pom.getBookHotelPage().successmessage());
	}

	@When("User dismiss the hotel booking alert")
	public void userDismissTheHotelBookingAlert() {
		pom.getSelectHotelpage().handlealertdismiss();
	}

}
