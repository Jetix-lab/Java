package org.hexa;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {
	static Workbook workbook;
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();
		
		WebElement usrname = driver.findElement(By.name("email"));
		usrname.sendKeys("gmuthu161@gmail.com");
		
		WebElement usrpass = driver.findElement(By.name("pass"));
		usrpass.sendKeys("pass@1234");
		
		WebElement clklogin = driver.findElement(By.xpath("//button[text()=\"Login\"]"));
		clklogin.click();
		// mention the path of the excel file
				File file = new File("C:\\Users\\ADMIN\\eclipse-workspace\\FrameWorks\\ExcelSheets\\Details.xlsx");
				// get the bytes/object from file-----> fileinputstream
				FileInputStream stream = new FileInputStream(file);
				// workbook-->collection of sheets
				workbook = new XSSFWorkbook(stream);
				// sheet details
				Sheet sheet = workbook.getSheet("demo");
				// iterate the row
				for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
					Row row = sheet.getRow(i);

					for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
						Cell cell = row.getCell(j);

						CellType Type = cell.getCellType();

						switch (Type) {
						case STRING:
							String value = cell.getStringCellValue();
							System.out.println(value);
							break;
						case NUMERIC:
							if (DateUtil.isCellDateFormatted(cell)) {
								Date dateCellValue = cell.getDateCellValue();
								SimpleDateFormat f = new SimpleDateFormat("dd-MMM-yy");
								String format = f.format(dateCellValue);
								System.out.println(format);

							} else {
								double numericCellValue = cell.getNumericCellValue();
//								BigDecimal b = BigDecimal.valueOf(numericCellValue);
//								String number = String.valueOf(b);
//								System.out.println(number);
								long round = Math.round(numericCellValue);
								if (round == numericCellValue) {
									String valueOf = String.valueOf(round);
									System.out.println(valueOf);
								} else {
									String valueOf1 = String.valueOf(numericCellValue);
									System.out.println(valueOf1);
								}

							}
							break;

						default:
							break;
						}

					}

				}
			}
		}
