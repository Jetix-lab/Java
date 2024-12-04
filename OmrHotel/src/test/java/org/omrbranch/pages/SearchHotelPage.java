package org.omrbranch.pages;

import org.omrbranch.baseclass.BaseclassMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseclassMethods {

	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@data-testid='username']")
	private WebElement textmessage;

	@FindBy(id = "state")
	private WebElement stateSelection;

	@FindBy(id = "city")
	private WebElement citySelection;

	@FindBy(id = "room_type")
	private WebElement roomTypeSelection;

	@FindBy(xpath = "//input[@name='check_in']")
	private WebElement checkindate;

	@FindBy(xpath = "//input[@name='check_out']")
	private WebElement checkoutdate;

	@FindBy(id = "no_rooms")
	private WebElement no_of_rooms;

	@FindBy(id = "no_adults")
	private WebElement no_of_adults;

	@FindBy(id = "no_child")
	private WebElement no_of_childs;

	@FindBy(xpath = "//button[@class='btn filter_btn']")
	private WebElement btnclick;

	public WebElement getTextmessage() {
		return textmessage;
	}

	public WebElement getStateSelection() {
		return stateSelection;
	}

	public WebElement getCitySelection() {
		return citySelection;
	}

	public WebElement getRoomTypeSelection() {
		return roomTypeSelection;
	}

	public WebElement getCheckindate() {
		return checkindate;
	}

	public WebElement getCheckoutdate() {
		return checkoutdate;
	}

	public WebElement getNo_of_rooms() {
		return no_of_rooms;
	}

	public WebElement getNo_of_adults() {
		return no_of_adults;
	}

	public WebElement getNo_of_childs() {
		return no_of_childs;
	}

	public WebElement getBtnclick() {
		return btnclick;
	}

	public String textLoginSuccessMessage() {
		String elementGetText = elementGetText(textmessage);
		return elementGetText;

	}

	public void searchHotel(String statename, String cityname, String roomtype, String datein, String dateout,
			String rooms, String adults, String childs) {

		selectOptionByText(stateSelection, statename);
		selectOptionByText(citySelection, cityname);
		selectOptionByText(roomTypeSelection, roomtype);
		jssendkeys(checkindate, datein);
		jssendkeys(checkoutdate, dateout);
		selectOptionByText(no_of_rooms, rooms);
		selectOptionByText(no_of_adults, adults);
		eSendKeys(no_of_childs, childs);
		switchToFrameByIndex(0);
		eClick(btnclick);
		defaultSwitch();

	}

	public void searchHotelBymandatory(String statename, String cityname, String datein, String dateout, String rooms,
			String adults) {

		selectOptionByText(stateSelection, statename);
		selectOptionByText(citySelection, cityname);
		jssendkeys(checkindate, datein);
		jssendkeys(checkoutdate, dateout);
		selectOptionByText(no_of_rooms, rooms);
		selectOptionByText(no_of_adults, adults);
		switchToFrameByIndex(0);
		eClick(btnclick);
		defaultSwitch();

	}

}
