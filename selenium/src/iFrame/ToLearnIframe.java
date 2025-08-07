package iFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class ToLearnIframe {
	public static void main(String[] args) {
		WebDriver wd=new EdgeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get("https://www.dream11.com/");
		
		//wd.switchTo().frame(0); //switching from main page to i frame using index
		//wd.switchTo().frame("send-sms-iframe"); //switching from main page to iframe using 'name' or 'id'
		WebElement framr = wd.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		wd.switchTo().frame(framr);
		wd.findElement(By.id("regEmail")).sendKeys("123569");
		
		wd.switchTo().defaultContent(); //switching back from iframe to mainpage (parent frame, default content)
		wd.switchTo().parentFrame(); //switching back from iframe to mainpage (parent frame, default content)
		wd.findElement(By.id("hamburger")).click();
	}
}
