package shoppersstack.testscripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import shoppersstack.baseclass.BaseClass;
import shoppersstack.fileutility.ReadProperties;
import shoppersstack.objectrepository.LoginPage;
import shoppersstack.objectrepository.WelcomePage;

public class LoginTest extends BaseClass {
	@Test
	public void login() throws Throwable {
		ReadProperties properties = new ReadProperties();		
		String url = properties.getDataFromProperty("url");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		String username = properties.getDataFromProperty("UserName");
		String password = properties.getDataFromProperty("password");
			
		WelcomePage welcome = new WelcomePage(driver);
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(welcome.getLoginButton()));
		welcome.getLoginButton().click(); 
		
		LoginPage login = new LoginPage(driver);	
		login.getEmailTextField().sendKeys(username);
		wait.until(ExpectedConditions.visibilityOf(login.getPasswordTextField()));
		Thread.sleep(5000);
		login.getPasswordTextField().sendKeys(password);
		wait.until(ExpectedConditions.visibilityOf(login.getLoginButton()));
		Thread.sleep(5000);
		login.getLoginButton().click();
		Thread.sleep(5000);
		
		//Reporter.log("Pass",true);
		Reporter.log("Loggedin Successfully", true);
		}

	
}
