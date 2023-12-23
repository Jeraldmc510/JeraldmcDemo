package shoppersstack.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import shoppersstack.baseclass.BaseClass;
import shoppersstack.objectrepository.CartPage;
import shoppersstack.objectrepository.HomePage;
import shoppersstack.objectrepository.ProductDescription;
import shoppersstack.objectrepository.ProductPage;

public class AddShoesToCartTest extends BaseClass {
	
	@Test(groups = "smoke")
	public void addShoesToCart() throws Throwable {
		HomePage home1 = new HomePage(driver);
		Thread.sleep(2000);
		home1.getGetSearchBox().sendKeys("shoes");
		Thread.sleep(2000);
		home1.getGetSearchButton().click();
		Thread.sleep(2000);
		Reporter.log("Product Searched Successfully", true);
			
						
		ProductPage product = new ProductPage(driver);
		product.getCheckProduct().click();
		Thread.sleep(5000);
		
		
		
		ProductDescription description = new ProductDescription(driver);
		Thread.sleep(5000);
		
			if(description.getAddedProduct().isDisplayed()==false) {
			description.getGetProduct().click();
			Reporter.log("Product added Successfully", true);
			Thread.sleep(5000);
			CartPage cart= new CartPage(driver);
			cart.getCartList().click();
			Thread.sleep(5000);
			Reporter.log("Cart Checked Successfully", true);		
			Thread.sleep(5000);
			cart.getContinueShop().click();
		}
		else if (description.getAddedProduct().isDisplayed()==true) {
			Reporter.log("Product already added Successfully", true);
			CartPage cart= new CartPage(driver);
			cart.getCartList().click();
			Thread.sleep(5000);
			Reporter.log("Cart Checked Successfully", true);		
			Thread.sleep(5000);
			cart.getContinueShop().click();

		}
	/*	else
		{
			description.getGetProduct().click();
			Reporter.log("Product added Successfully", true);
			Thread.sleep(5000);
			CartPage cart= new CartPage(driver);
			cart.getCartList().click();
			Thread.sleep(5000);
			Reporter.log("Cart Checked Successfully", true);		
			Thread.sleep(5000);
			cart.getContinueShop().click();
			
			
		}*/
		
	}
}
