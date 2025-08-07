package assignment;

import org.openqa.selenium.By;
/* go to facebook.com
 * enter invalid credentials
 * click on login button
 * note : use only x path to identify elements
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment10 {
	public static void main(String[] args) {
		WebDriver wd=new EdgeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.facebook.com/");
		wd.findElement(By.xpath("//input[@name='email']")).sendKeys("vasanth@gmail.com");
		wd.findElement(By.xpath("//input[@type='password']")).sendKeys("vasanth@123");
		wd.findElement(By.xpath("//button[@data-testid='royal-login-button']")).click();
		wd.quit();
		
	}
}
