package shoppersstack.testscripts;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import shoppersstack.fileutility.ReadAddressPropertiesFromExcel;
import shoppersstack.fileutility.ReadExcelData;

public class DataProvidersDemo1Test {
	
@DataProvider
public Object[][] dataSupplier(){
	ReadExcelData read =new ReadExcelData();
	Object[][] data = read.getFromExcel("./src/test/resources/Book1.xlsx", "Sheet1");
	return data;
	}


@Test(dataProvider = "dataSupplier")
public void loginTest1(String username, String password) throws Throwable{
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.shoppersstack.com/");
	Thread.sleep(5000);
	driver.findElement(By.id("loginBtn")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("Email")).sendKeys(username);
	Thread.sleep(5000);
	driver.findElement(By.id("Password")).sendKeys(password);
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//*[name() = 'svg' and @viewBox = '0 0 24 24'])[1]")).click();
	Thread.sleep(5000);
	driver.quit();
	}
}
