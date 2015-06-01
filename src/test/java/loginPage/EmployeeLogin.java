/*******************************************************************************************************************************************************************************************************************
Script Name:			EmployeeLogin
Author:		Andy Williams
Created Date:		05/18/15
Purpose:		Simple Login Test
Prerequisites:			@BeforeTest will Triggers the Browser
‘Change history:	n/a
 *******************************************************************************************************************************************************************************************************************/
package loginPage; //Package Used in this Class

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.concurrent.TimeUnit;

import mainPage.MainPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

import dataSheet.ReadFileData;
import toolsBS.Login;
import toolsBS.Logout;

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public class EmployeeLogin extends ReadFileData {
	// Variable Declaration
	
	Login objLogin; // Declare a variable of type Login
	Logout objLogout; // Declare a variable of type Logout
	MainPage objMainPage; // Declare a variable of type MainPage

	// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	// Business Process
	

	@Test(priority = 0)
	// Call the Current Test

	public void EmployeeLoginTest() {
		String testName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		testStart(testName);
		Setup();
		objLogin = new Login(getDriver()); // Construct a new object and store a
										// reference to it in the variable.
		Assert.assertTrue(objLogin.LoginPageLoaded(),
				"Login Page doesn't Display");
		Reporter.log("Success, the login Page Loaded<br>");
		objLogin.loginToBlueSource(getUsername(), getPassword()); // Calling method
																// from the
																// login class
																// assigning
																// desired User
																// Name and
																// Password
		objMainPage = new MainPage(getDriver()); // Construct a new object and store
											// a reference to it in the
											// variable.
		Assert.assertTrue(objMainPage.MainPageLoaded(),
				"Main Page doesn't Display"); // Asserts Main Page Loads
		Reporter.log("Success, the main Page Loaded"); // Reports

	}

	@Test(priority = 1)
	public void EmployeeLogoutTest() {
		String testName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		testStart(testName);
		Setup();
		objLogin = new Login(getDriver()); // Construct a new object and store a
		// reference to it in the variable.
		objLogin.loginToBlueSource(getUsername(), getPassword()); // Calling method
		// from the
		// login class
		// assigning
		// desired User
		// Name and
		// Password
		objLogout = new Logout(getDriver()); // Construct a new object and store a
										// reference to it in the variable.
		objLogout.LogoutClick(); // call log out method
		Assert.assertTrue(objLogin.LoginPageLoaded(), // Assert Login Page Loads
				"Login Page doesn't Display");
		Reporter.log("Success, the login Page Loaded"); // Report
	}

	// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@AfterMethod
	public void closeBrowser(ITestResult result) {
		result.getMethod().getMethodName();
		endTest(testName);
		getDriver().getCurrentUrl();
		getDriver().quit(); // Close browser before each new test
	}
}
