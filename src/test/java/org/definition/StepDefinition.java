package org.definition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.hssf.util.HSSFColor.BROWN;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.PojoJunean;
import org.pojo.ReusableClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends ReusableClass{
	@Given("To launch the browser and pass valid url")
	public void toLaunchTheBrowserAndPassValidUrl() {
	   browserConfiguration();
	   launchBrowser("https://www.juneandvie.com/");
	   maxWindow();
	}

	@When("To user enter valid username and valid password")
	public void toUserEnterValidUsernameAndValidPassword() throws AWTException, InterruptedException, IOException {
	   PojoJunean p=new PojoJunean();
	   
//	   Thread.sleep(3000);
//	   Robot r = new Robot();
//	   
//	   r.keyPress(KeyEvent.VK_ESCAPE);
//	   r.keyRelease(KeyEvent.VK_ESCAPE);
//	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   driver.findElement(By.xpath("//input[@type='button']")).click();
	   WebElement signIn = p.getSignIn();
	   buttonClick(signIn);
	   WebElement emailId = p.getEmailId();
	   String excelData = excelData("C:\\Users\\user\\eclipse-workspace\\CucumberProject\\excel\\cucumber.xlsx", "Sheet1", 0, 0);
	   fillTextBox(emailId, excelData);
	   
	   WebElement password = p.getPassword();
	   String excelData2 = excelData("C:\\Users\\user\\eclipse-workspace\\CucumberProject\\excel\\cucumber.xlsx", "Sheet1", 1, 0);
	   fillTextBox(password, excelData2);

	   
	}

	@Then("to click login")
	public void toClickLogin() {
	   PojoJunean p=new PojoJunean();
	   //WebElement checkBox = p.getCheckBox();
	  // buttonClick(checkBox);
	   WebElement signIn = p.getSignIn();
	   buttonClick(signIn);
	   
		
	}


}
