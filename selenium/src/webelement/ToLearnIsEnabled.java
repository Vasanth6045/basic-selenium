package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIsEnabled {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://petdiseasealerts.org/alert-subscriptions/#/register");
		boolean status = driver.findElement(By.xpath("//button[text()='Sign Up']")).isEnabled();
		System.out.println(status);
		driver.close();
	}
}
