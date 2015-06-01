package toolsBS;

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import org.openqa.selenium.WebDriver;// Import all Necessary Packages to be used in this Class
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public class Logout {
	// Variable Declaration
	WebDriver driver; // Declare a variable of type WebDriver
	// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	// Set up Object Repository

	@FindBy(linkText = "Logout")
	WebElement Logout;

	// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	// Business Process
	public Logout(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}

	public void LogoutClick() {
		Logout.click();
	}

}
