package calendar;

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver; // Import all Necessary Packages to be used in this Class
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public class Calendar {
	// Variable Declaration
	WebDriver driver; // Declare a variable of type WebDriver
	// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	// Set up Object Repository

	@FindBy(className = "container")
	WebElement containerCalendar;

	// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	// Business Process
	public Calendar(WebDriver driver) { // Method
		this.driver = driver;
		PageFactory.initElements(driver, this); // This initElements method will
												// create all WebElements

	}

	public boolean CalendarPageLoaded()  {// Method
		
		return containerCalendar.isDisplayed();
	}

}
