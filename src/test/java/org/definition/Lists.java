package org.definition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.PojoJunean;
import org.pojo.ReusableClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Lists extends ReusableClass{

@Given("To launch valid url")
public void toLaunchValidUrl() {
   browserConfiguration();
   launchBrowser("https://www.juneandvie.com/");
   maxWindow();
}

@When("pass values")
public void passValues(io.cucumber.datatable.DataTable a) {
	PojoJunean p=new PojoJunean();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   driver.findElement(By.xpath("//input[@type='button']")).click();
      List<List<String>> l = a.asLists();
      String usernmae = l.get(1).get(1);
      String pass= l.get(2).get(2);
     WebElement signIn = p.getSignIn();
     buttonClick(signIn);
     WebElement email = p.getEmailId();
     fillTextBox(email, usernmae);
     WebElement password= p.getPassword();
     fillTextBox(password, pass);
     
}

@Then("to click")
public void toClick() {
  closeBrowser();
}


}
