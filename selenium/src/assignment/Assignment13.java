package assignment;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment13 {
	public static void main(String[] args) throws IOException {
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://demowebshop.tricentis.com");
		wd.findElement(By.className("ico-login")).click();
		wd.findElement(By.xpath("//input[@id='Email']")).sendKeys("vasanth@gmail.com");
		wd.findElement(By.xpath("//input[@id='Password']")).sendKeys("vasanth123");
		wd.findElement(By.xpath("//input[@value='Log in']")).click();
		TakesScreenshot sshot=(TakesScreenshot) wd;
		File temp = sshot.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/"+timestamp+"image.png");
		FileHandler.copy(temp, dest);
		wd.quit();
	}
}
