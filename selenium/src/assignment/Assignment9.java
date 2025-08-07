package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment9 {
	public static void main(String[] args) {
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://demowebshop.tricentis.com/");
		wd.findElement(By.className("ico-login")).click();
		wd.findElement(By.className("email")).sendKeys("vasanth@gmail.com");
		wd.findElement(By.className("password")).sendKeys("vasanth@123");
		wd.findElement(By.cssSelector("input[value=\"Log in\"]")).click();
	}
}
