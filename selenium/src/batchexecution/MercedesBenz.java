package batchexecution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MercedesBenz {
	@Test(groups="integration")
	public void launch() {
		WebDriver wd=new EdgeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get("https://www.mercedes-benz.co.in/");
		Reporter.log("Maybach",true);
	}
}
