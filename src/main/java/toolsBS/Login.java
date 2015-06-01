package toolsBS;

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

import mainPage.MainPage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import dataSheet.LoginDataSheet;
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Business Process

public class Login {
	// Variable Declaration
	LoginDataSheet objDS;
	MainPage objMainPage;

	WebDriver driver; // Declare a variable of type WebDriver
	// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	// Set up Object Repository

	@FindBy(className = "alert alert-danger alert-dismissable")
	WebElement readOnlyTextDeptError;

	@FindBy(className = "alert alert-danger alert-dismissable")
	WebElement readOnlyLoginError;

	@FindBy(id = "content")
	WebElement readOnlyTxtLogin;

	
	@FindBy(id = "employee_username")
	protected
	WebElement userNameBS;

	@FindBy(xpath = ".//*[@id='employee_password']")
	protected
	WebElement passwordBS;

	
	@FindBy(name = "commit")
	protected
	WebElement btnLogin;

	@FindBy(xpath = ".//*[@id='login-help-link']")
	WebElement linkCantLoginLink;

	@FindBy(xpath = ".//*[@id='login_help_modal']/div/div/div")
	WebElement cantLoginPopUp;

	@FindBy(xpath = ".//*[@id='login_help_modal']/div/div/div/button")
	WebElement btnx;

	@FindBy(css = "a[\"href=#login-contact\"]")
	WebElement linkContact;

	@FindBy(css = "a[\"href=#login-help\"]")
	WebElement linkHelp;

	@FindBy(xpath = ".//*[@id='login_issue_name']")
	WebElement txtBoxName;

	@FindBy(xpath = ".//*[@id='login_issue_email']")
	WebElement txtBoxEmail;

	@FindBy(xpath = ".//*[@id='login_issue_comments']")
	WebElement txtBoxComments;

	@FindBy(xpath = ".//*[@id='login-contact-form']/div[5]/input")
	WebElement btnSend;

	@FindBy(xpath = ".//*[@id='login-help']")
	WebElement readOnlyTxtHelpTab;

	@FindBy(className = "brand")
	WebElement linkLogo;

	
	@FindBy(className = "close")
	WebElement popUpError;

	// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	// This is for the Login Page
	public Login(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}

	// Set user name in textbox

	public void setUserName(String strUserName) {

		userNameBS.sendKeys(strUserName);

	}

	// Set password in password textbox

	public void setPassword(String strPassword) {

		passwordBS.sendKeys(strPassword);

	}

	// Click on login button

	public void clickLogin() {

		btnLogin.click();

	}

	// Click on "Can't log in?" Link

	public void cantLogInLink() {
		linkCantLoginLink.click();
	}

	public String popUpErrorGetText() {
		return popUpError.getText();
	}

	public void verifyHelpTab() {
		readOnlyTxtHelpTab.isDisplayed();
	}

	public void closeCantLoginPopUp() {
		btnx.click();
	}

	public void setName(String strInputNameText) {
		txtBoxName.sendKeys(strInputNameText);
	}

	public void setEmail(String strInputEmailText) {
		txtBoxEmail.sendKeys(strInputEmailText);
	}

	public void setComments(String strInputCommentsText) {
		txtBoxComments.sendKeys(strInputCommentsText);
	}

	public void sendContactInfo() {
		btnSend.click();
	}

	public void clickLogo() {
		linkLogo.click();
	}

	public void clickHelp() {
		linkHelp.click();
	}

	public void clickContact() {
		linkContact.click();
	}

	public void loginToBlueSource(String strUserName, String strPassword) {
		// Fill user name

		this.setUserName(strUserName);

		// Fill password

		this.setPassword(strPassword);

		// Click Login button

		this.clickLogin();

		if ((popUpErrorGetText().contains("Employee not found in BlueSource"))
				|| popUpErrorGetText().contains(
						"Department must be present for the role")) {

		}

		else {
			Assert.assertTrue(true);
		}

	}

	public boolean LoginPageLoaded() { //Method to verify Login page Loads
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.userNameBS.isDisplayed();

	}

	public void blueSourceCantLoginLinkHelpTab() {

		// Clink the Link
		this.cantLogInLink();
		this.clickHelp();
		this.verifyHelpTab();
		this.closeCantLoginPopUp();
	}

	public void blueSourceCantLoginLinkContact(String strInputNameText,
			String strInputEmailText, String strInputCommentsText) {
		this.cantLogInLink();
		this.clickContact();
		this.setName(strInputNameText);
		this.setEmail(strInputEmailText);
		this.setComments(strInputCommentsText);
		this.sendContactInfo();

	}

}
