 package org.pojo;

import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableClass {
	public static WebDriver driver;
	public static TakesScreenshot ts;
	public static JavascriptExecutor js;
	public static Actions a;
	public static Select s;
	public static Alert alert;
	public static Robot r;

	public static void browserConfiguration() {
		driver=new ChromeDriver();
		
	}
	public void dateAndTime() {
	       Date d=new Date();
	       System.out.println(d);
		
	}
	
	public static void launchBrowser(String url) {
		driver.get(url);	
	}
	public static void title() {
		driver.getTitle();
	}
	
	public static void maxWindow(){
		driver.manage().window().maximize();
		
	}
	public static void implicityWait(long time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		
	}
	public static void screenShot(String locationAndFileName) throws IOException {
		ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\user\\eclipse-workspace\\Maven_Project\\snap");
		FileUtils.copyFile(source, destination);
	}
	
	public static void moveToElement(WebElement element) {
		a=new Actions(driver);
		a.moveToElement(element).perform();
	}
	public static void moveToElement(WebElement source,WebElement destination) {
		a=new Actions(driver);
		a.dragAndDrop(source,destination);
	}
	public static void doubleClick() {
		a=new Actions(driver);
		a.doubleClick().perform();
	}
	public static void contextClick()  {
		a=new Actions(driver);
		a.contextClick().perform();
	}
	public static void keyUp() {
		a=new Actions(driver);
		a.keyUp(null).perform();
	}
	public static void keyDown() {
		a=new Actions(driver);
		a.keyDown(null, null).perform();
	}
	public static void alert1() {
		driver.switchTo().alert();
		alert.accept();
	}

	public static void alert2() {
		driver.switchTo().alert();
		alert.dismiss();
	}
	public static void buttonClick(WebElement element) {
		element.click();
	}
	public static void fillTextBox(WebElement element,String value) {
		element.sendKeys(value);
	}
	public static void closeBrowser() {
	driver.close();
	}
	public static void frames(WebElement element) {
		driver.switchTo().frame(element);
	}
	public static void dropDown(WebElement element,String visibleText) {
		s=new Select(element);
		s.selectByVisibleText(visibleText);
	}
	public static void Quit() {
		driver.quit();
	}	
	public static String excelData(String fileLocation,String sheet,int row,int cell) throws IOException {
		
		File f=new File(fileLocation);
		
		FileInputStream fis=new FileInputStream(f);
		
		
		
		Workbook w=new XSSFWorkbook(fis);
		
		Sheet s = w.getSheet(sheet);
		
		Row r = s.getRow(row);
		
		Cell c = r.getCell(cell);
		
		
		String value="";
		
		if (c.getCellType()==1) {
		value = c.getStringCellValue();
		}
		
		else if (DateUtil.isCellDateFormatted(c)) {
			
			Date dateCellValue = c.getDateCellValue();		//1.2.2025
			
			SimpleDateFormat sd=new SimpleDateFormat();
			
			
			value = sd.format(dateCellValue);
			//System.out.println(format);
		} 
			else {
				double num=c.getNumericCellValue();
				
				long l=(long)num;
				
				value = String.valueOf(l);
			    // System.out.println(value);
			}
		return value;
			
		}
	
	}
	


