package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnClear {
	public static void main(String[] args) {
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://demo.vtiger.com/vtigercrm/");
		WebElement usernameVT = wd.findElement(By.id("username"));
		usernameVT.clear();
		usernameVT.sendKeys("vasanth");
	}
}
