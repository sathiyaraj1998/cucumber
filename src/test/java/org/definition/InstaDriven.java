package org.definition;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.pojo.InstaPojo;
import org.pojo.ReusableClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InstaDriven extends ReusableClass {

@Given("launch browser to insta url")
public void launchBrowserToInstaUrl() {
   browserConfiguration();
   launchBrowser("https://www.instagram.com/");
   maxWindow();
}

@When("Insta login values to data driven")
public void instaLoginValuesToDataDriven() throws IOException {
  InstaPojo i=new InstaPojo();
  WebElement emailTextbox = i.getEmailTextbox();
  String mailId = excelData("C:\\Users\\user\\eclipse-workspace\\CucumberProject\\excel\\cucumber.xlsx", "Sheet1", 0, 0);
  fillTextBox(emailTextbox, mailId);
  
  WebElement passwordTextBox = i.getPasswordTextBox();
  String password = excelData("C:\\Users\\user\\eclipse-workspace\\CucumberProject\\excel\\cucumber.xlsx", "Sheet1", 2, 0);
  fillTextBox(passwordTextBox, password);
  
  WebElement loginbutton = i.getLoginbutton();
  buttonClick(loginbutton);
}

@Then("close the insta browser")
public void closeTheInstaBrowser() {
   System.out.println("success");
	
}

}
