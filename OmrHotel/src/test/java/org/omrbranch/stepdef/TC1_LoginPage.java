package org.omrbranch.stepdef;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;
import org.omrbranch.baseclass.BaseclassMethods;
import org.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_LoginPage extends BaseclassMethods {

	PageObjectManager pom = new PageObjectManager();

	@Given("User is on the OMR Branch Hotel Page")
	public void userIsOnTheOMRBranchHotelPage() throws FileNotFoundException, IOException {
		browserLaunch(getPropertyFileValue("browser"));
		enterApplnUrl(getPropertyFileValue("url"));
		maximizeWindow();
		setImplicitWait(driver, 120);
	}

	@When("User login {string},{string}")
	public void userLogin(String EmailId, String Password) {
		pom.getLoginpage().login(EmailId, Password);
	}

	@Then("User should verify Success Message After Login {string}")
	public void userShouldVerifySuccessMessageAfterLogin(String exceptedSuccessMessage) {
		Assert.assertEquals("Verify Login Success Message", exceptedSuccessMessage,
				pom.getSearchHotelPage().textLoginSuccessMessage());
	}

	@When("User login {string},{string} with ENTER key")
	public void userLoginWithENTERKey(String EmailId, String Password) {
		pom.getLoginpage().loginAndEnter(EmailId, Password);
	}

	@Then("User should verify Error Message After Login {string}")
	public void userShouldVerifyErrorMessageAfterLogin(String expLoginErrorMessage) {
		String loginErrorMessage = pom.getLoginpage().getTextErrorMessage();
		boolean contains = loginErrorMessage.contains(expLoginErrorMessage);
		Assert.assertTrue("Verify the Login Error Message", contains);
	}

}
