package shoppersstack.testscripts;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import shoppersstack.baseclass.BaseClass;
import shoppersstack.objectrepository.AddAddress;
import shoppersstack.objectrepository.AddAddressPage;
import shoppersstack.objectrepository.HomePage;
import shoppersstack.objectrepository.MyProfilePage;

public class AddAddressTest extends BaseClass{
		
	@Test(groups = "smoke")
	public void addAddress() throws Throwable {
		
		HomePage home=new HomePage(driver);
		home.getProfilelogo().click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(80));
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(home.getProfilelogo()));
		home.getMyProfile().click();
		
		MyProfilePage profile=new MyProfilePage(driver);
		Thread.sleep(5000);
		profile.getGetAddress().click();
		Thread.sleep(5000);
		AddAddressPage address = new AddAddressPage(driver);
		
		address.getClickAddress().click();
		
		Thread.sleep(5000);
		
		AddAddress add = new AddAddress(driver);
		
		add.getAddName().sendKeys("Test");
		add.getAddHouse().sendKeys("Test");
		add.getAddStreet().sendKeys("Test");
		add.getAddLandMark().sendKeys("Test");
		
		Select country = new Select(add.getCountry());		
		country.selectByVisibleText("India");
		
		Select state = new Select(add.getAddState());		
		state.selectByVisibleText("Goa");
		
		Select city = new Select(add.getAddCity());		
		city.selectByVisibleText("Panaji");
		
		add.getAddPincode().sendKeys("111111");
		add.getAddPhone().sendKeys("1111111111");
		
		Thread.sleep(5000);
		
		add.getAddAddressButton().click();
		
		Reporter.log("Address Added Successfully", true);
		Thread.sleep(5000);
		
	}

}
