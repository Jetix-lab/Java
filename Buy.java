package org.hexa;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Buy extends BaseclassMethods {
	public static void main(String[] args) throws IOException, InterruptedException {
		Buy b = new Buy();
		b.saveorderid();
	}

	public void saveorderid() throws IOException, InterruptedException {

		// launch browser & login---
		browserLaunch();
		enterApplnUrl("https://omrbranch.com/");
		maximizeWindow();
		setImplicitWait(driver, 120);

		WebElement txtuser = findLocatorById("email");
		elementSendKeys(txtuser, getcelldata("Sheet1", 1, 0));

		WebElement txtpass = findLocatorById("pass");
		elementSendKeys(txtpass, getcelldata("Sheet1", 1, 1));

		WebElement clklogin = findLocatorByXpath("//button[text()='Login']");
		elementClick(clklogin);

		// click the catergories by mouseover-----

		WebElement categories = findLocatorByXpath("(//a[@class='dropdown-toggle'])[1]");
		mouseoveropt(categories);

		WebElement gross = findLocatorByXpath("//a[text()='Grocery']");
		elementClick(gross);

		WebElement productclk = findLocatorByXpath("//a[text()='Fruit & Nuts']");
		elementClick(productclk);

		// click add to save the product on cart

		WebElement clkaddbtn1 = driver.findElement(By.xpath("(//a[text()='Add'])[3]"));
		clkaddbtn1.click();

		WebElement clkaddbtn2 = driver.findElement(By.xpath("(//button[text()='Add'])[5]"));
		clkaddbtn2.click();

		Thread.sleep(1000);
		WebElement clkgocartbtn = driver.findElement(By.xpath("//a[text()=' Go To Cart ']"));
		elementClick(clkgocartbtn);

		// to enter new address and save

		WebElement addbtnclk = findLocatorByXpath("//img[@src='https://omrbranch.com/front/images/plus.png']");
		elementClick(addbtnclk);

		WebElement addresstype = findLocatorByName("address_type");
		selectOptionByValue(addresstype, getcelldata("Sheet1", 1, 3));

		WebElement fstname = findLocatorByName("first_name");
		elementSendKeys(fstname, getcelldata("Sheet1", 1, 4));

		WebElement lstname = findLocatorByName("last_name");
		elementSendKeys(lstname, getcelldata("Sheet1", 1, 5));

		WebElement contactno = findLocatorByName("mobile");
		elementSendKeys(contactno, getcelldata("Sheet1", 1, 6));

		WebElement houseno = findLocatorByName("apartment");
		elementSendKeys(houseno, getcelldata("Sheet1", 1, 7));

		WebElement areaadd = findLocatorByName("address");
		elementSendKeys(areaadd, getcelldata("Sheet1", 1, 8));

		WebElement state = findLocatorByName("state");
		selectOptionByValue(state, getcelldata("Sheet1", 1, 9));

		WebElement city = findLocatorByName("city");
		selectOptionByValue(city, getcelldata("Sheet1", 1, 10));

		WebElement pincode = findLocatorByName("zipcode");
		elementSendKeys(pincode, getcelldata("Sheet1", 1, 11));

		WebElement btnsave = findLocatorByXpath("(//button[text()='Save'])[3]");
		elementClick(btnsave);

		// payment

		Thread.sleep(1000);
		WebElement modeslct = findLocatorById("payment_type");
		elementClick(modeslct);
		selectOptionByValue(modeslct, getcelldata("Sheet1", 1, 12));
	

		WebElement cardtypeslct = findLocatorByXpath("//label[text()=\" Master \"]");
		elementClick(cardtypeslct);

		WebElement cardno = findLocatorByName("card_no");
		elementSendKeys(cardno, getcelldata("Sheet1", 1, 13));

		WebElement month = findLocatorById("month");
		elementSendKeys(month, getcelldata("Sheet1", 1, 14));

		WebElement year = findLocatorById("year");
		elementSendKeys(year, getcelldata("Sheet1", 1, 15));
		
		WebElement cardccv = findLocatorByName("cvv");
		elementSendKeys(cardccv, getcelldata("Sheet1", 1, 16));
		
		WebElement placeorderbtn = findLocatorById("placeOrder");
		elementClick(placeorderbtn);
		
		// save order id in excel
		
		WebElement orderid = findLocatorByXpath("(//span[@class='font16 fontNormal color36'])[1]");
		String text = orderid.getText();
		System.out.println(text);
		
		
		tocreatenewcellupdatedata("Sheet1", 1, 17, text);

	}
}
