package shoppersstack.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{

	public CartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "cart")
	private WebElement cartList;

	public WebElement getCartList() {
		return cartList;
	}

	@FindBy(xpath = "(//*[name()='svg' and @aria-hidden='true'])[9]/../span")
	private WebElement ContinueShop;

	public WebElement getContinueShop() {
		return ContinueShop;
	}
}
