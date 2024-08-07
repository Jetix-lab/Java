package org.hexa;

import java.io.IOException;

import org.baseclass.BaseclassMethods;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Junittask2 extends BaseclassMethods {

	@BeforeClass
	public static void beforeclass() {
		browserLaunch();
		enterApplnUrl("https://omrbranch.com/");
		maximizeWindow();
		setImplicitWait(driver, 120);
	}

//	@AfterClass
//	public static void afterclass() {
//		quitWindow();
//	}

	@Test
	public void orderplace() throws IOException, InterruptedException {
		WebElement txtuser = findLocatorById("email");
		eSendKeys(txtuser, getcelldata("Sheet1", 1, 0));

		WebElement txtpass = findLocatorById("pass");
		eSendKeys(txtpass, getcelldata("Sheet1", 1, 1));

		WebElement clklogin = findLocatorByXpath("//button[text()='Login']");
		eClick(clklogin);

		WebElement textwelcome = findLocatorByXpath("//a[@data-testid='username']");
		String text1 = textwelcome.getText();
		System.out.println(text1);
		Assert.assertEquals("verify the msg is located", "Welcome Ganesh", text1);

		// click the catergories by mouseover-----

		WebElement categories = findLocatorByXpath("(//a[@class='dropdown-toggle'])[1]");
		SingleOptionMouse(categories);

		WebElement gross = findLocatorByXpath("//a[text()='Grocery']");
		eClick(gross);

		WebElement productclk = findLocatorByXpath("//a[text()='Fruit & Nuts']");
		eClick(productclk);

		// click add to save the product on cart
		Thread.sleep(1000);
		WebElement clkaddbtn1 = driver.findElement(By.xpath("//a[@class='hover1 font16 fontsemibold colorWhite bgTheme px-4 py-1 radius50 dyna_btn addBtn-35']"));
		clkaddbtn1.click();

		WebElement clkaddbtn2 = driver.findElement(By.id("cart-49"));
		clkaddbtn2.click();

		WebElement statusmsg1 = findLocatorByXpath("//div[@class='toast-message']");
		String text2 = statusmsg1.getText();
		System.out.println(text2);
		Assert.assertEquals("verify the msg is present", "Product added in cart", text2);

		Thread.sleep(1000);
		WebElement clkgocartbtn = driver.findElement(By.xpath("//a[@class='hover1']"));
		eClick(clkgocartbtn);

		// to enter new address and save

		WebElement addbtnclk = findLocatorByXpath("//img[@src='https://omrbranch.com/front/images/plus.png']");
		eClick(addbtnclk);

		WebElement addresstype = findLocatorByName("address_type");
		selectOptionByValue(addresstype, getcelldata("Sheet1", 1, 3));

		WebElement fstname = findLocatorByName("first_name");
		eSendKeys(fstname, getcelldata("Sheet1", 1, 4));

		WebElement lstname = findLocatorByName("last_name");
		eSendKeys(lstname, getcelldata("Sheet1", 1, 5));

		WebElement contactno = findLocatorByName("mobile");
		eSendKeys(contactno, getcelldata("Sheet1", 1, 6));

		WebElement houseno = findLocatorByName("apartment");
		eSendKeys(houseno, getcelldata("Sheet1", 1, 7));

		WebElement areaadd = findLocatorByName("address");
		eSendKeys(areaadd, getcelldata("Sheet1", 1, 8));

		WebElement state = findLocatorByName("state");
		selectOptionByValue(state, getcelldata("Sheet1", 1, 9));

		WebElement city = findLocatorByName("city");
		selectOptionByValue(city, getcelldata("Sheet1", 1, 10));

		WebElement pincode = findLocatorByName("zipcode");
		eSendKeys(pincode, getcelldata("Sheet1", 1, 11));

		WebElement btnsave = findLocatorByXpath("(//button[text()='Save'])[3]");
		eClick(btnsave);

		// payment

		Thread.sleep(1000);
		WebElement modeslct = findLocatorById("payment_type");
		eClick(modeslct);
		selectOptionByValue(modeslct, getcelldata("Sheet1", 1, 12));

		WebElement cardtypeslct = findLocatorByXpath("//label[text()=\" Master \"]");
		eClick(cardtypeslct);

		WebElement cardno = findLocatorByName("card_no");
		eSendKeys(cardno, getcelldata("Sheet1", 1, 13));

		WebElement month = findLocatorById("month");
		eSendKeys(month, getcelldata("Sheet1", 1, 14));

		WebElement year = findLocatorById("year");
		eSendKeys(year, getcelldata("Sheet1", 1, 15));

		WebElement cardccv = findLocatorByName("cvv");
		eSendKeys(cardccv, getcelldata("Sheet1", 1, 16));

		WebElement placeorderbtn = findLocatorById("placeOrder");
		eClick(placeorderbtn);

		// save order id in excel

		WebElement orderid = findLocatorByXpath("(//span[@class='font16 fontNormal color36'])[1]");
		String text = orderid.getText();
		System.out.println(text);
		SetCellData("Sheet1", 1, 17, text);

	}
}
