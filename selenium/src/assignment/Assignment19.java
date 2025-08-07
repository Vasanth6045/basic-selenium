package assignment;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;


public class Assignment19 {
	public static void main(String[] args) throws IOException {
		WebDriver wd=new EdgeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get("https://petdiseasealerts.org/forecast-map/#/");
		WebElement iframe = wd.findElement(By.xpath("//iframe[contains(@id,'map-instance')]"));
		wd.switchTo().frame(iframe);
		wd.findElement(By.name("Montana")).click();
		wd.switchTo().defaultContent();
		wd.findElement(By.xpath("(//a[@class='button compact yellow'])[1]")).click();
		wd.findElement(By.xpath("//input[@id='user']")).sendKeys("vasanth@gmail.com");
		wd.findElement(By.xpath("//input[@id='pass']")).sendKeys("vasanth@123");
		wd.findElement(By.xpath("//input[@id='cpass']")).sendKeys("vasanth@123");
		wd.findElement(By.xpath("//input[@id='firstName']")).sendKeys("vasanth");
		wd.findElement(By.xpath("//input[@id='lastName']")).sendKeys("A");
		wd.findElement(By.xpath("//input[@id='phone']")).sendKeys("9987654321");
		WebElement usertype = wd.findElement(By.xpath("//select[@id='user-type']"));
		Select userselect=new Select(usertype);
		userselect.selectByValue("4");
		wd.findElement(By.xpath("//input[@id='accept-tou']")).click();
		wd.findElement(By.xpath("//button[@value='Register']")).click();
		TakesScreenshot ts=(TakesScreenshot) wd;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShots/pet.png");
		FileHandler.copy(temp, dest);
	}
}
