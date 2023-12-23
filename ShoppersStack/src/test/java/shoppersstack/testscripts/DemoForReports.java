package shoppersstack.testscripts;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import shoppersstack.baseclass.BaseClass;

public class DemoForReports extends BaseClass{
	
@Test
public void demoTest() {
	ExtentReports report = new ExtentReports("./AdvancedReports/DemoTest.html");
	ExtentTest test = report.startTest("demoTest");
	//Entering login credentials and clicking login
	test.log(LogStatus.INFO,"Home Page displayed successfully");	
		//clicking on profile button	
	test.log(LogStatus.PASS, "Profile Page displayed");			
	report.endTest(test);
	report.flush();
}


}
