package shoppersstack.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {
	public ProductPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

@FindBy(xpath = "//img[contains(@alt, 'footwear')]" )
private WebElement checkProduct;

public WebElement getCheckProduct() {
	return checkProduct;
}

}
