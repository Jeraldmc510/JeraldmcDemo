package shoppersstack.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddAddress extends BasePage {

	public AddAddress(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	

	@FindBy(id= "Name")
	private WebElement addName;

	public WebElement getAddName() {
		return addName;
	}

	
	@FindBy(id = "House/Office Info")
	private WebElement addHouse;

	public WebElement getAddHouse() {
		return addHouse;
	}

	@FindBy(id = "Street Info")
	private WebElement addStreet;
	public WebElement getAddStreet() {
		return addStreet;
	}

	@FindBy(id = "Landmark")
	private WebElement addLandMark;
	public WebElement getAddLandMark() {
		return addLandMark;
		
	}

	public WebElement getAddPincode() {
		return addPincode;
	}

	public WebElement getAddPhone() {
		return addPhone;
	}



	
	@FindBy(id = "Pincode")
	private WebElement addPincode;
	
	@FindBy(id ="Phone Number")
	private WebElement addPhone;
	
	@FindBy(id = "addAddress")
	private WebElement addAddressButton;	
	public WebElement getAddAddressButton() {
		return addAddressButton;
	}


	@FindBy(id ="Country")
	private WebElement country;

	public WebElement getCountry() {
		return country;
	}
	
	@FindBy(id= "State")
	private WebElement addState;
	public WebElement getAddState() {
		return addState;
	}
	
	@FindBy(id= "City")
	private WebElement addCity;
	public WebElement getAddCity() {
		return addCity;
	}
	


}
