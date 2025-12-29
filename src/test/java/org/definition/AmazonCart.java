package org.definition;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.ReusableClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonCart extends ReusableClass{

@Given("launch amazon url")
public void launchAmazonUrl() {
   browserConfiguration();
   launchBrowser("https://www.amazon.com/");
   maxWindow();
   
   System.out.println("2nd update");
}

@When("search product and add to cart product")
public void searchProductAndAddToCartProduct() {
   driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
   WebElement phone = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
   fillTextBox(phone, "moto edge 50 ultra");
   phone.submit();
   
   driver.findElement(By.xpath("//span[text()='Edge 2025 | Unlocked | Made for US 8/256GB | 50MP Camera | Pantone Deep Forest']")).click();
   
   WebElement addcart = driver.findElement(By.id("submit.add-to-cart"));
   buttonClick(addcart);
   
   String parent = driver.getWindowHandle();
   Set<String> allwindows = driver.getWindowHandles();
for (String each : allwindows) {
	if (!parent.equals(each)) {
		driver.switchTo().window(each);
	}
}
   
}

@Then("close the amazon browser")
public void closeTheAmazonBrowser() {
  
	System.out.println("Master");
}

}
