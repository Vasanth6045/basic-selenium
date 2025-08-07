package webdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetPositionMethod {
	public static void main(String[] args) {
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.flipkart.com/");
		Point position = wd.manage().window().getPosition();
		System.out.println(position.getX());
		System.out.println(position.getY());
		wd.manage().window().setPosition(new Point(350,400));
	}
}
