package week6.day1;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnReport {
	public static void main(String[] args) throws IOException {

		// Create Object ExtentHtmlReporter and pass report file location in constructor
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");
		System.out.println("created an object for ExtentHtmlReporter--------");
		
		//to maintain the old files 
		reporter.setAppendExisting(true);// maintain history of the report . Note do use this line for the first time
											// execution.

		// Create object for ExtentReports
		ExtentReports extent = new ExtentReports();
		System.out.println("created an object for ExtentReports....");
		
		// Attach the report path into the report
		extent.attachReporter(reporter);
		
		ExtentTest test = extent.createTest("Login TC", "Login TC with Postivie functionality");
		test.assignAuthor("Gokul");
		test.assignCategory("Smoke");
		test.pass("username entered successfuly");
		test.pass("username entered as demosalesmanager ",MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/viewLead.png").build());
		test.fail("Failed to enter password");

		// Close the report
		extent.flush();// mandatory steps, If we didn't close the report, Report will not
						// create/Generate

	}
}
