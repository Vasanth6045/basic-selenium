package assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Assignment24 {
	public static void main(String[] args) throws IOException, InterruptedException {
		String timeStamp = LocalDateTime.now().toString().replace(":", "-");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver wd=new ChromeDriver(co);
		Actions a=new Actions(wd);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get("https://www.dell.com/en-in");
		WebElement itInfra = wd.findElement(By.xpath("//span[text()='IT Infrastructure']"));
		a.moveToElement(itInfra).perform();
		WebElement industry = wd.findElement(By.xpath("//button[text()='Industry']"));
		a.moveToElement(industry).click().perform();
		WebElement manufacturing = wd.findElement(By.xpath("//a[text()='Manufacturing']"));
		a.moveToElement(manufacturing).click().perform();
		TakesScreenshot ts=(TakesScreenshot) wd;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShots/"+timeStamp+"dell.png");
		FileHandler.copy(temp, dest);
		wd.findElement(By.linkText("Find a Store")).click();
		wd.findElement(By.xpath("//a[text()='Service Centre ']")).click();
		Set<String> allWinId = wd.getWindowHandles();
		for(String id:allWinId) {
			wd.switchTo().window(id);
			String url = wd.getCurrentUrl();
			if(url.contains("servicecenter")) {
				break;
			}	
		}
		WebElement btn = wd.findElement(By.xpath("//button[@id='submit-btn']"));
		Thread.sleep(1000);
		System.out.println(btn.isEnabled());
	}
}
