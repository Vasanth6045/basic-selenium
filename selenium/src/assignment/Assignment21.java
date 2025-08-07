package assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Assignment21 {
	public static void main(String[] args) throws IOException {
		String timestamp = LocalDateTime.now().toString().replace(":","-");
		WebDriver wd=new EdgeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement frame = wd.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		wd.switchTo().frame(frame);
		WebElement img1 = wd.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement img2 = wd.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement trash = wd.findElement(By.id("trash"));
		Actions a=new Actions(wd);
		a.dragAndDrop(img1, trash);
		a.dragAndDrop(img2, trash);
		wd.switchTo().defaultContent();
		wd.findElement(By.xpath("(//a[text()='CheatSheets'])[1]")).click();
		wd.navigate().back();
		wd.navigate().forward();
		wd.findElement(By.xpath("//a[text()='SQL Cheat Sheet']")).click();
		Set<String> allWinId = wd.getWindowHandles();
		for(String id: allWinId) {
			wd.switchTo().window(id);
		}
		WebElement sqlImg = wd.findElement(By.xpath("(//img[@loading='lazy'])[2]"));
		JavascriptExecutor js=(JavascriptExecutor) wd;
		js.executeScript("arguments[0].scrollIntoView(true)",sqlImg);
		TakesScreenshot ts=(TakesScreenshot) wd;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShots/"+timestamp+"sql.png");
		FileHandler.copy(temp, dest);
	}
}
