package testng;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pom.DemoWebShopHomePage;
@Listeners(ListnerImplementations.class)
public class TestScript1 extends BaseClass {
	@Test
	public void clickOnBooks() {
		SoftAssert sa=new SoftAssert();
		homepage=new DemoWebShopHomePage(wd);
		homepage.getBooksBTN().click();
		/*if(wd.getTitle().equals("Demo Web Shop. Books")) {
			Reporter.log("books page displayed",true);
		}else {
			Reporter.log("Books page not displayed",true);
		} */
		sa.assertEquals(wd.getTitle(), "Demo We Shop. Books", "books page not displayed");
		Reporter.log("books page displayed",true);
		sa.assertAll();
	}
}
