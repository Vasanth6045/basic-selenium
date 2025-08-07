package assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static void main(String[] args) {
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.myntra.com/");
		String url = wd.getCurrentUrl();
		if(url.equals("https://www.myntra.com/")) {
			System.out.println("Welcome Page Displayed");
		}else {
			System.out.println("Welcome Page not Displayed");
		}
		System.out.println(url);
		Dimension size = wd.manage().window().getSize();
		System.out.println(size);
		wd.quit();
	}
}
