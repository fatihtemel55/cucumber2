package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class MvnHomePage {

	private WebDriver driver;
	
	public MvnHomePage() {
		driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "query")
	public WebElement searchBox;
	
	@FindBy(xpath = "(//div[@class='im-header']//a)[1]")
	public WebElement firstResult;
}
