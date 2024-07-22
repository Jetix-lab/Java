package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseclassMethods {
	public static WebDriver driver;
	Select select;
	File file;
	FileInputStream inpstream;
	FileOutputStream outstream;
	Workbook workbook;
	Actions action;

//-----------------#1-Waits-----------------//	

	// Implicit wait
	public static void setImplicitWait(WebDriver driver, int timeOut) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeOut));
	}

	// Explicit wait
	public WebElement setexplicitWait(WebElement element, int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		WebElement until = wait.until(ExpectedConditions.visibilityOf(element));
		return until;
	}

	// Fluentwait
	public WebElement fluentWait(WebElement element, int seconds) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(seconds))
				.pollingEvery(Duration.ofSeconds(seconds)).ignoring(Throwable.class);

		WebElement until = wait.until(ExpectedConditions.elementToBeClickable(element));
		return until;
	}

//-----------------#2-launch browser-----------------//	

	public static void browserLaunch() {
		driver = new ChromeDriver();
	}

//-----------------#3-Url Insert-----------------//	

	public static void enterApplnUrl(String url) {
		driver.get(url);

	}

//-----------------#4-Maximize Screen-----------------//	

	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}

// -----------------#5-To Get Current URl -----------------//

	public String getAppnUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

// -----------------#6-To Get Application Title -----------------//

	public String getApplnTitle() {
		String title = driver.getTitle();
		return title;
	}

// -----------------#7-To Close Current window -----------------//

	public static void closeWindow() {
		driver.close();
	}

// -----------------#8-To Close All window-----------------//

	public static void quitWindow() {
		driver.quit();
	}

// -----------------#9-To Find The Locator By Id-----------------//

	public WebElement findLocatorById(String attributeValue) {
		WebElement findElement = driver.findElement(By.id(attributeValue));
		return findElement;
	}

// -----------------#10-To Find The Locator By Name-----------------//

	public WebElement findLocatorByName(String attributeValue) {
		WebElement findElement = driver.findElement(By.name(attributeValue));
		return findElement;
	}

// -----------------#11-To Find The Locator By ClassName-----------------//

	public WebElement findLocatorByClassName(String attributeValue) {
		WebElement findElement = driver.findElement(By.className(attributeValue));
		return findElement;
	}

// -----------------#12-To Find The Locator By Xpath-----------------//

	public WebElement findLocatorByXpath(String attributeValue) {
		WebElement findElement = driver.findElement(By.xpath(attributeValue));
		return findElement;
	}

// -----------------#13-To Insert Txt By SendKeys-----------------//

	public void eSendKeys(WebElement element, String data) {
		setexplicitWait(element, 60);
		if (elementIsDisplayed(element) && elementIsEnabled(element)) {
			element.sendKeys(data);
		}
	}

// -----------------#14- To Click-----------------//

	public void eClick(WebElement element) {
		setexplicitWait(element, 120);
		if (elementIsDisplayed(element) && elementIsEnabled(element)) {
			element.click();
		}
	}

// -----------------#15- To Clear The TxtBox-----------------//

	public void ClearTxtBox(WebElement element) {
		setexplicitWait(element, 60);
		if (elementIsDisplayed(element) && elementIsEnabled(element)) {
			element.clear();
		}
	}

// -----------------#16- To Insert Txt And Enter-----------------//

	public void SendkeysAndEnter(WebElement element, String attribute) {
		setexplicitWait(element, 60);
		element.sendKeys(attribute, Keys.ENTER);
	}

// -----------------#17- To Verify IsEnable-----------------//

	public boolean elementIsEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}

// -----------------#18- To Verify IsDisplayed-----------------//

	public boolean elementIsDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}

// -----------------#19- To Verify IsSelected-----------------//

	public boolean elementIsSelected(WebElement element) {
		boolean selected = element.isSelected();
		return selected;
	}

// -----------------#20- To GetText-----------------//
	public String elementGetText(WebElement element) {
		setexplicitWait(element, 60);
		String text = element.getText();
		return text;
	}

// -----------------#21a- To Get The Value From Txtbox (Fixed Value)------ 99%--->value fixed//

	public String elementGetAttributeValue(WebElement element) {
		setexplicitWait(element, 60);
		String attribute = null;
		if (elementIsDisplayed(element) && elementIsEnabled(element)) {
			attribute = element.getAttribute("value");
		}
		return attribute;
	}

// -----------------#21b- To Get The Value From Txtbox (Dynamic Changing Value)------1%--->value is NOT fixed//
	public String elementGetAttributeValue(WebElement element, String attributeName) {
		setexplicitWait(element, 60);
		String attribute = null;
		if (elementIsDisplayed(element) && elementIsEnabled(element)) {
			attribute = element.getAttribute(attributeName);
		}
		return attribute;
	}

// -----------------#22- Alerts-----------------//

	// To Accept

	public void Alertaccept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	// To GetTxt From Alert
	public void Alerttext() {
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
	}

	// To Insert Value In Alert
	public void promptAlert(String data) {
		driver.switchTo().alert().sendKeys(data);
	}

	// To Dismiss
	public void Alertdismiss() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

// -----------------#23- To Switch Frame -----------------//

	// By Index
	public void switchToFrameByIndex(int index) {
		driver.switchTo().frame(index);
	}

	// By Id
	public void switchtoframebyId(String id) {
		driver.switchTo().frame(id);
	}

// -----------------#24- DropDowns -----------------//

	// Get All Option From DropDown As Txt
	public List<String> getAllOptionsAsTxt(WebElement element) {
		List<String> lstText = new ArrayList<>();
		select = new Select(element);
		List<WebElement> options = select.getOptions();
		for (WebElement webelement : options) {
			String text = webelement.getText();
			lstText.add(text);
		}
		return lstText;

	}

	// Get All Option From DropDown As Attribute
	public List<String> getAllOptionValue(WebElement element, String Attribute) {
		Select select = new Select(element);
		List<String> lstText = new ArrayList<>();
		List<WebElement> options = select.getOptions();
		for (WebElement webElement : options) {
			String text = webElement.getAttribute(Attribute);
			lstText.add(text);
		}
		return lstText;
	}

	// Select DropDown By Txt
	public void selectOptionByText(WebElement element, String text) {
		select = new Select(element);
		select.selectByVisibleText(text);
	}

	// Select DropDown By Attribute
	public void selectOptionByValue(WebElement element, String text) {
		select = new Select(element);
		select.selectByValue(text);
	}

	// Select DropDown By Index
	public void selectOptionByIndex(WebElement element, int index) {
		select = new Select(element);
		select.selectByIndex(index);
	}

	// Select DropDown By FirstOption
	public WebElement SelectFstOption(WebElement element) {
		Select select = new Select(element);
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		return firstSelectedOption;
	}

	// To Verify The DropDown Is Multi Select
	public boolean MultipleSelect(WebElement element) {
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;
	}

	// DeSelect DropDown By Index
	public void Deselectbyindex(WebElement element, int index) {
		setexplicitWait(element, 60);
		Select select = new Select(element);
		select.deselectByIndex(index);
	}

	// DeSelect DropDown By Attribute
	public void Deselectbyvalue(WebElement element, String attribute) {
		setexplicitWait(element, 60);
		Select select = new Select(element);
		select.deselectByValue(attribute);
	}

	// DeSelect DropDown By Txt
	public void Deselectbytext(WebElement element, String text) {
		setexplicitWait(element, 60);
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}

	// DeSelect All From DropDown
	public void Deselectall(WebElement element) {
		setexplicitWait(element, 60);
		Select select = new Select(element);
		select.deselectAll();
	}

// -----------------#25- JavaScript Executor -----------------//	

	// Insert Value To TxtBox by JavaScript
	public void jssendkeys(WebElement element, String attribute) {
		setexplicitWait(element, 120);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("argument[0].setAttribute('value','" + attribute + "')", element);
	}

	// To Click Button By JavaScript
	public void jsclick(WebElement element) {
		setexplicitWait(element, 120);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", element);
	}

// -----------------#26- Mouseover -----------------//

	// To MouseOver Single Option
	public void SingleOptionMouse(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}

	// To MouseOver Right Click
	public void rightclick(WebElement element) {
		Actions action = new Actions(driver);
		action.contextClick(element).perform();
	}

	// To MouseOver Double Click
	public void doubleclick(WebElement element) {
		Actions action = new Actions(driver);
		action.doubleClick(element).perform();
	}

// -----------------#27- Drag & Drop -----------------//
	public void draganddrop(WebElement element1, WebElement element2) {
		Actions action = new Actions(driver);
		action.dragAndDrop(element1, element2).perform();
	}

// -----------------#28- Windows -----------------//

	// Refresh The Page
	public void refreshpage() {
		driver.navigate().refresh();
	}

	// To Get All Window Id
	public Set<String> Allwindowsget() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}

	// To Get Parent Window Id
	public String GetParentWindowId() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}

	// Switch To Child Window
	public void switchToChildWindow() {
		String pWindow = driver.getWindowHandle();
		Set<String> allWindowsId = driver.getWindowHandles();

		for (String eachWindowId : allWindowsId) {
			if (!pWindow.equals(eachWindowId)) {
				driver.switchTo().window(eachWindowId);
			}
		}
	}

// -----------------#29- ScreenShots -----------------//

	// To TakeScreenshot Fullpage
	public void Fullscreenshot(WebElement element, String sName) throws IOException {
		File s = element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(s, new File(getProjectPath() + "\\Pictures\\" + sName + ".png"));
	}

	// To TakeScreenshot Particular Element
	public void Particularscreenshot(String sName) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File s = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(s, new File(getProjectPath() + "\\Pictures\\" + sName + ".png"));
	}

// -----------------#30- To Get Path Location -----------------//
	public String getProjectPath() {
		String property = System.getProperty("user.dir");
		return property;
	}

// -----------------#31- To Perform On ExcelSheet -----------------//

	// To Get The Value From The Excel Sheet
	public String getcelldata(String Sheetname, int rownum, int cellnum) throws IOException {
		String res = null;
		file = new File(getProjectPath() + "\\ExcelSheets\\Book1.xlsx");
		inpstream = new FileInputStream(file);
		workbook = new XSSFWorkbook(inpstream);
		Sheet sheet = workbook.getSheet(Sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		CellType celltype = cell.getCellType();
		switch (celltype) {
		case STRING:
			res = cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				java.util.Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yy");
				res = dateformat.format(dateCellValue);

			} else {
				double numericCellValue = cell.getNumericCellValue();
				long round = Math.round(numericCellValue);
				if (numericCellValue == round) {
					res = String.valueOf(round);
				} else {
					res = String.valueOf(numericCellValue);
				}
			}
			break;
		default:
			break;
		}
		return res;

	}

//To Update Data in cell On Excel
	public void toupdatecell(String Sheetname, int rownum, int cellnum, String olddata, String newdata)
			throws IOException {
		file = new File(getProjectPath() + "\\ExcelSheets\\Book1.xlsx");
		inpstream = new FileInputStream(file);
		workbook = new XSSFWorkbook(inpstream);
		Sheet sheet = workbook.getSheet(Sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		String Value = cell.getStringCellValue();
		if (Value.equals(olddata)) {
			cell.setCellValue(newdata);

		}
		outstream = new FileOutputStream(file);
		workbook.write(outstream);

	}

//To Create New Cell And Update Data
	public void SetCellData(String Sheetname, int rownum, int cellnum, String data) throws IOException {
		file = new File(getProjectPath() + "\\ExcelSheets\\Book1.xlsx");
		inpstream = new FileInputStream(file);
		workbook = new XSSFWorkbook(inpstream);
		Sheet sheet = workbook.getSheet(Sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.createCell(cellnum);
		cell.setCellValue(data);
		outstream = new FileOutputStream(file);
		workbook.write(outstream);

	}

	// 52- webdriver waits
	public void elementVisibility(WebElement element) {
		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(60));
		driverWait.until(ExpectedConditions.visibilityOf(element));

	}
}