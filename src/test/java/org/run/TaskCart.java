package org.run;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Demo\\InstaAndAmazon.feature",
				glue = "org.definition",
				snippets = SnippetType.CAMELCASE,
				dryRun =false,
				plugin = {"json:src\\test\\resources\\Amazjson\\amazon.json"})
public class TaskCart {
	
	
	 @org.junit.AfterClass
     public static void jvmreport() {
    	 
    	 AmazonJvm.generateReport("src\\test\\resources\\Amazjson\\amazon.json");
    	 
     }
}
