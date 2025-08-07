package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSetSizeMethod {
	public static void main(String[] args) {
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.flipkart.com/");
		wd.manage().window().setSize(new Dimension(500,300));//500 is width, 300 is height
		wd.quit();
	}
}
