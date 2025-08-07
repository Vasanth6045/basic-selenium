package assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment25 {
	public static void main(String[] args) throws IOException {
		String timeStamp = LocalDateTime.now().toString().replace(":", "-");
		FileInputStream fis=new FileInputStream("./TestData/CommonData.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String email = prop.getProperty("email");
		String pwd = prop.getProperty("password");
		WebDriver wd=new EdgeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get("https://www.facebook.com/");
		wd.findElement(By.id("email")).sendKeys(email);
		wd.findElement(By.id("pass")).sendKeys(pwd);
		wd.findElement(By.xpath("//button[@name='login']")).click();
		TakesScreenshot ts=(TakesScreenshot) wd;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShots/"+timeStamp+"fb.png");
		FileHandler.copy(temp, dest);
	}
}
