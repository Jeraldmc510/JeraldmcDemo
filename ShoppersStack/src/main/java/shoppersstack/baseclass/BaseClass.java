package shoppersstack.baseclass;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import listenerimplementation.ListenerImp;
import shoppersstack.fileutility.ReadProperties;
import shoppersstack.objectrepository.AddAddressPage;
import shoppersstack.objectrepository.HomePage;
import shoppersstack.objectrepository.LoginPage;
import shoppersstack.objectrepository.ProductPage;
import shoppersstack.objectrepository.WelcomePage;

public class BaseClass extends ListenerImp{
	
	public WebDriver driver;
	public static WebDriver sdriver;

	//@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void launchBrowser() {
		
		driver=new ChromeDriver();
//		if(browser.equalsIgnoreCase("Chrome")) {
//			driver=new ChromeDriver();
//		}
//		else if (browser.equalsIgnoreCase("Edge")) {
//		driver=new EdgeDriver();
//		}
//		else {
//			driver=new ChromeDriver();
//		}
	sdriver = driver;
	driver.manage().window().maximize();
	Reporter.log("Browser launched Successfully", true);
	}
	
	@BeforeMethod(alwaysRun = true)
	public void login() throws Throwable {
		ReadProperties properties = new ReadProperties();
		String url = properties.getDataFromProperty("url");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		String username = properties.getDataFromProperty("UserName");
		String password = properties.getDataFromProperty("password");
		
		WelcomePage welcome = new WelcomePage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(welcome.getLoginButton()));
		Thread.sleep(5000);		
		welcome.getLoginButton().click();
		
		LoginPage login = new LoginPage(driver);	
		login.getEmailTextField().sendKeys(username);
		wait.until(ExpectedConditions.visibilityOf(login.getPasswordTextField()));
		Thread.sleep(1000);
		login.getPasswordTextField().sendKeys(password);
		wait.until(ExpectedConditions.visibilityOf(login.getLoginButton()));
		Thread.sleep(1000);
		login.getLoginButton().click();
		Reporter.log("Logged in Successfully", true);
		
	}
	
	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		driver.quit();
		Reporter.log("Browser closed Successfully", true);
	}
	
	@AfterMethod(alwaysRun = true)
	public void logout() throws Throwable {
		HomePage home = new HomePage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(home.getProfilelogo()));
		Thread.sleep(5000);
		home.getProfilelogo().click();
		wait.until(ExpectedConditions.visibilityOf(home.getLogout()));
		Thread.sleep(5000);
		home.getLogout().click();		
		Thread.sleep(10000);
		Reporter.log("Website logged out Successfully", true);		
		
	}
	

}
