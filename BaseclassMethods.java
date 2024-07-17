package org.hexa;

import java.awt.AWTException;
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
	WebDriver driver;
	JavascriptExecutor js;
	Select select;
	File file;
	FileInputStream inpstream;
	FileOutputStream outstream;
	Workbook workbook;

//1-launch browser
	public void browserLaunch() {
		driver = new ChromeDriver();
	}

//2-url enter
	public void enterApplnUrl(String url) {
		driver.get(url);

	}

//3-maximize window
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}

//4-click ok on alert
	public void alertokclk() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	// 5-click cancel on alert
	public void alertcancelclk() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

//6-insert value in textbox
	public void elementSendKeys(WebElement element, String data) {
		elementVisibility(element);
		if (elementIsDisplayed(element) && elementIsEnabled(element)) {
			element.sendKeys(data);
		}

	}

//7- to click button
	public void elementClick(WebElement element) {
		elementVisibility(element);
		if (elementIsDisplayed(element) && elementIsEnabled(element)) {
			element.click();
		}
	}

//8-to get the application title
	public String getApplnTitle() {
		String title = driver.getTitle();
		return title;
	}

//9-to find the locator using id
	public WebElement findLocatorById(String attributeValue) {
		WebElement findElement = driver.findElement(By.id(attributeValue));
		return findElement;
	}

//10- to find locator using name
	public WebElement findLocatorByName(String attributeValue) {
		WebElement findElement = driver.findElement(By.name(attributeValue));
		return findElement;
	}

// 11- to find locator using classname
	public WebElement findLocatorByClassName(String attributeValue) {
		WebElement findElement = driver.findElement(By.className(attributeValue));
		return findElement;
	}

// 12- to find locator using xpath
	public WebElement findLocatorByXpath(String attributeValue) {
		WebElement findElement = driver.findElement(By.xpath(attributeValue));
		return findElement;
	}

//13- to get the current url
	public String getAppnUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

//14- to close all window
	public void closeWindow() {
		driver.close();
	}

//15- to close current window
	public void quitWindow() {
		driver.quit();
	}

//16- to verify id is enable
	public boolean elementIsEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}

//17- to verify id is display
	public boolean elementIsDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}

//18- to verify id is selected
	public boolean elementIsSelected(WebElement element) {
		boolean selected = element.isSelected();
		return selected;
	}

//19- to get the text
	public String elementGetText(WebElement element) {
		String text = element.getText();
		return text;
	}

//20a- to get the text from textbox (fixed value)
	// 99%--->value fixed
	public String elementGetAttributeValue(WebElement element) {
		elementVisibility(element);
		String attribute = null;
		if (elementIsDisplayed(element) && elementIsEnabled(element)) {
			attribute = element.getAttribute("value");
		}
		return attribute;

	}

//20b- to get the text from textbox (dynamic changing value)
	// 1%--->value is NOT fixed
	public String elementGetAttributeValue(WebElement element, String attributeName) {
		elementVisibility(element);
		String attribute = null;
		if (elementIsDisplayed(element) && elementIsEnabled(element)) {
			attribute = element.getAttribute(attributeName);
		}
		return attribute;
	}

//21-to select dropdown by text
	public void selectOptionByText(WebElement element, String text) {
		select = new Select(element);
		select.selectByVisibleText(text);
	}

//22-to select dropdown by attribute
	public void selectOptionByValue(WebElement element, String text) {
		select = new Select(element);
		select.selectByValue(text);
	}

//23-to select dropdown by index
	public void selectOptionByIndex(WebElement element, int index) {
		select = new Select(element);
		select.selectByIndex(index);
	}
//24-insert value by javascripto

	public void insertValueByJS(WebElement element, String attribute, String value) {
		js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].setAttribute('value','" + attribute + "')", element);
	}

//25- click btn using js
	public void btnclkbyjs(WebElement element) {
		js.executeScript("argument[0].click()", element);
	}

//26-switch to child window
	public WebDriver switchtochild(String id) {
		WebDriver window = driver.switchTo().window(id);
		return window;
	}

//27-switch to frame by index
	public void switchToFrameByIndex(int index) {
		driver.switchTo().frame(index);
	}

//28-switch to frame by id
	public void switchtoframebyid(String id) {
		driver.switchTo().frame(id);

	}

//29-get all option from dropdown as text
	public List<String> alloptnfrmdropdwon(WebElement element) {
		List<String> lstText = new ArrayList<>();
		select = new Select(element);
		List<WebElement> options = select.getOptions();
		for (int i = 0; i < options.size(); i++) {
			options.get(i);
			String text = element.getText();
			lstText.add(text);
			select.selectByVisibleText(text);

		}
		return lstText;

	}

//30-to deselect by index
	public void deselectbyindex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);

	}

//31-to deselect by attribute
	public void deselectbyattribute(WebElement element, String attribute) {
		Select select = new Select(element);
		select.deselectByValue(attribute);
	}

// 32- to deselect by text
	public void deselectbytext(WebElement element, String text) {
		Select select = new Select(element);
		select.deselectByVisibleText(text);

	}

//33- to deselect all
	public void deselectall(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}

//34-to clear value in textbox
	public void cleaarvaluefrmtxtbox(WebElement element, String text) {
		elementVisibility(element);
		if (elementIsDisplayed(element) && elementIsEnabled(element)) {
			element.clear();
		}

	}

//35-mouseover action for single option
	public void mouseoveropt(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();

	}

//36- to drag and drop
	public void draganddrop(WebElement element1, WebElement element2) {
		Actions action = new Actions(driver);
		action.dragAndDrop(element1, element2).perform();

	}

//37- using moveover right click
	public void rightclick(WebElement element) {
		Actions action = new Actions(driver);
		action.contextClick(element).perform();
	}

//38- using mouseover double click
	public void doubleclick(WebElement element) {
		Actions action = new Actions(driver);
		action.doubleClick(element).perform();
	}

//39- refresh the page
	public void refreshpage() {
		driver.navigate().refresh();
	}

//40- insert value in textbox and enter
	public void isrtandentertxt(WebElement element, String attribute) throws AWTException {
		element.sendKeys(attribute, Keys.ENTER);
	}

//41- to click first option
	public WebElement select1stopt(WebElement element) {
		Select select = new Select(element);
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		return firstSelectedOption;
	}

//42- verify the dropdown have a multi selected option 
	public boolean multiselectopt(WebElement element) {
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;
	}
//43- implicit wait

	public void setImplicitWait(WebDriver driver, int timeOut) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeOut));
	}

//44- explicit wait
	public WebElement explicitWait(WebDriver driver, By locator, int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		WebElement until = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return until;
	}
//45- fluentwait

	public WebElement fluentWait(WebDriver driver, By locator, int seconds) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(seconds))
				.pollingEvery(Duration.ofSeconds(seconds)).ignoring(Throwable.class);

		WebElement until = wait.until(ExpectedConditions.elementToBeClickable(locator));
		return until;
	}

//46- to get all window
	public Set<String> allwindowsget() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}

//47- to get parentwindow
	public void switchToChildWindow() {
		String pWindow = driver.getWindowHandle();
		Set<String> allWindowsId = driver.getWindowHandles();

		for (String eachWindowId : allWindowsId) {
			if (!pWindow.equals(eachWindowId)) {
				driver.switchTo().window(eachWindowId);
			}
		}
	}

//48- to get all options from dropdwon
	public List<String> getAllOptionsFromDropdown(WebElement element) {
		List<String> options = new ArrayList<>();
		Select select = new Select(element);
		List<WebElement> optionElements = select.getOptions();
		for (WebElement optionElement : optionElements) {
			options.add(optionElement.getText());
		}
		return options;

	}

//49- to takescreenshot fullpage
	public void screenshot(WebElement element, String sName) throws IOException {
		File s = element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(s, new File(getProjectPath() + "\\Pictures\\" + sName + ".png"));
	}

//50- to takescreenshot particular element
	public void screenshot(String sName) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File s = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(s, new File(getProjectPath() + "\\Pictures\\" + sName + ".png"));
	}

//51- to get the path of the project
	public String getProjectPath() {
		String property = System.getProperty("user.dir");
		return property;
	}

//52- webdriver waits
	public void elementVisibility(WebElement element) {
		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(60));
		driverWait.until(ExpectedConditions.visibilityOf(element));

	}
//53- to get the value from the excel sheet

	public String getcelldata(String Sheetname, int rownum, int cellnum) throws IOException {
		String res = null;
		file = new File(getProjectPath() + "\\ExcelSheets\\Details.xlsx");
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

//54- to update cell
	public void toupdatecell(String Sheetname, int rownum, int cellnum, String olddata, String newdata)
			throws IOException {
		file = new File(getProjectPath() + "\\ExcelSheets\\Details.xlsx");
		inpstream = new FileInputStream(file);
		workbook = new XSSFWorkbook(inpstream);
		Sheet sheet = workbook.getSheet(Sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		String Value = cell.getStringCellValue();
		if (Value.equals(olddata)) {
			cell.setCellValue(newdata);

		}
		inpstream = new FileInputStream(file);
		workbook.write(outstream);

	}

//55- to create new cell and update data
	public void tocreatenewcellandupdatedata(String Sheetname, int rownum, int cellnum, String data)
			throws IOException {
		file = new File(getProjectPath() + "\\ExcelSheets\\Details.xlsx");
		inpstream = new FileInputStream(file);
		workbook = new XSSFWorkbook(inpstream);
		Sheet sheet = workbook.getSheet(Sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.createCell(cellnum);
		cell.setCellValue(data);
		inpstream = new FileInputStream(file);
		workbook.write(outstream);

	}
}