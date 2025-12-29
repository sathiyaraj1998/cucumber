package org.definition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.pojo.ReusableClass;

import cucumber.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends ReusableClass {

	@Before(order=1)
	public void beforedate1() {
		dateAndTime();
	System.out.println("before=1 order=1");
	}
	@Before(order=2)
	public void beforedate2() {
		dateAndTime();
		System.out.println("before=2 order=2");
	}
	
	@After(order=2)
	public void afterdate1(Scenario s) {
    if (s.isFailed()) {
		TakesScreenshot t=(TakesScreenshot)driver;
		byte[] src = t.getScreenshotAs(OutputType.BYTES);
		s.embed(src, "image/png");
	}  
	
	}

	@After(order=1)
	public void afterdate2() {
      dateAndTime();

		System.out.println("before=2 order=1");
		
		System.out.println("2nd commit master");
		System.out.println("2nd commit to sathya");
		System.out.println("3rd commit sai");
		
}
}