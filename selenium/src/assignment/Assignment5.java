package assignment;

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {
	public static void main(String[] args) {
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.flipkart.com/");
		wd.manage().window().setSize(new Dimension(500,400));
		String windowId = wd.getWindowHandle();
		System.out.println(windowId);
		wd.quit();
	}
}
