package org.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Editbooking {

	@FindBy(xpath = "//a[@data-testid='username']")
	private WebElement profileclk;

	@FindBy(xpath = "//a[@class='dropdown-item padding_manage acc_anchor border-bottom ']")
	private WebElement profiledropdown;

	@FindBy(xpath = "//input[@class='form-control w-50 d-inline-block']")
	private WebElement booking_click;

	@FindBy(xpath = "//div[@class='room-code']")
	private WebElement txtroomcode;

	@FindBy(xpath = "(//h5)[1]")
	private WebElement hotelname;

	@FindBy(xpath = "//div[@class='my-booking  prize']/strong")
	private WebElement costtxt;

	@FindBy(xpath = "//button[@class='edit btn filter_btn']")
	private WebElement editbtn;

	@FindBy(xpath = "//input[@name='check_in']")
	private WebElement checkindate;

	@FindBy(xpath = "//button[@class='edit btn filter_btn']")
	private WebElement btnclk;

	@FindBy(xpath = "//li[@class='alertMsg']")
	private WebElement successmsg;

	public WebElement getProfileclk() {
		return profileclk;
	}

	public WebElement getProfiledropdown() {
		return profiledropdown;
	}

	public WebElement getBooking_click() {
		return booking_click;
	}

	public WebElement getTxtroomcode() {
		return txtroomcode;
	}

	public WebElement getHotelname() {
		return hotelname;
	}

	public WebElement getCosttxt() {
		return costtxt;
	}

	public WebElement getEditbtn() {
		return editbtn;
	}

	public WebElement getCheckindate() {
		return checkindate;
	}

	public WebElement getBtnclk() {
		return btnclk;
	}

	public WebElement getSuccessmsg() {
		return successmsg;
	}

}