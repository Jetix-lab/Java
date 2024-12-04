package org.omrbranch.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.omrbranch.baseclass.BaseclassMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelpage extends BaseclassMethods {
	public static String name;
	public static String price;

	public SelectHotelpage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='value_pltoh']")
	private WebElement lowtohigh;

	@FindBy(xpath = "//input[@id='value_phtol']")
	private WebElement hightoLow;

	@FindBy(id = "value_nasc")
	private WebElement ascendingorder;

	@FindBy(id = "value_ndesc")
	private WebElement descendingorder;

	@FindBy(xpath = "//h5[@class='font35 font-weight-bold mb-4']")
	private WebElement textsuccessmsg;

	@FindBy(xpath = "//div[@class='col-md-5 hotel-suites']//h5")
	private List<WebElement> hotelsNames;

	@FindBy(xpath = "//strong[@class='total-prize']")
	private List<WebElement> hotelprices;

	@FindBy(xpath = "//a[text()='Continue']")
	private List<WebElement> continuebtn;

	public WebElement getTextmessage2() {
		return textsuccessmsg;
	}

	public List<WebElement> getHotelsNames() {
		return hotelsNames;
	}

	public List<WebElement> getHotelprices() {
		return hotelprices;
	}

	public List<WebElement> getContinuebtn() {
		return continuebtn;
	}

	public WebElement getLowtohigh() {
		return lowtohigh;
	}

	public WebElement getHightoLow() {
		return hightoLow;
	}

	public WebElement getAscendingorder() {
		return ascendingorder;
	}

	public WebElement getDescendingorder() {
		return descendingorder;
	}

	public WebElement getTextsuccessmsg() {
		return textsuccessmsg;
	}

	public String textMessage() {
		String elementGetText = elementGetText(textsuccessmsg);
		return elementGetText;
	}

	public void userclickSortLowtoHigh() {
		defaultSwitch();
		jsclick(lowtohigh);
	}

	public void userclickSortHightoLow() {
		defaultSwitch();
		jsclick(hightoLow);
	}

	public void userclickAscendingName() {
		defaultSwitch();
		jsclick(ascendingorder);
	}

	public void userclickdecendingName() {
		defaultSwitch();
		jsclick(descendingorder);
	}

	public String verifySortLowtoHigh() {
		List<Integer> developerlist = new ArrayList<Integer>();

		for (WebElement price : getHotelprices()) {
			String priceList = price.getText();
			String replaceAll = priceList.replaceAll("[^0-9]", "");
			int replacedInt = Integer.parseInt(replaceAll);
			developerlist.add(replacedInt);

		}

		List<Integer> QualityAssurancelist = new ArrayList<Integer>();
		QualityAssurancelist.addAll(developerlist);

		Collections.sort(QualityAssurancelist);

		String AssertCheckMsg;
		return (developerlist.equals(QualityAssurancelist)) ? AssertCheckMsg = "Low to High Sorted" : "Not Sorted";

	}

	public String verifySortHightolow() {
		List<Integer> developerlist = new ArrayList<Integer>();

		for (WebElement price : getHotelprices()) {
			String priceList = price.getText();
			String replaceAll = priceList.replaceAll("[^0-9]", "");
			int replacedInt = Integer.parseInt(replaceAll);
			developerlist.add(replacedInt);

		}
		List<Integer> QualityAssurancelist = new ArrayList<Integer>();
		QualityAssurancelist.addAll(developerlist);

		String AssertCheckMsg;
		return (developerlist.equals(QualityAssurancelist)) ? AssertCheckMsg = "Sorted" : "Not Sorted";

	}

	public boolean verifySortAsctoDesc() {
		List<String> developerlist = new ArrayList<String>();
		List<String> QualityAssurancelist = new ArrayList<>();
		for (WebElement element : getHotelsNames()) {
			String hotel = element.getText();
			developerlist.add(hotel);
		}
		QualityAssurancelist.addAll(developerlist);
		Collections.sort(QualityAssurancelist);
		boolean AssertCheckMsg;

		return (developerlist.equals(QualityAssurancelist)) ? AssertCheckMsg = true : false;
	}

	public boolean verifySortDesctoAsc() {
		List<String> developerlist = new ArrayList<String>();
		for (WebElement element : getHotelsNames()) {
			String hotel = element.getText();
			List<String> asList = Arrays.asList(hotel);
			developerlist.addAll(asList);
		}
		List<String> QualityAssurancelist = new ArrayList<>();
		QualityAssurancelist.addAll(developerlist);
		boolean AssertCheckMsg;

		return (developerlist.equals(QualityAssurancelist)) ? AssertCheckMsg = true : false;
	}

	public String checkRoomType() {
		List<Boolean> listBoolean = new ArrayList<Boolean>();
		List<String> developerlist = new ArrayList<String>();
		for (WebElement string : getHotelsNames()) {
			String hotel = string.getText();
			List<String> asList = Arrays.asList(hotel);
			developerlist.addAll(asList);
		}
		for (String WebElement : developerlist) {
			listBoolean.add(WebElement.endsWith("Standard"));
		}
		boolean contains = listBoolean.contains(false);
		String message;
		if (contains == false) {
			message = "Standard";
		} else {
			message = "Condition Failed";
		}
		return message;
	}

	public void firstHotelClick() {
		name = hotelsNames.get(0).getText();
	}

	public void firsthotelprice() {
		price = hotelprices.get(0).getText();
	}

	public void buttonclick() {
		continuebtn.get(0).click();
	}

	public void handlealertaccept() {
		Alertaccept();
	}

	public void handlealertdismiss() {
		Alertdismiss();
	}
}
