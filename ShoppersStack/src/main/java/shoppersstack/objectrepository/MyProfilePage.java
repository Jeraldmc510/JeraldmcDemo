package shoppersstack.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyProfilePage extends BasePage{

	public MyProfilePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//div[contains(@class,'MuiGrid')]/a[2]")
	private WebElement getAddress;

	public WebElement getGetAddress() {
		return getAddress;
	}

}
