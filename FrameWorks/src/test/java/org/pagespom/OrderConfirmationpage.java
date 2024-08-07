package org.pagespom;

import org.baseclass.BaseclassMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmationpage extends BaseclassMethods {

	public OrderConfirmationpage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h5[@class='font35 font-weight-bold color11 text-center pageTitle']")
	private WebElement ordermessage;

	@FindBy(xpath = "(//span[@class='font16 fontNormal color36'])[1]")
	private WebElement orderid;

	public WebElement getOrdermessage() {
		return ordermessage;
	}

	public WebElement getOrderid() {
		return orderid;
	}

	public String fororderid() {
		String orderno = elementGetText(orderid);
		System.out.println(orderno);
		return orderno;

	}

	public String messageorder() {
		String text3 = elementGetText(ordermessage);
		System.out.println(text3);
		return text3;

	}
}
