package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty",
		        "html:target/cucumber-report",
		        "json:target/cucumber.json"
},
		features = "src/test/resources/features",
		glue = "steps",
		tags = "@priceOrder",
		dryRun = false
		)

public class CukesRunner {

	
}
