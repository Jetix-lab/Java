package org.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingConfirmPage {

	@FindBy(xpath = "//h2[@name='booking-code']/strong")
	private WebElement orderid1;

	@FindBy(xpath = "(//p)[3]")
	private WebElement orderid2;

	public WebElement getOrderid1() {
		return orderid1;
	}

	public WebElement getOrderid2() {
		return orderid2;
	}

}
