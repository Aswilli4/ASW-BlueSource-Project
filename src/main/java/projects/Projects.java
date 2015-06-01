package projects;

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import org.openqa.selenium.WebDriver; // Import all Necessary Packages to be used in this Class

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public class Projects {
	// Variable Declaration
	WebDriver driver; // Declare a variable of type WebDriver
	// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	// Set up Object Repository
	@FindBy(className = "container")
	WebElement containerProjects;

	// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	// Business Process
	public Projects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // This initElements method will
												// create all WebElements

	}

	public boolean ProjectsPageLoaded() {
		return containerProjects.isDisplayed();
	}
}
