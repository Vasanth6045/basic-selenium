package assignment;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment14 {
	public static void main(String[] args) throws IOException {
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		WebDriver wd=new EdgeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.abhibus.com/");
		JavascriptExecutor scroll=(JavascriptExecutor) wd;
		scroll.executeScript("window.scrollTo(0,1000)");
		TakesScreenshot sshot=(TakesScreenshot) wd;
		File temp = sshot.getScreenshotAs(OutputType.FILE);
		File dest =new File("./ScreenShots/"+timestamp+"abhibus.png");
		FileHandler.copy(temp, dest);
		wd.quit();
	}
}
