package shoppersstack.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericutility.WebDriverUtility;
import shoppersstack.baseclass.BaseClass;

public class DemoTest2 extends BaseClass {
	@Test
	
	public void demoTest2() {
		WebDriverUtility utility = new WebDriverUtility();
		String title = utility.getPageTitle(driver);
		Reporter.log(title, true);
	}

}
