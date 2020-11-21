package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "./src/test/resources/feature",
	glue = {"steps"},
	dryRun  = false,
	tags = {"@UsedSearch_cars"},
	plugin = {"pretty", "html:target/cucumber-reports"},
	monochrome = true
	
)

public class testRunner {

}
