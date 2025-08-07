package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* 
 go to demowebshop
 click on register link
 fill all the details(identify elements using id,name)
 then click on register button
 */

public class Assignment8 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://demowebshop.tricentis.com/");
		wd.findElement(By.linkText("Register")).click();
		wd.findElement(By.id("gender-male")).click();
		wd.findElement(By.id("FirstName")).sendKeys("vasanth");
		wd.findElement(By.id("LastName")).sendKeys("A");		
		wd.findElement(By.id("Email")).sendKeys("vasanth@gmail.com");		
		wd.findElement(By.name("Password")).sendKeys("vasanth@123");				
		wd.findElement(By.name("ConfirmPassword")).sendKeys("vasanth@123");	
		Thread.sleep(2000);
		wd.findElement(By.name("register-button")).click();		
	}
}
