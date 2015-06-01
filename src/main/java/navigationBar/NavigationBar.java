package navigationBar;

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import org.openqa.selenium.WebDriver;// Import all Necessary Packages to be used in this Class
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public class NavigationBar {
	// Variable Declaration
	WebDriver driver; // Declare a variable of type WebDriver
	// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	// Set up Object Repository
	@FindBy(className = "brand")
	WebElement linkLogo;

	@FindBy(linkText = "Calendar")
	WebElement linkCalendar;

	@FindBy(linkText = "Directory")
	WebElement linkDirectory;

	@FindBy(linkText = "Projects")
	WebElement linkProjects;

	@FindBy(linkText = "Employees")
	WebElement linkEmployees;

	// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	// Business Process
	public NavigationBar(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}

	public void CalendarClicks() {
		linkCalendar.click();
	}

	public void DirectoryClicks() {
		linkDirectory.click();
	}

	public void ProjectsClicks() {
		linkProjects.click();
	}

	public void EmployeesClicks() {
		linkEmployees.click();
	}

	public void LogoClicks() {
		linkLogo.click();
	}

}
