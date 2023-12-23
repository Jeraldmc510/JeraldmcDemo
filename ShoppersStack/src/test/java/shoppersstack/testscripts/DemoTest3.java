package shoppersstack.testscripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import shoppersstack.baseclass.BaseClass;

public class DemoTest3{ //extends BaseClass{
	@Test
	public void demoTest() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		String homeHandle = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text() ='Facebook']")).click();
		driver.findElement(By.xpath("//a[text() ='Twitter']")).click();
		driver.findElement(By.xpath("//a[text() ='YouTube']")).click();
		driver.findElement(By.xpath("//a[text() ='Google+']")).click();
		Set<String> allHandles = driver.getWindowHandles();
		for(String handle:allHandles) {
			
			if(!(handle.equals(homeHandle))) {
				driver.switchTo().window(handle);
				String title = driver.getTitle();
				if(title.contains("Google")) {
					System.out.println(title);
				}
				else {
					driver.close();
				}				
			}		
					
		}
		
		driver.switchTo().window(homeHandle);
		driver.close();
		
	}

}
