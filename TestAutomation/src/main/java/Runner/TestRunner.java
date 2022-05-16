package Runner;

import org.testng.annotations.Test;

import Engine.TestEngine;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(
		monochrome = true,
		format = {"pretty", "html:target/cucumber-html-report"},
		strict = true,
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Report/Report.html"},
		features="src/main/java/Features",
		glue="Step"
		)

public class TestRunner {

	@Test
	public void runCukes() throws Exception {      
		new TestNGCucumberRunner(getClass()).runCukes();
	}
}
