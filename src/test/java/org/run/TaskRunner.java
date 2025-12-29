package org.run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Demo\\Task.feature" ,glue = "org.definition",
 snippets = SnippetType.CAMELCASE, dryRun = false)
public class TaskRunner {

	
}
