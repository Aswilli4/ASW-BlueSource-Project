/*******************************************************************************************************************************************************************************************************************
Script Name:			DataProviderWithExcel_001
Author:		Andy Williams
Created Date:		05/18/15
Purpose:		Checks multiple User names and passwords to ensure access.
Prerequisites:			@BeforeMethod will Trigger the Login of each user name and password
‘Change history:	n/a
 *******************************************************************************************************************************************************************************************************************/
package loginPage; //Package Used in this Class

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.concurrent.TimeUnit; // Import all Necessary Packages to be used in this Class

import mainPage.MainPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import toolsBS.Login;
import dataSheet.LoginDataSheet;

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public class DataProviderWithExcel_001 {
	// Variable Declaration
	WebDriver driver; // Declare a variable of type WebDriver
	Login objLogin; // Declare a variable of type Login
	MainPage objMainPage; // Declare a variable of type MainPage

	// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	// Business Process
	@BeforeMethod
	// The annotated method will be run before each test method.
	@Parameters({ "browser", "getURL" })
	public void setup(String browser, String getURL) throws Exception { // Creates
																		// a
																		// Method
																		// with
																		// assigned
																		// String
																		// Parameters
																		// from
																		// TestNG
																		// XML
																		// for
																		// Initial
																		// Setup
		if (browser.equalsIgnoreCase("firefox")) { // Compares this String to
													// another String, ignoring
													// case considerations. Two
													// strings are considered
													// equal ignoring case if
													// they are of the same
													// length and corresponding
													// characters in the two
													// strings are equal
													// ignoring case.
			driver = new FirefoxDriver(); // Construct a new object and store a
											// reference to it in the variable.
		}

		else if (browser.equalsIgnoreCase("chrome")) { // Compares this String
														// to another String,
														// ignoring case
														// considerations. Two
														// strings are
														// considered equal
														// ignoring case if they
														// are of the same
														// length and
														// corresponding
														// characters in the two
														// strings are equal
														// ignoring case.
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\andy.williams\\Desktop\\chromedriver.exe"); // Set
																			// to
																			// specified
																			// Browser
			driver = new ChromeDriver(); // Construct a new object and store a
											// reference to it in the variable.
		} else if (browser.equalsIgnoreCase("InternetExplorer")) { // Compares
																	// this
																	// String to
																	// another
																	// String,
																	// ignoring
																	// case
																	// considerations.
																	// Two
																	// strings
																	// are
																	// considered
																	// equal
																	// ignoring
																	// case if
																	// they are
																	// of the
																	// same
																	// length
																	// and
																	// corresponding
																	// characters
																	// in the
																	// two
																	// strings
																	// are equal
																	// ignoring
																	// case.
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\andy.williams\\Desktop\\IEDriverServer.exe"); // Set
																				// to
																				// specified
																				// Browser
			driver = new InternetExplorerDriver(); // Construct a new object and
													// store a reference to it
													// in the variable.

		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Set
																			// Specified
																			// Time
																			// Before
																			// Timeout

		driver.get(getURL); // Call desired parameter to initiate the URL
							// Selection
		driver.manage().window().maximize(); // Maximize WebDriver window
	}

	@Test(dataProvider = "Authentication")
	// During Test Calling the "Authentification" Dataprovider Below
	public void f(String strUserName, String strPassword) {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		objLogin = new Login(driver); // Construct a new object and store a
										// reference to it in the variable.
		Assert.assertTrue(objLogin.LoginPageLoaded(),
				"Login Page doesn't Display");
		Reporter.log("Success, the login Page Loaded<br>");
		objLogin.loginToBlueSource(strUserName, strPassword);

		objMainPage = new MainPage(driver); // Construct a new object and store
											// a reference to it in the
											// variable.
		Assert.assertTrue(objMainPage.MainPageLoaded(),
				"Main Page doesn't Display"); // Assert main page loads
		Reporter.log("Success, the main Page Loaded"); // Report

	}

	// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@AfterMethod
	// The annotated method will be run after each test method.
	public void closeBrowser() {

		driver.getCurrentUrl();
		driver.quit(); // browser closes after each test
	}

	// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@DataProvider
	// data provider call "Authentification" for this test method list above
	public Object[][] Authentication() throws Exception {

		Object[][] testObjArray = LoginDataSheet.getTableArray(
				"C:\\Users\\andy.williams\\Desktop\\BlueSourceLogin.xlsx", // Calling
																			// the
																			// Stored
																			// object
																			// in
																			// the
																			// Specified
																			// file
																			// path
				"Sheet1");

		return (testObjArray);

	}

}
