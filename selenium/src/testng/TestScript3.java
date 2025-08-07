package testng;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pom.DemoWebShopHomePage;
@Listeners(ListnerImplementations.class)
public class TestScript3 extends BaseClass{
	@Test
	public void clickOnElectronics() {
		homepage=new DemoWebShopHomePage(wd);
		homepage.getElectronicsBTN().click();
		if(wd.getTitle().equals("Demo Web Shop. Electronics")) {
			Reporter.log("electronics page displayed",true);
		}else {
			Reporter.log("electronics page not displayed",true);
		}
	}	
}
