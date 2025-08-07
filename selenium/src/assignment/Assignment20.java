package assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Assignment20 {
	public static void main(String[] args) throws IOException {
		WebDriver wd=new EdgeDriver();
		String timestamp = LocalDateTime.now().toString().replace(":","-");
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get("https://demoapps.qspiders.com/");
		wd.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		wd.findElement(By.xpath("//section[text()='Button']")).click();
		wd.findElement(By.xpath("//a[text()='Right Click']")).click();
		WebElement btn = wd.findElement(By.xpath("//button[@id='btn_a']"));
		Actions a=new Actions(wd);
		a.contextClick(btn).perform();
		wd.findElement(By.xpath("//div[text()='Yes']")).click();
		String msg = wd.findElement(By.xpath("//span[contains(@class,'text-green')]")).getText();
		System.out.println(msg);
		wd.findElement(By.xpath("//a[text()='Double Click']")).click();
		WebElement dclick = wd.findElement(By.xpath("//button[text()='No']"));
		a.doubleClick(dclick).perform();
		TakesScreenshot ts=(TakesScreenshot) wd;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShots/"+timestamp+"qsp.png");
		FileHandler.copy(temp, dest);
	}
}
