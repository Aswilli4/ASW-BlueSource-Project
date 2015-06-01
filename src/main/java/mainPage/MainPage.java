package mainPage;

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import org.openqa.selenium.WebDriver;// Import all Necessary Packages to be used in this Class
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public class MainPage {
	// Variable Declaration
	WebDriver driver; // Declare a variable of type WebDriver
	// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	// Set up Object Repository
	@FindBy(xpath = ".//*[@id='all-content']/h1")
	WebElement txtWelcome;

	@FindBy(xpath = ".//*[@id='all-content']/div[1]/h5")
	WebElement popUpMainPage;

	// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	// Business Process
	public MainPage(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}

	public boolean MainPageLoaded() {
		return this.txtWelcome.isDisplayed();
	}

	public boolean PopUpAlertLoaded() {
		return this.popUpMainPage.isDisplayed();
	}
}
