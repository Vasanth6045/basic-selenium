package naukri;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Naukri {
	public static void main(String[] args) {
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get("https://www.naukri.com/mnjuser/homepage");
		wd.findElement(By.id("usernameField")).sendKeys("vasanth436045@gmail.com");
		wd.findElement(By.id("passwordField")).sendKeys("Krypton@naukri");
		wd.findElement(By.xpath("//button[text()='Login']")).click();
		wd.findElement(By.className("nI-gNb-drawer__bars")).click();
		wd.findElement(By.className("nI-gNb-drawer__bars")).click();
		wd.findElement(By.className("nI-gNb-drawer__bars")).click();
	}

	
}

