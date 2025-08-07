package webelement;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToLearnWebElementScreenShot {
	public static void main(String[] args) throws IOException {
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://demowebshop.tricentis.com");
		File temp = wd.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShots/"+timestamp+"logo.png");
		FileHandler.copy(temp, dest);
	}
}
