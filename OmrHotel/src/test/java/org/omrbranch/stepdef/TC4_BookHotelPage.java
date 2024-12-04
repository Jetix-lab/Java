package org.omrbranch.stepdef;

import org.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.*;

public class TC4_BookHotelPage {
	PageObjectManager pom = new PageObjectManager();

	@When("User add the guest details {string},{string},{string},{string} and {string}")
	public void userAddTheGuestDetailsAnd(String string, String string2, String string3, String string4,
			String string5) {
	}

	@When("User add the GST Details {string},{string} and {string}")
	public void userAddTheGSTDetailsAnd(String string, String string2, String string3) {
	}

	@When("User add the special request {string}")
	public void userAddTheSpecialRequest(String string) {
	}

	@When("User enter payment details, proceed with card type {string}")
	public void userEnterPaymentDetailsProceedWithCardType(String string, io.cucumber.datatable.DataTable dataTable) {

	}

	@Then("User should verify selected hotel name, booking success message contains {string} and save booking number")
	public void userShouldVerifySelectedHotelNameBookingSuccessMessageContainsAndSaveBookingNumber(String string) {
	}

	@Then("User should verify after booking same selected hotel is booked or not")
	public void userShouldVerifyAfterBookingSameSelectedHotelIsBookedOrNot() {
	}

	@Then("User should verify error messages {string}, {string}, {string}, {string}, {string} and {string}")
	public void userShouldVerifyErrorMessagesAnd(String string, String string2, String string3, String string4,
			String string5, String string6) {
	}

}
