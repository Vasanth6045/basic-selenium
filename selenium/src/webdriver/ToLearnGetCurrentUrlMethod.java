package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetCurrentUrlMethod {
	public static void main(String[] args) {
		WebDriver wd= new ChromeDriver();
		wd.get("https://www.flipkart.com/");
		
		String url = wd.getCurrentUrl();
		System.out.println(url);
	}
}
