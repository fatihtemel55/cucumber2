package steps;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ShoppingHomePage;
import utilities.Config;
import utilities.Driver;

public class ShppingDressTypes_steps {
	
	ShoppingHomePage shp = new ShoppingHomePage();

	@Given("user goes to shopping homepage")
	public void user_goes_to_shopping_homepage() {
		String url = Config.getValue("shoppingUrl");
	    Driver.getDriver().get(url);
	}

	@Given("user hovers over on Dresses")
	public void user_hovers_over_on_Dresses() {
	    Actions action = new Actions(Driver.getDriver());
	    action.moveToElement(shp.dressesLink).perform();
	}

	@When("user clicks on Casual Dresses")
	public void user_clicks_on_Casual_Dresses() {
	    shp.casualDressesLink.click();
	}

	@Then("page should display {string} header")
	public void page_should_display_header(String expectedText) {
	    String actualText = shp.headerText.getText();
	    Assert.assertEquals("Shopping casual dresses verificatiopn: ", expectedText, actualText);
	}
	
	@When("user clicks on Summer Dresses")
	public void user_clicks_on_Summer_Dresses() {
		shp.summerDressesLink.click();
	}
}











