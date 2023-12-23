package shoppersstack.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddAddressPage extends BasePage{

	public AddAddressPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@FindBy(xpath ="//a[contains(@href,'/addressform')]")
	private WebElement clickAddress;

	public WebElement getClickAddress() {
		return clickAddress;
	}
	
	

}
