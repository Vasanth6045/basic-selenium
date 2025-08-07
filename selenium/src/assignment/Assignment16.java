package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment16 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver wd=new EdgeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get("https:/www.shoppersstack.com/");
		WebElement allensoly = wd.findElement(By.xpath("//span[text()='ALLEN SOLLY']"));
		JavascriptExecutor js=(JavascriptExecutor) wd;
		js.executeScript("arguments[0].scrollIntoView(false)", allensoly);
		wd.findElement(By.xpath("//img[@alt='Boys  Collar Casual tShirt']")).click();
		WebElement image = wd.findElement(By.tagName("img"));
		System.out.println(image);
		wd.findElement(By.id("Check Delivery")).sendKeys("560068");
		Thread.sleep(3000);
		wd.findElement(By.id("Check")).click();
	}
}
