package steps;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.MvnHomePage;
import utilities.Config;
import utilities.Driver;

public class MvnSearch_steps {
	
	MvnHomePage mvn = new MvnHomePage();
	
	@Given("user goes to mvnrepository application")
	public void user_goes_to_mvnrepository_application() {
	    Driver.getDriver().get(Config.getValue("mvnurl"));
	}

	@When("user searches for cucumber java")
	public void user_searches_for_cucumber_java() {
	    mvn.searchBox.sendKeys(Config.getValue("searchValue") + Keys.ENTER);
	}

	@Then("user should get Cucumber JVM: Java in first result")
	public void user_should_get_Cucumber_JVM_Java_in_first_result() {
	   Assert.assertEquals(Config.getValue("expectedValue"), mvn.firstResult.getText());
	}
	
	@When("user searches for {string}")
	public void user_searches_for(String searchValue) {
		mvn.searchBox.sendKeys(searchValue + Keys.ENTER);
	}

	@Then("user should get {string} in first result")
	public void user_should_get_in_first_result(String expectedValue) {
		Assert.assertEquals(expectedValue, mvn.firstResult.getText());
	}


	
	
	
	
	
	
	
	
	
	
}
