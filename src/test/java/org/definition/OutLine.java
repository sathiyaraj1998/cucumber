package org.definition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.PojoJunean;
import org.pojo.ReusableClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OutLine extends ReusableClass{
	@Given("To launch chrome browser")
	public void toLaunchChromeBrowser() {
		browserConfiguration();
		   
	}

	@When("To user enter valid url")
	public void toUserEnterValidUrl() {
		 launchBrowser("https://www.juneandvie.com/");
		   maxWindow();   
	
	}

	@When("To user enters{string}and {string}")
	public void toUserEntersAnd(String email, String pass) {
		PojoJunean p=new PojoJunean();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		   driver.findElement(By.xpath("//input[@type='button']")).click();
		   WebElement signIn = p.getSignIn();
		   buttonClick(signIn);
		   
		   WebElement emailId = p.getEmailId();
		   fillTextBox(emailId, email);
		   WebElement password = p.getPassword();
		   fillTextBox(password, pass);
	}

	@Then("to user click login button")
	public void toUserClickLoginButton() {
		 PojoJunean p=new PojoJunean();
		   WebElement signIn = p.getSignIn();
		   buttonClick(signIn);
	
	}



}
