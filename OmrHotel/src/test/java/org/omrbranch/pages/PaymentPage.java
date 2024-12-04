package org.omrbranch.pages;

import org.omrbranch.baseclass.BaseclassMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends BaseclassMethods {

	@FindBy(xpath = "//div[@class='credit-card pm']")
	private WebElement paymentselect;

	@FindBy(id = "payment_type")
	private WebElement paymenttype;

	@FindBy(id = "card_type")
	private WebElement card_type;

	@FindBy(id = "card_no")
	private WebElement card_no;

	@FindBy(id = "card_name")
	private WebElement card_name;

	@FindBy(id = "card_month")
	private WebElement card_month;

	@FindBy(id = "card_year")
	private WebElement card_year;

	@FindBy(id = "cvv")
	private WebElement cvvno;

	@FindBy(id = "submitBtn")
	private WebElement submitBtn;

	public WebElement getPaymentselect() {
		return paymentselect;
	}

	public WebElement getPaymenttype() {
		return paymenttype;
	}

	public WebElement getCard_type() {
		return card_type;
	}

	public WebElement getCard_no() {
		return card_no;
	}

	public WebElement getCard_name() {
		return card_name;
	}

	public WebElement getCard_month() {
		return card_month;
	}

	public WebElement getCard_year() {
		return card_year;
	}

	public WebElement getCvvno() {
		return cvvno;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

}
