package shoppersstack.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
//	@FindBy (xpath = "//button[contains(@aria-label, 'Account settings')]")
	
	@FindBy (xpath ="//button[contains(@aria-label, 'Account settings')]/span[1]")
	private WebElement profilelogo;

	public WebElement getProfilelogo() {
		return profilelogo;
	}
	
	@FindBy(xpath="//ul[contains(@class, 'MuiList-root')]/li[1]")
	private WebElement myProfile;
	
	public WebElement getMyProfile() {
		return myProfile;
	}

	public void setMyProfile(WebElement myProfile) {
		this.myProfile = myProfile;
	}

	@FindBy(xpath="//ul[contains(@class, 'MuiList-root')]/li[7]")
	private WebElement logout;

	public WebElement getLogout() {
		return logout;
	}
	
	@FindBy(id = "search")
	private WebElement getSearchBox;

	public WebElement getGetSearchBox() {
		return getSearchBox;
	}
	
	@FindBy(xpath = "//*[name()='svg' and @id='searchBtn']")
	private WebElement getSearchButton;

	public WebElement getGetSearchButton() {
		return getSearchButton;
	}
	

}
