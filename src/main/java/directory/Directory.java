package directory;

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import org.openqa.selenium.WebDriver;// Import all Necessary Packages to be used in this Class

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public class Directory {
	// Variable Declaration
	WebDriver driver; // Declare a variable of type WebDriver
	// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	// Set up Object Repository
	@FindBy(className = "container")
	WebElement containerDirectory;

	@FindBy(xpath = ".//*[@id='resource-content']/div[1]/table/tbody/tr[1]/th[1]/a")
	WebElement linkFirstName;

	@FindBy(xpath = ".//*[@id='resource-content']/div[1]/table/tbody/tr[1]/th[1]/span/span[1]")
	WebElement glyphiconZtoA;

	@FindBy(xpath = ".//*[@id='resource-content']/div[1]/table/tbody/tr[1]/th[1]/span/span[2]")
	WebElement glyphiconAtoZ;

	@FindBy(xpath = ".//*[@id='resource-content']/div[1]/table/tbody/tr[1]/th[2]/a")
	WebElement linkLastName;

	@FindBy(xpath = ".//*[@id='resource-content']/div[1]/table/tbody/tr[1]/th[2]/span/span[1]")
	WebElement glyphiconLNZtoA;

	@FindBy(xpath = ".//*[@id='resource-content']/div[1]/table/tbody/tr[1]/th[2]/span/span[2]")
	WebElement glyphiconLNAtoZ;

	@FindBy(xpath = ".//*[@id='resource-content']/div[1]/table/tbody/tr[1]/th[3]/a")
	WebElement linkSupervisor;

	@FindBy(xpath = ".//*[@id='resource-content']/div[1]/table/tbody/tr[1]/th[3]/span/span[1]")
	WebElement glyphiconSVZtoA;

	@FindBy(xpath = ".//*[@id='resource-content']/div[1]/table/tbody/tr[1]/th[3]/span/span[2]")
	WebElement glyphiconSVAtoZ;

	@FindBy(xpath = ".//*[@id='resource-content']/div[1]/table/tbody/tr[1]/th[4]/a")
	WebElement linkDept;

	@FindBy(xpath = ".//*[@id='resource-content']/div[1]/table/tbody/tr[1]/th[4]/span/span[1]")
	WebElement glyphiconDeptZtoA;

	@FindBy(xpath = ".//*[@id='resource-content']/div[1]/table/tbody/tr[1]/th[4]/span/span[2]")
	WebElement glyphiconDeptAtoZ;

	@FindBy(xpath = ".//*[@id='resource-content']/div[1]/table/tbody/tr[1]/th[5]/a")
	WebElement linkOfficePhone;

	@FindBy(xpath = ".//*[@id='resource-content']/div[1]/table/tbody/tr[1]/th[5]/span/span[1]")
	WebElement glyphiconOPZtoA;

	@FindBy(xpath = ".//*[@id='resource-content']/div[1]/table/tbody/tr[1]/th[5]/span/span[2]")
	WebElement glyphiconOPAtoZ;

	@FindBy(xpath = ".//*[@id='resource-content']/div[1]/table/tbody/tr[1]/th[6]/a")
	WebElement linkCellPhone;

	@FindBy(xpath = ".//*[@id='resource-content']/div[1]/table/tbody/tr[1]/th[6]/span/span[1]")
	WebElement glyphiconCPZtoA;

	@FindBy(xpath = ".//*[@id='resource-content']/div[1]/table/tbody/tr[1]/th[6]/span/span[2]")
	WebElement glyphiconCPAtoZ;

	@FindBy(xpath = ".//*[@id='resource-content']/div[1]/table/tbody/tr[1]/th[7]/a")
	WebElement linkIMName;

	@FindBy(xpath = ".//*[@id='resource-content']/div[1]/table/tbody/tr[1]/th[7]/span/span[1]")
	WebElement glyphiconIMNameZtoA;

	@FindBy(xpath = ".//*[@id='resource-content']/div[1]/table/tbody/tr[1]/th[7]/span/span[2]")
	WebElement glyphiconIMNameAtoZ;

	// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	// Business Process
	public Directory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // This initElements method will
												// create all WebElements

	}

	public boolean DirectoryPageLoaded() { // Method
		return containerDirectory.isDisplayed();
	}

	public boolean FirstNameSort() throws Exception { // Method
		Thread.sleep(5000); // Pause the current Thread for number of Specified
							// Milliseconds
		linkFirstName.click();
		linkFirstName.click();
		if (glyphiconZtoA.isDisplayed()) { // Set If Else Statement to handle the
											// sorting of the column
			Reporter.log("Column First Name is sorted from Z to A");
		} else {
			Reporter.log("Column First Name is sorted from A to Z");
		}
		return true;
	}

	public boolean LastNameSort() throws Exception { // Method
		Thread.sleep(5000); // Pause the current Thread for number of Specified
							// Milliseconds
		linkLastName.click();
		if (glyphiconLNZtoA.isDisplayed()) { // Set If Else Statement to handle
												// the sorting of the column
			Reporter.log("Column Last Name is sorted from Z to A");
		} else {
			Reporter.log("Column Last Name is sorted from A to Z");
		}
		return true;
	}

	public boolean SupervisorSort() throws Exception { // Method
		Thread.sleep(5000); // Pause the current Thread for number of Specified
							// Milliseconds
		linkSupervisor.click();
		if (glyphiconSVZtoA.isDisplayed()) { // Set If Elase Statement to handle
												// the sorting of the column
			Reporter.log("Column Supervisor is sorted from Z to A");
		} else {
			Reporter.log("Column Supervisor is sorted from A to Z");
		}
		return true;
	}

	public boolean DeptSort() throws Exception { // Method
		Thread.sleep(5000); // Pause the current Thread for number of Specified
							// Milliseconds
		linkDept.click();
		if (glyphiconDeptZtoA.isDisplayed()) { // Set If Else Statement to handle
												// the sorting of the column
			Reporter.log("Column Department is sorted from Z to A");
		} else {
			Reporter.log("Column Department is sorted from A to Z");
		}
		return true;
	}

	public boolean OfficePhoneSort() throws Exception { // Method
		Thread.sleep(5000); // Pause the current Thread for number of Specified
							// Milliseconds
		linkOfficePhone.click();
		if (glyphiconOPZtoA.isDisplayed()) { // Set If Else Statement to handle
												// the sorting of the column
			Reporter.log("Column Office Phone is sorted from Z to A");
		} else {
			Reporter.log("Column Office Phone is sorted from A to Z");
		}
		return true;
	}

	public boolean CellPhoneSort() throws Exception { // Method
		Thread.sleep(5000); // Pause the current Thread for number of Specified
							// Milliseconds
		linkCellPhone.click();
		linkCellPhone.click();
		if (glyphiconCPZtoA.isDisplayed()) { // Set If Else Statement to handle
												// the sorting of the column
			Reporter.log("Column Cell Phone is sorted from Z to A");
		} else {
			Reporter.log("Column Cell Phone is sorted from A to Z");
		}
		return true;
	}

	public boolean IMNameSort() throws Exception { // Method
		Thread.sleep(5000); // Pause the current Thread for number of Specified
							// Milliseconds
		linkIMName.click();
		if (glyphiconIMNameZtoA.isDisplayed()) { // Set If Else Statement to
													// handle the sorting of the
													// column
			Reporter.log("Column IM Name is sorted from Z to A");
		} else {
			Reporter.log("Column IM Name is sorted from A to Z");
		}
		return true;
	}

}
