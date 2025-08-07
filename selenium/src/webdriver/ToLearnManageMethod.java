package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnManageMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver wd=new ChromeDriver();
		wd.get("https://www.flipkart.com/");
		wd.manage().window().maximize();
		Thread.sleep(2000);
		wd.manage().window().minimize();
		Thread.sleep(2000);
		wd.manage().window().fullscreen();
		Thread.sleep(2000);
		wd.quit();
	}
}
