package shoppersstack.testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest5DatePicker {
	@Test
	
	public void demoTest(){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id = 'datepicker']")).click();
		boolean res = true;
		while(res) {
			String monthText = driver.findElement(By.xpath("//div[@class = 'ui-datepicker-title']")).getText();
			if(monthText.contains("August 2023")) {
				driver.findElement(By.xpath("//a[text() ='15']")).click();
				res = false;
				}
			else {
				driver.findElement(By.xpath("//span[text() = 'Prev']")).click();
			}
		}
	}

}
