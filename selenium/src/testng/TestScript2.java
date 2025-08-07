package testng;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pom.DemoWebShopHomePage;
@Listeners(ListnerImplementations.class)
public class TestScript2 extends BaseClass{
	@Test
	public void clickOnComputer() {
		homepage=new DemoWebShopHomePage(wd);
		homepage.getComputerBTN().click();
		if(wd.getTitle().equals("Demo web Shop. Computers")) {
			Reporter.log("computers page displayed",true);
		}else {
			Reporter.log("computers page not displayed",true);
		}
	}
}
