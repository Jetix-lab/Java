package org.omrbranch.pages;

import org.omrbranch.baseclass.BaseclassMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CancelBooking extends BaseclassMethods {

	@FindBy(xpath = "//input[@class='form-control w-50 d-inline-block']")
	private WebElement searchbox;

	@FindBy(xpath = "//a[@class='cancle btn filter_btn']")
	private WebElement cancelbtn;

	@FindBy(xpath = "//li[@class='alertMsg']")
	private WebElement cancelmsg;

	public WebElement getSearchbox() {
		return searchbox;
	}

	public WebElement getCancelbtn() {
		return cancelbtn;
	}

	public WebElement getCancelmsg() {
		return cancelmsg;
	}

}
