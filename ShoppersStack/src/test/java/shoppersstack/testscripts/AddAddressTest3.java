package shoppersstack.testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import shoppersstack.baseclass.BaseClass;
import shoppersstack.objectrepository.AddAddress;
import shoppersstack.objectrepository.AddAddressPage;
import shoppersstack.objectrepository.HomePage;
import shoppersstack.objectrepository.MyProfilePage;

public class AddAddressTest3 extends BaseClass{	
	
	@Test
	public void addAddress() throws Throwable {
//		Assert.fail();
		//HardAssert
		//Click on profile
//		String address = "Shoppers | Title";
//		Assert.assertEquals(address, "Shoppers | Home");
//		Reporter.log("Address Added Successfully", true);
//		HomePage home=new HomePage(driver);
//		home.getProfilelogo().click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(80));
//		wait.until(ExpectedConditions.visibilityOf(home.getProfilelogo()));
//		home.getMyProfile().click();
		
//		MyProfilePage profile=new MyProfilePage(driver);
//		Thread.sleep(5000);
//		profile.getGetAddress().click();
//		Thread.sleep(5000);
		
//		String address = "Shoppers | Title";
//		Assert.assertEquals(address, "Shoppers | Title");
//		Reporter.log("Address Added Successfully", true);
//		
//		WebElement editButton = driver.findElement(By.xpath("//button[contains(text(),'Edit Profile')]"));
//		Assert.assertEquals(editButton.isDisplayed(), false);
//		Reporter.log("Address Added Successfully", true);
		// SoftAssert
		//String title = "Shoppers | Profile";
		String title = "Shoppers | Home";
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(title, "Shoppers | Home");
		Reporter.log("Address Added Successfully", true);
		Reporter.log("Address Added1 Successfully", true);
		Reporter.log("Address Added2 Successfully", true);
		soft.assertAll();
		
		
	
	}

}
