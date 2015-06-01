/*******************************************************************************************************************************************************************************************************************
Script Name:			EmployeeEmployeesLoads
Author:		Andy Williams
Created Date:		05/18/15
Purpose:		This code verifies that the Employee's  Page Loads
Prerequisites:			@BeforeTest will Trigger the Login
‘Change history:	n/a
 *******************************************************************************************************************************************************************************************************************/
package employeesPage; //Package Used in this Class

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

import dataSheet.ReadFileData;
import toolsBS.Login;
import employees.Employees;

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public class EmployeeEmployeesLoads extends ReadFileData {
	// Variable Declaration
	
	Login objLogin; // Declare a variable of type Login
	Employees objEmp; // Declare a variable of type Employees

	// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	// Business Process
	

	@Test
	// Call the Current Test
	public void EmployeeEmployeesTest() {
		String testName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		testStart(testName);
		Setup();
		objEmp = new Employees(getDriver()); // Construct a new object and store a
										// reference to it in the variable.
		Assert.assertTrue(objEmp.EmployeesPageLoaded(),
				"Employee Page didn't Load");
		Reporter.log("Success, the Employees Page Loaded<br>"); // Report
																// Message
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
