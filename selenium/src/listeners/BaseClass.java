package listeners;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;



public class BaseClass {
	public static WebDriver wd;
	@BeforeClass
	public void openBrowser() {
		wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get("https://demowebshop.tricentis.com/");
	}
	
}
