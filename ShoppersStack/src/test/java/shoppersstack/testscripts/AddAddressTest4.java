package shoppersstack.testscripts;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import shoppersstack.baseclass.BaseClass;
import shoppersstack.objectrepository.AddAddress;
import shoppersstack.objectrepository.AddAddressPage;
import shoppersstack.objectrepository.HomePage;
import shoppersstack.objectrepository.MyProfilePage;

@Listeners(listenerimplementation.ListenerImp.class)
public class AddAddressTest4 extends BaseClass{
	
	
	
	@Test
	public void addAddress() throws Throwable {
	//	Assert.fail();
		Reporter.log("Address Added Successfully", true);
		
	}

}
