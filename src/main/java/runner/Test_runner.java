package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(
		features = "src/main/java/feature", glue ={"stepDefinition"},tags = {"@test"})

public class Test_runner extends AbstractTestNGCucumberTests{
	
	

}
