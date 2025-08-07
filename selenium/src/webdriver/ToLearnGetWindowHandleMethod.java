package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetWindowHandleMethod {
	public static void main(String[] args) {
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.flipkart.com/");
		String windowId = wd.getWindowHandle();
		System.out.println(windowId);
	}
}
