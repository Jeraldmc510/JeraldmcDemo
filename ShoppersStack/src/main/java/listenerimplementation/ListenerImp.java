package listenerimplementation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import genericutility.JavaUtility;
import shoppersstack.baseclass.BaseClass;

public class ListenerImp implements ITestListener, ISuiteListener {
	public static ExtentReports report;
	public static ExtentTest test;
	
	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
	//	ISuiteListener.super.onStart(suite);
		Reporter.log(suite.getName()+"Has started", true);
//		report = new ExtentReports("./AdvancedReports/"+suite.getName()+".html");
		JavaUtility javaUtility = new JavaUtility();
		String time = javaUtility.getDateAndTime();
		report = new ExtentReports("./AdvancedReports/"+suite.getName()+time+".html");
	}
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	//	ITestListener.super.onTestStart(result);
		
		Reporter.log(result.getName()+"Test Has started", true);
		test= report.startTest(result.getName());
		test.log(LogStatus.INFO, "Test has been Started");
	}
	
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	//	ITestListener.super.onTestFailure(result);
		String imgPath = "./FailedScreenshots/"+result.getName()+".png";
		TakesScreenshot ts= (TakesScreenshot)BaseClass.sdriver;
		File ss = ts.getScreenshotAs(OutputType.FILE);
	//	File path = new File("./FailedScreenshots/"+result.getName()+".png");
		File path = new File(imgPath);
		try {
			FileHandler.copy(ss, path);
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		test.log(LogStatus.FAIL, "Test is failed");
		test.log(LogStatus.INFO, test.addScreenCapture("."+imgPath));
	}
	
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
	//	ITestListener.super.onTestSkipped(result);
		Reporter.log(result.getName()+"Test Has skipped", true);
		test.log(LogStatus.SKIP, "Test is Skipped");
	}
	
     public void onTestSuccess(ITestResult result) {
    	// TODO Auto-generated method stub
    	//ITestListener.super.onTestSuccess(result);
    	 Reporter.log(result.getName()+"Test is successfully Executed", true);
    	 test.log(LogStatus.PASS, "Test is passed");
    }
     
     public void onFinish(ISuite suite) {
    	// TODO Auto-generated method stub
    	//ISuiteListener.super.onFinish(suite);
    	 Reporter.log(suite.getName()+"Has Finished", true); 
    	 report.endTest(test);
    	 report.flush();
    	 
    }
}
