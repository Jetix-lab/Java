package org.omrbranch.pages;

import org.omrbranch.baseclass.BaseclassMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends BaseclassMethods {

	public Loginpage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement txtemail;

	@FindBy(id = "pass")
	private WebElement txtpass;

	@FindBy(xpath = "//button[@value='login']")
	private WebElement btnlogin;

	@FindBy(id = "errorMessage")
	private WebElement txtErrorloginMessage;

	public WebElement getTxtemail() {
		return txtemail;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}

	public String getTextErrorMessage() {
		return elementGetText(txtErrorloginMessage);
	}

	public void login(String emailid, String password) {
		eSendKeys(txtemail, emailid);
		eSendKeys(txtpass, password);
		eClick(btnlogin);

	}

	public void loginAndEnter(String emailid, String password) {
		eSendKeys(txtemail, emailid);
		SendkeysAndEnter(txtpass, password);

	}
}