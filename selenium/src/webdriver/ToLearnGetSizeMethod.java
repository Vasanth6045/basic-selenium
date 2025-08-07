package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetSizeMethod {
	public static void main(String[] args) {
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.flipkart.com/");
		Dimension size = wd.manage().window().getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		wd.quit();
	}
}
