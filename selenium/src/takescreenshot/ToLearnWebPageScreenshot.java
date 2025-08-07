package takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToLearnWebPageScreenshot {
	public static void main(String[] args) throws IOException {
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.flipkart.in/");
		TakesScreenshot ts=(TakesScreenshot) wd;	// narrowing
		File temp = ts.getScreenshotAs(OutputType.FILE); // screen shot will be stored in temp, it is temporary.
		File dest=new File("./ScreenShots/"+timestamp+"image.png"); //creating object for file class, and copying temporary screen shot to dest, so screen shot is stored.
		FileHandler.copy(temp, dest); // file handler has static method called copy.
	}
}
