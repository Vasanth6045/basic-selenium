package batchexecution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Skoda {
	@Test(groups="smoke")
	public void launch() {
		WebDriver wd=new EdgeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get("https://www.skoda-auto.co.in/");
		Reporter.log("Superb",true);
	}
}
