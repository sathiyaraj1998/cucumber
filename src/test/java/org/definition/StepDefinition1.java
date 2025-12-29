package org.definition;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.PojoJunean;
import org.pojo.ReusableClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition1 extends ReusableClass{
	
	@When("To user enter invalid username and invalid password")
	public void toUserEnterInvalidUsernameAndInvalidPassword() throws IOException {
		PojoJunean p=new PojoJunean();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		   driver.findElement(By.xpath("//input[@type='button']")).click();
		   WebElement signIn = p.getSignIn();
		   buttonClick(signIn);
		   
		   WebElement emailId = p.getEmailId();
		   String excelData = excelData("C:\\Users\\user\\eclipse-workspace\\CucumberProject\\excel\\cucumber.xlsx", "Sheet1", 2, 0);
		   fillTextBox(emailId, excelData);
		   
		   WebElement password = p.getPassword();
		   String excelData2 = excelData("C:\\Users\\user\\eclipse-workspace\\CucumberProject\\excel\\cucumber.xlsx", "Sheet1", 2, 0);
		   fillTextBox(password, excelData2);
	
	}


	
	
	@When("to click login button")
	public void toClickLoginButton() {
		 PojoJunean p=new PojoJunean();
	   WebElement checkBox = p.getCheckBox();
		   buttonClick(checkBox);
		   WebElement signIn = p.getSignIn();
		   buttonClick(signIn);
		   
	
	}

	@Then("to user quit browser")
	public void toUserQuitBrowser() {
   PojoJunean p=new PojoJunean();
   p.Quit();
	
	}


}
