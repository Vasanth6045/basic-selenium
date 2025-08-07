package listeners;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(ListenerImplementation.class) //use @listeners annotation before the class & pass the implementation class name with .class extension
public class TestScript extends BaseClass {
	@Test
	public void login() {
		wd.findElement(By.linkText("Log in")).click();
		wd.findElement(By.id("Email")).sendKeys("vasanth123@gmail.com");
		wd.findElement(By.id("Password")).sendKeys("vasanth@123");
		wd.findElement(By.xpath("//input[@value='Log in']")).click();
		Assert.assertEquals(wd.getTitle(), "Demo Web Shop","home page not displayed");
		Reporter.log("home page displayed", true);
	}
}
