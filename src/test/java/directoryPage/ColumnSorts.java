/*******************************************************************************************************************************************************************************************************************
Script Name:			ColumnSorts
Author:		Andy Williams
Created Date:		05/18/15
Purpose:		This code verifies that all columns on the table can sort. Some columns are triggered in ascending order and others are in descending order and the test displays a message stating how each column is sorted.
Prerequisites:			@BeforeTest will Trigger the Login
‘Change history:	n/a
 *******************************************************************************************************************************************************************************************************************/
package directoryPage; //Package Used in this Class

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.concurrent.TimeUnit; // Import all Necessary Packages to be used in this Class

import navigationBar.NavigationBar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
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
public class ColumnSorts extends ReadFileData {
	public class EmployeeDirectoryLoads {
		// Variable Declaration
		
		Login objLogin; // Declare a variable of type Login
		Directory objDir; // Declare a variable of type Directory
		NavigationBar objNav; // Declare a variable of type NavigationBar

		// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		// Business Process
		

		@Test(priority = 0)
		// Call the Current Test
		public void ColumnSortFirstNameTest() throws Exception {
			String testName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			Setup();
			Login objLogin = new Login(getDriver());
			objLogin.loginToBlueSource(getUsername(), getPassword()); // Calling method
			// from login
			// class
			// assigning
			// desired
			// Username and
			// Password
			objNav = new NavigationBar(getDriver()); // Construct a new object and
												// store a reference to it in
												// the variable.
			objNav.DirectoryClicks(); // Calling the method to access the
										// Directory Page

			objDir = new Directory(getDriver()); // Construct a new object and store
											// a reference to it in the
											// variable.
			Assert.assertTrue(objDir.DirectoryPageLoaded(), // Asserts True that
															// the Directory
															// Page loads, else
															// throws error.
					"Directory Page didn't Load");

			Assert.assertTrue(objDir.FirstNameSort()); // Asserts True this
														// column sorts
														// correctly

		}

		@Test(priority = 1)
		// Call the Current Test
		public void ColumnSortLastNameTest() throws Exception {
			String testName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			testStart(testName);
			Setup();
			Login objLogin = new Login(getDriver());
			objLogin.loginToBlueSource(getUsername(), getPassword()); // Calling method
			// from login
			// class
			// assigning
			// desired
			// Username and
			// Password

			objNav = new NavigationBar(getDriver()); // Construct a new object and
												// store a reference to it in
												// the variable.
			objNav.DirectoryClicks();

			objDir = new Directory(getDriver()); // Construct a new object and store
											// a reference to it in the
											// variable.
			Assert.assertTrue(objDir.DirectoryPageLoaded(),
					"Directory Page didn't Load");
			Assert.assertTrue(objDir.LastNameSort()); // Asserts True this
														// column sorts
														// correctly

		}

		@Test(priority = 2)
		// Call the Current Test
		public void ColumnSortSupervisorTest() throws Exception {
			String testName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			testStart(testName);
			Setup();
			Login objLogin = new Login(getDriver());
			objLogin.loginToBlueSource(getUsername(), getPassword()); // Calling method
			// from login
			// class
			// assigning
			// desired
			// Username and
			// Password

			objNav = new NavigationBar(getDriver()); // Construct a new object and
												// store a reference to it in
												// the variable.
			objNav.DirectoryClicks();
			objDir = new Directory(getDriver()); // Construct a new object and store
											// a reference to it in the
											// variable.
			Assert.assertTrue(objDir.DirectoryPageLoaded(),
					"Directory Page didn't Load");
			Assert.assertTrue(objDir.SupervisorSort()); // Asserts True this
														// column sorts
														// correctly

		}

		@Test(priority = 3)
		// Call the Current Test
		public void ColumnSortDeptTest() throws Exception {
			String testName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			testStart(testName);
			Setup();
			Login objLogin = new Login(getDriver());
			objLogin.loginToBlueSource(getUsername(), getPassword()); // Calling method
			// from login
			// class
			// assigning
			// desired
			// Username and
			// Password

			objNav = new NavigationBar(getDriver()); // Construct a new object and
												// store a reference to it in
												// the variable.
			objNav.DirectoryClicks();
			objDir = new Directory(getDriver()); // Construct a new object and store
											// a reference to it in the
											// variable.
			Assert.assertTrue(objDir.DirectoryPageLoaded(),
					"Directory Page didn't Load");
			Assert.assertTrue(objDir.DeptSort()); // Asserts True this column
													// sorts correctly

		}

		@Test(priority = 4)
		// Call the Current Test
		public void ColumnSortOfficePhoneTest() throws Exception {
			String testName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			testStart(testName);
			Setup();
			Login objLogin = new Login(getDriver());
			objLogin.loginToBlueSource(getUsername(), getPassword()); // Calling method
			// from login
			// class
			// assigning
			// desired
			// Username and
			// Password

			objNav = new NavigationBar(getDriver()); // Construct a new object and
												// store a reference to it in
												// the variable.
			objNav.DirectoryClicks();
			objDir = new Directory(getDriver()); // Construct a new object and store
											// a reference to it in the
											// variable.
			Assert.assertTrue(objDir.DirectoryPageLoaded(),
					"Directory Page didn't Load");
			Assert.assertTrue(objDir.OfficePhoneSort()); // Asserts True this
															// column sorts
															// correctly

		}

		@Test(priority = 5)
		// Call the Current Test
		public void ColumnSortCellPhoneTest() throws Exception {
			String testName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			testStart(testName);
			
			Setup();
			Login objLogin = new Login(getDriver());
			objLogin.loginToBlueSource(getUsername(), getPassword()); // Calling method
			// from login
			// class
			// assigning
			// desired
			// Username and
			// Password

			objNav = new NavigationBar(getDriver()); // Construct a new object and
												// store a reference to it in
												// the variable.
			objNav.DirectoryClicks();
			objDir = new Directory(getDriver()); // Construct a new object and store
											// a reference to it in the
											// variable.
			Assert.assertTrue(objDir.DirectoryPageLoaded(),
					"Directory Page didn't Load");
			Assert.assertTrue(objDir.CellPhoneSort()); // Asserts True this
														// column sorts
														// correctly

		}

		@Test(priority = 6)
		// Call the Current Test
		public void ColumnSortIMNameTest() throws Exception {
			String testName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			testStart(testName);
			Setup();
		Login objLogin = new Login(getDriver());
		objLogin.loginToBlueSource(getUsername(), getPassword()); // Calling method
		// from login
		// class
		// assigning
		// desired
		// Username and
		// Password
			// driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

			objNav = new NavigationBar(getDriver()); // Construct a new object and
												// store a reference to it in
												// the variable.
			objNav.DirectoryClicks();
			objDir = new Directory(getDriver()); // Construct a new object and store
											// a reference to it in the
											// variable.
			Assert.assertTrue(objDir.DirectoryPageLoaded(),
					"Directory Page didn't Load");
			Assert.assertTrue(objDir.IMNameSort()); // Asserts True this column
													// sorts correctly

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
}
