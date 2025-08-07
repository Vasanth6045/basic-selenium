package webdriver;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnNavigateMethod {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		//wd.get("https://www.flipkart.com/");
		//wd.navigate().to("https://www.flipkart.com/");
		wd.navigate().to(new URL("https://www.flipkart.com/"));
		Thread.sleep(2000);
		wd.navigate().back();
		Thread.sleep(2000);
		wd.navigate().forward();
		Thread.sleep(2000);
		wd.navigate().refresh();
		Thread.sleep(2000);
		wd.quit();
	}
}
