package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestNGTestRunner {
	
	@CucumberOptions (
			features = {"Features"},
			glue = {"StepDefs"}//,
			//tags = {"@Amazonquit", "@Amazonsearch"}
			)
	public class TestRunner extends AbstractTestNGCucumberTests{

	}

}
