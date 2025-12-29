package org.definition;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.pojo.InstaPojo;
import org.pojo.ReusableClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InstagramTag extends ReusableClass{
	@Given("to launch url for insta")
	public void toLaunchUrlForInsta() {
		browserConfiguration();
		  launchBrowser("https://www.instagram.com/");
		  maxWindow();

	}

	@When("data driven pass values for insta")
	public void dataDrivenPassValuesForInsta() throws IOException {
		InstaPojo p=new InstaPojo();
		WebElement email = p.getEmailTextbox();
		String IdValues = excelData("C:\\Users\\user\\eclipse-workspace\\CucumberProject\\excel\\cucumber.xlsx", "Sheet1", 0, 0);
		fillTextBox(email, IdValues);
		
		WebElement passwordTextBox = p.getPasswordTextBox();
		String pass = excelData("C:\\Users\\user\\eclipse-workspace\\CucumberProject\\excel\\cucumber.xlsx", "Sheet1", 1, 0);
		fillTextBox(passwordTextBox, pass);
		
		WebElement loginbutton = p.getLoginbutton();
		buttonClick(loginbutton);
		

	}

	@Then("close the browser for insta")
	public void closeTheBrowserForInsta() {
	    driver.close();
		
		
	}


}
