package org.run;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Demo\\FbAndInsta.feature",
               glue = "org.definition", 
               snippets = SnippetType.CAMELCASE,
               dryRun = false,
               tags = {"@sanity or @regret"},
               plugin = "json:src\\test\\resources\\tagsjson\\tag.json"
                )
public class FbAndInstaRunner {
	   
	   @AfterClass
	   public static void reporttag() {
       TagsJvm.tagsReport("src\\test\\resources\\tagsjson\\tag.json");
	}

}
