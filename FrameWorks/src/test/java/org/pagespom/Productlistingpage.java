package org.pagespom;

import org.baseclass.BaseclassMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productlistingpage extends BaseclassMethods {

	public Productlistingpage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h5[@class='sectionTitle font35 font-weight-bold color11']")
	private WebElement productpagemsg;

	@FindBy(xpath = "//a[@class='hover1 font16 fontsemibold colorWhite bgTheme px-4 py-1 radius50 dyna_btn addBtn-35']")
	private WebElement clkaddbtn1;

	@FindBy(id = "cart-49")
	private WebElement clkaddbtn2;

	@FindBy(xpath = "//a[@class='hover1']")
	private WebElement gocartclk;


	public WebElement getProductpagemsg() {
		return productpagemsg;
	}

	public WebElement getClkaddbtn1() {
		return clkaddbtn1;
	}

	public WebElement getClkaddbtn2() {
		return clkaddbtn2;
	}

	public WebElement getGocartclk() {
		return gocartclk;
	}

	public void product() {
		eClick(clkaddbtn1);
		eClick(clkaddbtn2);
		jsclick(gocartclk);
	}

	public String msgfromproduct() {
		String text1 = elementGetText(productpagemsg);
		System.out.println(text1);
		return text1;
	}
}
