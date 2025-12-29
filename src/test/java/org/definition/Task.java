package org.definition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.pojo.PojoJunean;
import org.pojo.ReusableClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Task extends ReusableClass {

@Given("chrome browser launch")
public void chromeBrowserLaunch() {
   browserConfiguration();
   launchBrowser("https://www.juneandvie.com/");
  maxWindow();

}

@When("pass values {string} and {string}")
public void passValuesAnd(String string, String string2) throws InterruptedException {
	 
	PojoJunean p=new PojoJunean();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 
	 driver.findElement(By.xpath("//input[@type='button']")).click();
	
	 
		
	  WebElement signIn = p.getSignIn();
	buttonClick(signIn);
	
	//Thread.sleep(3000l);
	driver.manage().deleteAllCookies();
	
	
	WebElement emailId = p.getEmailId();
	fillTextBox(emailId, string);
	
	WebElement password = p.getPassword();
	fillTextBox(password, string2);

	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.findElement(By.xpath("//button[text()='Reject Unnecessary Cookies']")).click();
	
	  WebElement signI = p.getSignIn();
		buttonClick(signI);
		
		
		//driver.manage().deleteAllCookies();
		
		 WebElement signIn1 = p.getSignIn();
			buttonClick(signIn1);
			
		Thread.sleep(5000);
	JavascriptExecutor j=(JavascriptExecutor)driver;
	WebElement top= driver.findElement(By.xpath("//div[contains(text(),'By signing in, you agree to Our ')]"));
	j.executeScript("arguments[0].scrollIntoView[false]", top);
	
//	WebElement signInButton = p.getSignInButton();
//	buttonClick(signInButton);

}

@Then("close browsers")
public void closeBrowsers() {
   System.out.println("demo");
}




}
