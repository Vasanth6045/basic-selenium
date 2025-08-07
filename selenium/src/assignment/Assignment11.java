package assignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment11 {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver wd=new EdgeDriver();
		wd.manage().window().maximize();
		wd.get("https://demowebshop.tricentis.com");
		wd.findElement(By.className("ico-login")).click();
		Thread.sleep(10000);
		String loginUrl = wd.getCurrentUrl();
		if(loginUrl.contains("login")) {
			System.out.println("Login page displayed");
		} else {
			System.out.println("Login Page Not displayed");
		}
		wd.findElement(By.cssSelector("input[class='email']")).sendKeys("vasanth@gmail.com");
		wd.findElement(By.cssSelector("input[id='Password']")).sendKeys("vasanth123");
		wd.findElement(By.cssSelector("input[value='Log in']")).click();
		String errortxt = wd.findElement(By.cssSelector("div[class='validation-summary-errors']")).getText();
		if(errortxt.contains("Login was unsuccessful")) {
			System.out.println("error messege displayed");
		} else {
			System.out.println("error message not displayed");
		}
		TakesScreenshot sshot=(TakesScreenshot) wd;
		File temp = sshot.getScreenshotAs(OutputType.FILE);
		File savesshot=new File("./ScreenShot/image.png");
		FileHandler.copy(temp, savesshot);
	}
}
