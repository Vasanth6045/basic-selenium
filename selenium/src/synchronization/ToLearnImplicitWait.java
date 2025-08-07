package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLearnImplicitWait {
	public static void main(String[] args) throws InterruptedException {
		WebDriver wd=new EdgeDriver();
		wd.manage().window().maximize();
		wd.get("https://shoppersstack.com/");
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.findElement(By.xpath("//button[@id='loginBtn']")).click();
	}
}
