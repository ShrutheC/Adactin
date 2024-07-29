package runnerclass;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//features",
					glue="stepdefinition")
public class TestRunner {
	
	@BeforeClass
	public static void setUp() {
		
		
	}
	
	@AfterClass
	public static void tearDown() {
		
		
	}

}
