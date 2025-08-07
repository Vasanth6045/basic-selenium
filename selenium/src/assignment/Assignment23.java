package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment23 {
	public static void main(String[] args) {
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get("https://www.freshersworld.com/");
		wd.findElement(By.xpath("//span[text()='REGISTER NOW']")).click();
		wd.findElement(By.xpath("//input[@type='file']")).sendKeys("D:\\PDF\\updated resume.pdf");
	}
}
