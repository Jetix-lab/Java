package org.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TvsAutomate {

	public static void main(String[] args) throws InterruptedException {

		// user open the browser and launching the url
		WebDriver driver = new EdgeDriver();
		driver.get("https://tvscreditserviceslimited--losuat.sandbox.my.salesforce.com/");
		driver.manage().window().maximize();

		// user enter the valid username
		WebElement Username = driver.findElement(By.id("username"));
		Username.sendKeys("ayesha.agent@tvscredit.com.losuat");

		// user enter the valid password
		WebElement UserPass = driver.findElement(By.id("password"));
		UserPass.sendKeys("Akthar123");

		// user click the login button
		WebElement Btnlogin = driver.findElement(By.id("Login"));
		Btnlogin.click();

		// then user verify that moving to next page

		// user click the customer profile
		Thread.sleep(10000);
		WebElement Custprofile = driver.findElement(By.xpath("(//a[@class='slds-truncate'])[1]"));
		Custprofile.click();

		Thread.sleep(10000);
		WebElement startNewAppBtn = driver.findElement(
				By.xpath("//div[@class='slds-p-around_medium']//button[@class='slds-button slds-button_brand']"));
		startNewAppBtn.click();
	}
}
