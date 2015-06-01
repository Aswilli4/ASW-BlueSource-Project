/*******************************************************************************************************************************************************************************************************************
Script Name:			EmployeeDirectoryLoads
Author:		Andy Williams
Created Date:		05/18/15
Purpose:		This code verifies that the Employee Directory Page Loads
Prerequisites:			@BeforeTest will Trigger the Login
‘Change history:	n/a
 *******************************************************************************************************************************************************************************************************************/
package directoryPage;//Package Used in this Class

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
import toolsBS.Login;
import dataSheet.ReadFileData;
import directory.Directory;

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public class EmployeeDirectoryLoads extends ReadFileData {
	// Variable Declaration
	
	Login objLogin; // Declare a variable of type Login
	Directory objDir; // Declare a variable of type Directory

	// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	// Business Process
	

	@Test
	// Call the Current Test
	public void EmployeeDirectoryTest() {
		String testName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		testStart(testName);
		Setup();
		objDir = new Directory(getDriver()); // Construct a new object and store a
										// reference to it in the variable.
		Assert.assertTrue(objDir.DirectoryPageLoaded(), // Assert the Page Loads
				"Calendar Page didn't Load");
		Reporter.log("Success, the Directory Page Loaded<br>"); // Report
																// Results
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
