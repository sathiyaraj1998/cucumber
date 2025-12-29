package org.definition;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.pojo.PojoJunean;
import org.pojo.ReusableClass;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class List1D extends ReusableClass{
	@Given("To user launch browser and pass junean url")
	public void toUserLaunchBrowserAndPassJuneanUrl() {
	browserConfiguration();
	launchBrowser("https://www.juneandvie.com/");
	maxWindow();
		
	}

	@When("to user enter product search box")
	public void toUserEnterProductSearchBox(io.cucumber.datatable.DataTable data) {
		PojoJunean p=new PojoJunean();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		   driver.findElement(By.xpath("//input[@type='button']")).click();
		 List<Map<String,String>> l = data.asMaps();
		   String value = l.get(1).get("shirt");
	     WebElement searchBox = p.getSearchBox();
	      fillTextBox(searchBox, value);
	      searchBox.click();
	      
	}

	@Then("To user click search box button")
	public void toUserClickSearchBoxButton() {
		
		PojoJunean p=new PojoJunean();
		
		Assert.assertTrue(false);
		WebElement clickSearch = p.getClickSearch();
     	buttonClick(clickSearch);

	}



}
