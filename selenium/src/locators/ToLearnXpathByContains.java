package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathByContains {
	public static void main(String[] args) {
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.flipkart.com/");
		wd.findElement(By.xpath("//input[contains(@title,'Brands and More')]")).click();
	}
}
