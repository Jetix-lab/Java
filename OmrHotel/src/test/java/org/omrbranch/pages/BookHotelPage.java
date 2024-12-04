package org.omrbranch.pages;

import org.omrbranch.baseclass.BaseclassMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookHotelPage extends BaseclassMethods {

	@FindBy(xpath = "//h2[@class='px-3 py-2']")
	private WebElement textmessage3;

	@FindBy(id = "own")
	private WebElement checkbox1;

	@FindBy(id = "user_title")
	private WebElement title;

	@FindBy(id = "first_name")
	private WebElement fstname;

	@FindBy(id = "last_name")
	private WebElement lstname;

	@FindBy(id = "user_phone")
	private WebElement mobileno;

	@FindBy(id = "user_email")
	private WebElement usermail;

	@FindBy(id = "gst")
	private WebElement gstclk;

	@FindBy(id = "gst_registration")
	private WebElement gstno;

	@FindBy(id = "company_name")
	private WebElement company_name;

	@FindBy(id = "company_address")
	private WebElement company_address;

	@FindBy(id = "step1next")
	private WebElement nextbtn;

	@FindBy(id = "early")
	private WebElement checkbox2;

	@FindBy(id = "other_request")
	private WebElement requestnote;

	@FindBy(id = "step2next")
	private WebElement nextbtn2;

	public WebElement getTextmessage3() {
		return textmessage3;
	}

	public WebElement getCheckbox1() {
		return checkbox1;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getFstname() {
		return fstname;
	}

	public WebElement getLstname() {
		return lstname;
	}

	public WebElement getMobileno() {
		return mobileno;
	}

	public WebElement getUsermail() {
		return usermail;
	}

	public WebElement getGstclk() {
		return gstclk;
	}

	public WebElement getGstno() {
		return gstno;
	}

	public WebElement getCompany_name() {
		return company_name;
	}

	public WebElement getCompany_address() {
		return company_address;
	}

	public WebElement getNextbtn() {
		return nextbtn;
	}

	public WebElement getCheckbox2() {
		return checkbox2;
	}

	public WebElement getRequestnote() {
		return requestnote;
	}

	public WebElement getNextbtn2() {
		return nextbtn2;
	}

	public String successmessage() {
		String elementGetText = elementGetText(textmessage3);
		return elementGetText;
	}

	public void personalDetails(String type, String firstname, String lastname) {
		eClick(checkbox1);
		selectOptionByText(title, type);
		eSendKeys(fstname, firstname);
		eSendKeys(lstname, lastname);

	}

}