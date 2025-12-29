package org.run;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Demo\\ListOne.feature",glue = "org.definition",
snippets = SnippetType.CAMELCASE,strict = false,dryRun =false,
 plugin= {"json:src\\test\\resources\\JsonReport\\json1.json",
		 "rerun:src\\test\\resources\\Rerun\\rerun.txt"})

public class ReRun {

     @AfterClass
     public static void report() {
    	 
    	 JvmGenerateReport.generateReport("src\\test\\resources\\JsonReport\\json1.json");
    	 
     }


}
