package steps;

import java.util.List;
import java.util.Map;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.FacebookPost;
import models.User;
import pages.ShoppingAccountCreationPage;
import pages.ShoppingHomePage;
import utilities.Config;

public class ShoppingAccountCreation_steps {
	
	ShoppingHomePage shp = new ShoppingHomePage();
	ShoppingAccountCreationPage sacp = new ShoppingAccountCreationPage();
	
	@Then("user clicks on sign-in button")
	public void user_clicks_on_sign_in_button() {
	    shp.signInBtn.click();
	}

	@Then("user sends {string} and clicks create an account button")
	public void user_sends_and_clicks_create_an_account_button(String emailAddress) {
		Random rand = new Random();
		int rNum = rand.nextInt(100000);
		emailAddress = rNum + emailAddress;
	    shp.emailField.sendKeys(emailAddress);
	    shp.createAccountBtn.click();
	}

	@Then("user chooses title {string}")
	public void user_chooses_title(String title) {
	    if(title.equalsIgnoreCase("mr")) {
	    		sacp.mrRadioBtn.click();
	    }
	    else {
	    		sacp.mrsRadioBtn.click();
	    }
	}

	@Then("user completes first name {string}")
	public void user_completes_first_name(String firstNameTxt) {
		System.out.println("initial name: " + firstNameTxt);
		firstNameTxt = Config.getValue("name");
	    sacp.firstName.sendKeys(firstNameTxt);
	}

	@Then("user completes last name {string}")
	public void user_completes_last_name(String lastNameTxt) {
		sacp.lastName.sendKeys(lastNameTxt);
	}

	@Then("user completes password {string}")
	public void user_completes_password(String passTxt) {
	    sacp.password.sendKeys(passTxt);
	}

	@Then("user completes address {string}")
	public void user_completes_address(String addressTxt) {
	    sacp.address.sendKeys(addressTxt);
	}

	@Then("user completes city {string}")
	public void user_completes_city(String cityTxt) {
	    sacp.city.sendKeys(cityTxt);
	}

	@Then("user completes state {string}")
	public void user_completes_state(String stateTxt) {
	    Select stateDropdown = new Select(sacp.state);
	    stateDropdown.selectByVisibleText(stateTxt);
	}

	@Then("user completes zip {string}")
	public void user_completes_zip(String zipTxt) {
	    sacp.zip.sendKeys(zipTxt);
	}

	@Then("user completes mobile number {string}")
	public void user_completes_mobile_number(String mobileNum) {
	   sacp.mobileNumber.sendKeys(mobileNum);
	}

	@Then("user clicks register button")
	public void user_clicks_register_button() {
	    sacp.registerBtn.click();
	}

	@Then("user verifies {string}")
	public void user_verifies(String message) {
	    String actualMessage = sacp.accountCreationMessage.getText();
	    Assert.assertEquals("Account Creation message verification",  message, actualMessage);
	}
	
	@Then("user completes all user info:")
	public void user_completes_all_user_info(Map<String,String> userInfo) {
	    System.out.println(userInfo);
	    userInfo.get("city");
	    if(userInfo.get("title").equalsIgnoreCase("mr")) {
    		sacp.mrRadioBtn.click();
    }
    else {
    		sacp.mrsRadioBtn.click();
    }
	    sacp.firstName.sendKeys(userInfo.get("firstName"));
	    sacp.lastName.sendKeys(userInfo.get("lastName"));
	    sacp.address.sendKeys(userInfo.get("address"));
	    sacp.password.sendKeys(userInfo.get("password"));
	    sacp.city.sendKeys(userInfo.get("city"));
	    Select stateDropdown = new Select(sacp.state);
	    stateDropdown.selectByVisibleText(userInfo.get("state"));
	    sacp.zip.sendKeys(userInfo.get("zip"));
	    sacp.mobileNumber.sendKeys(userInfo.get("mNumber"));
	}
	
	
}













