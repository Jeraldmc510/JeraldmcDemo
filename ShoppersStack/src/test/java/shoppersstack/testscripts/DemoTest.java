package shoppersstack.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import shoppersstack.baseclass.BaseClass;

public class DemoTest extends BaseClass {
	
	@Test(groups = "regression")
	public void demoTest() {
		Reporter.log("Successfully executed demoTest()", true);
	}
	
	/*@Test
	public void demoTest1() {
		Reporter.log("Successfully executed demoTest1()", true);
	}*/
	
	
}
