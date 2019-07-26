package runner;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(
		format = {"pretty","html:report/html","json:report/json/cucumber.json"},
		tags={"@SIT`"},
		features = "src/main/java/features",
		glue={"stepDefinitions"}
 )

public class TestRunner extends AbstractTestNGCucumberTests{

	
}
