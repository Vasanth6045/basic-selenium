package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathByAxes {
	public static void main(String[] args) {
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		
		wd.get("file:///D:/SDTE/Selenium/movie%20table.html");
		
		String text = wd.findElement(By.xpath("//td[text()='Bahubali']/preceding-sibling::td[1]")).getText();
		System.out.println(text);
	}
}
