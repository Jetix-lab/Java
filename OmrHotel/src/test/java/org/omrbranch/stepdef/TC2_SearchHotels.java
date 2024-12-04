package org.omrbranch.stepdef;

import org.junit.Assert;
import org.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC2_SearchHotels {

	PageObjectManager pom = new PageObjectManager();

	@When("User Searching The Hotel {string},{string},{string},{string},{string},{string},{string} And {string}")
	public void userSearchingTheHotelAnd(String statename, String cityname, String roomtype, String datein,
			String dateout, String rooms, String adults, String childs) {
		pom.getSearchHotelPage().searchHotel(statename, cityname, roomtype, datein, dateout, rooms, adults, childs);
	}

	@Then("User should Verify Success Message after Search hotels {string}")
	public void userShouldVerifySuccessMessageAfterSearchHotels(String expSuccessMessage) {
		Assert.assertEquals("Verify The Success Message", expSuccessMessage, pom.getSelectHotelpage().textMessage());
	}

	@When("User Searching The Hotel {string},{string},{string},{string},{string} And {string}")
	public void userSearchingTheHotelAnd(String statename, String cityname, String datein, String dateout, String rooms,
			String adults) {
		pom.getSearchHotelPage().searchHotelBymandatory(statename, cityname, datein, dateout, rooms, adults);

	}

	@When("User Click The Sort To Get The Hotel From Low To High price")
	public void userClickTheSortToGetTheHotelFromLowToHighPrice() throws Exception {
		Thread.sleep(5000);
		pom.getSelectHotelpage().userclickSortLowtoHigh();
	}

	@Then("User should Verify the Hotel Page are Sorted to Low to High")
	public void userShouldVerifyTheHotelPageAreSortedToLowToHigh() throws Exception {
		Thread.sleep(5000);
		Assert.assertEquals("Verify the List is Sorted ", "Low to High Sorted",
				pom.getSelectHotelpage().verifySortLowtoHigh());
	}

	@When("User Click The Sort To Get The Hotel From High To Low price")
	public void userClickTheSortToGetTheHotelFromHighToLowPrice() throws Exception {
		Thread.sleep(5000);
		pom.getSelectHotelpage().userclickSortHightoLow();

	}

	@Then("User should Verify the Hotel Page are Sorted to High to Low")
	public void userShouldVerifyTheHotelPageAreSortedToHighToLow() throws Exception {
		Thread.sleep(5000);
		Assert.assertEquals("Verify the List is Sorted ", "Sorted",
				pom.getSelectHotelpage().verifySortHightolow());

	}

	@When("User Click The Sort To Get The Hotel From Ascending To Descending")
	public void userClickTheSortToGetTheHotelFromAscendingToDescending() throws InterruptedException {
		Thread.sleep(5000);
		pom.getSelectHotelpage().userclickAscendingName();
	}

	@Then("User should Verify the Hotel Page are Sorted to Ascending To Descending")
	public void userShouldVerifyTheHotelPageAreSortedToAscendingToDescending() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue("Verify the List is Sorted", pom.getSelectHotelpage().verifySortAsctoDesc());
	}

	@When("User Click The Sort To Get The Hotel From Descending To Ascending")
	public void userClickTheSortToGetTheHotelFromDescendingToAscending() throws InterruptedException {
		Thread.sleep(5000);
		pom.getSelectHotelpage().userclickdecendingName();
	}

	@Then("User should Verify the Hotel Page are Sorted to Descending To Ascending")
	public void userShouldVerifyTheHotelPageAreSortedToDescendingToAscending() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue("Verify the List is Sorted", pom.getSelectHotelpage().verifySortDesctoAsc());
	}

	@Then("User should verify the Hotel name ends with {string}")
	public void userShouldVerifyTheHotelNameEndsWith(String string) {
		pom.getSelectHotelpage().checkRoomType();
	}

}
