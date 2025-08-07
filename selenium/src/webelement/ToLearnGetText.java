package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetText {
	public static void main(String[] args) {
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://demowebshop.tricentis.com/login");
		wd.findElement(By.xpath("//input[@value='Log in']")).click();
		String text = wd.findElement(By.xpath("//div[@class='validation-summary-errors']")).getText();
		System.out.println(text);
	}
}
