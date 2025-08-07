package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIsSelected {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement radioBt = driver.findElement(By.xpath("//label[text()='Good']/..//input[@type='radio']"));
		System.out.println(radioBt.isSelected());
		Thread.sleep(1000);
		radioBt.click();
		System.out.println(radioBt.isSelected());
		driver.close();
	}
}
