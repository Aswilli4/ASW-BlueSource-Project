package calendarPage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import toolsBS.Login;
import calendar.Calendar;
import dataSheet.ReadFileData;

public class Practice extends ReadFileData {
	//WebDriver driver;
	Login objLogin; // Declare a variable of type Login
	Calendar objCal; // Declare a variable of type Calendar

	@Test
	// Call the Current Test
	public void Something() { // Call Method
		Setup(); // Call Setup from ReadFileData Class
		
		Login objLogin = new Login(getDriver());
		objLogin.loginToBlueSource(getUsername(), getPassword()); // Calling method
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
// add comment
	// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@AfterTest
	// The annotated method will be run after all the test methods belonging to
	// the classes inside the <test> tag have run.
	public void closeBrowser() {

		getDriver().getCurrentUrl();
		getDriver().quit(); // close browser after each test
	}
}
