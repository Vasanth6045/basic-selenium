package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AssignmentInClass2 {
	public static void main(String[] args) {
		WebDriver wd=new EdgeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get("https://www.dream11.com/");
		wd.findElement(By.id("regEmail")).sendKeys("123456");
		wd.findElement(By.xpath("//a[@id='regUser']")).click();
	}
}
