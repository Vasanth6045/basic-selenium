package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnId {
	public static void main(String[] args) {
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.facebook.com/");
		wd.findElement(By.id("email")).sendKeys("vasanth@gmail.com");
		wd.findElement(By.id("pass")).sendKeys("vasanth@123");
		wd.findElement(By.name("login")).click();
	}
}
