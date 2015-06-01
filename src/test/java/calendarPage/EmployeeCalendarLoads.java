/*******************************************************************************************************************************************************************************************************************
Script Name:			EmployeeCalendarLoads
Author:		Andy Williams
Created Date:		05/18/15
Purpose:		This code verifies that the Employee Calendar Page Loads
Prerequisites:			@BeforeTest will Trigger the Login
‘Change history:	n/a
 *******************************************************************************************************************************************************************************************************************/
package calendarPage; //Package Used in this Class

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.concurrent.TimeUnit; // Import all Necessary Packages to be used in this Class

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
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import calendar.Calendar;
import dataSheet.ReadFileData;
import toolsBS.Login;

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
@Test
public class EmployeeCalendarLoads extends ReadFileData {
	// Variable Declaration
	
	Login objLogin;
	Calendar objCal; // Declare a variable of type Calendar

	// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	// Business Process
	


	public void EmployeeCalendarTest() {
		String testName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		testStart(testName);
	    Setup();
	objLogin = new Login(getDriver());
	//objLogin.loginToBlueSource(getUsername(), getPassword()); // Calling method
	// from login
	// class
	// assigning
	// desired
	// Username and
	// Password
	objCal = new Calendar(getDriver()); // Construct a new object and store a
									// reference to it in the variable.
	Assert.assertTrue(objCal.CalendarPageLoaded(), // Assert Method
													// called returns value
													// of True, otherwise
													// state the page didn't
													// load
			"Calendar Page didn't Load");
	Reporter.log("Success, the Calendar Page Loaded<br>"); // Reports
															// success of
															// the desired
															// Test/Method


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
