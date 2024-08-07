package org.pagespom;

import org.baseclass.BaseclassMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchproductpage extends BaseclassMethods {

	public Searchproductpage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@data-testid='username']")
	private WebElement gettheloginmsg;

	@FindBy(xpath = "//a[text()='CATEGORIES ']")
	private WebElement categories;

	@FindBy(xpath = "//a[text()='Grocery']")
	private WebElement gross;

	@FindBy(xpath = "//a[text()='Fruit & Nuts']")
	private WebElement productclk;

	public WebElement getGettheloginmsg() {
		return gettheloginmsg;

	}

	public String txtgetmsg() {
		String text = elementGetText(gettheloginmsg);
		return text;

	}
	public void searchproduct() {
		SingleOptionMouse(categories);
		SingleOptionMouse(gross);
		eClick(productclk);

	}
}

