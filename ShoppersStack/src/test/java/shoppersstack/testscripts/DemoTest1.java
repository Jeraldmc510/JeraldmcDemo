package shoppersstack.testscripts;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import shoppersstack.baseclass.BaseClass;

@Listeners(listenerimplementation.ListenerImp.class)
public class DemoTest1 extends BaseClass{
	
	@Test
	public void demoTest() {
		// Click on Profile Button
		
		test.log(LogStatus.INFO, "Profile Page displayed successfully");
		
		// Click on add Address
		
		test.log(LogStatus.INFO, "Add Address page displayed successfully");
				
		// Enter the credential
		
		Assert.fail();				
		test.log(LogStatus.INFO, "Address added  successfully");

	}

}
