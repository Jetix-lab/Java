package org.hexa;

import java.time.Duration;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junittask1 {
	static WebDriver driver;

	@BeforeClass
	public static void launchbrowser() {
		driver = new ChromeDriver();
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

	}

	@Test
	public void performlogin(){
		WebElement userid = driver.findElement(By.id("email"));
		userid.sendKeys("ganesh24124@gmail.com");
		String name = userid.getAttribute("value");
		Assert.assertEquals("verify the username","ganesh24124@gmail.com", name);

		WebElement userpass = driver.findElement(By.id("pass"));
		userpass.sendKeys("Ganesh@5798");
		String pass = userpass.getAttribute("value");
		Assert.assertEquals("verify the password","Ganesh@5798", pass);

		WebElement btnlogin = driver.findElement(By.xpath("//button[text()=\"Login\"]"));
		btnlogin.click();
		
	
		WebElement textwelcome = driver.findElement(By.xpath("//a[@data-testid='username']"));
		
		String text = textwelcome.getText();
		System.out.println(text);
		boolean verify = text.contains("Ganesh");
		Assert.assertTrue("verify the msg is located", verify);
		
	}
}

//	@Before
//	public void ssbefore() throws IOException {
//		TakesScreenshot screenshot = (TakesScreenshot) driver;
//		File file = screenshot.getScreenshotAs(OutputType.FILE);
//
//		File fdest = new File("C:\\Users\\ADMIN\\eclipse-workspace\\FrameWorks\\Pictures\\before.jpg");
//		FileUtils.copyFile(file, fdest);
//	}
//
//	@After
//	public void ssafter() throws IOException {
//		TakesScreenshot screenshot = (TakesScreenshot) driver;
//		File file = screenshot.getScreenshotAs(OutputType.FILE);
//
//		File fdest1 = new File("C:\\Users\\ADMIN\\eclipse-workspace\\FrameWorks\\Pictures\\after.jpg");
//		FileUtils.copyFile(file, fdest1);
//	}
//
//	@AfterClass
//	public static void browserclose() {
//		driver.quit();
//	}
//
//}
