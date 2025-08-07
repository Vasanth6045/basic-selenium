package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.shoppersstack.com/men");
		Thread.sleep(15000);
		wd.findElement(By.id("men")).click();
		
	}
}
//span[text()='roadster']/../..//button[contains(text(),'add to cart')]
