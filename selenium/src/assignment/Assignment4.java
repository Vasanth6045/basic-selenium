package assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
	public static void main(String[] args) {
		WebDriver wd=new ChromeDriver();
		wd.navigate().to("https://www.flipkart.com/");
		wd.manage().window().setPosition(new Point(350, 300));
		wd.manage().window().setSize(new Dimension(500, 400));
		wd.navigate().back();
		wd.navigate().forward();
		wd.quit();
	}
}
