package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetPageSourceMethod {
	public static void main(String[] args) {
		WebDriver wd=new ChromeDriver();
		wd.get("https://www.flipkart.com/");
		String source = wd.getPageSource();
		System.out.println(source);
	}
}
