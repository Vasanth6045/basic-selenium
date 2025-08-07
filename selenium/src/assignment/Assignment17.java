package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment17 {
	public static void main(String[] args) {
		WebDriver wd=new EdgeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get("https://demowebshop.tricentis.com/");
		WebElement atc = wd.findElement(By.xpath("//a[text()='14.1-inch Laptop']/../..//input[@value='Add to cart']"));
		JavascriptExecutor js=(JavascriptExecutor) wd;
		js.executeScript("arguments[0].scrollIntoView(false)",atc);
		atc.click();
		String notification = wd.findElement(By.xpath("//div[@id='bar-notification']")).getText();
		System.out.println(notification);
	}
}
