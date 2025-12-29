package org.definition;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.pojo.POMq1;
import org.pojo.ReusableClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FbTag extends ReusableClass{

@Given("launch url for fb")
public void launchUrlForFb() {
  browserConfiguration();
  launchBrowser("https://www.facebook.com/");
  maxWindow();

}

@When("data diven to pass values for fb")
public void dataDivenToPassValuesForFb() throws IOException {
    POMq1 p=new POMq1();
    WebElement emailTextbox = p.getEmailTextbox();
    String email = excelData("C:\\Users\\user\\eclipse-workspace\\CucumberProject\\excel\\cucumber.xlsx","Sheet1", 0, 0);
    fillTextBox(emailTextbox, email);
    
    WebElement passwordTextBox = p.getPasswordTextBox();
    String pass = excelData("C:\\Users\\user\\eclipse-workspace\\CucumberProject\\excel\\cucumber.xlsx","Sheet1", 2, 0);
    fillTextBox(passwordTextBox, pass);
    
    WebElement loginbutton = p.getLoginbutton();
    buttonClick(loginbutton);
}

@Then("close browser on fb")
public void closeBrowserOnFb() {
   driver.close();

}

	
	
}
