package shoppersstack.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDescription extends BasePage{

	public ProductDescription(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//div[contains(@class,'ProductDisplay_productActions__T5wEe')]/descendant::button[2]/span")
	private WebElement getProduct;

	public WebElement getGetProduct() {
		return getProduct;
	}
	
	@FindBy(xpath = "//div[contains(@class,'ProductDisplay_productActions__T5wEe')]/descendant::button[2]")
	private WebElement addedProduct;

	public WebElement getAddedProduct() {
		return addedProduct;
	}

}
