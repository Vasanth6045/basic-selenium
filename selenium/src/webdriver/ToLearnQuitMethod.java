package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnQuitMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver wd=new ChromeDriver();
		wd.get("https://www.shoppersstack.com/products_page/23");
		Thread.sleep(20000);
		wd.findElement(By.id("compare")).click();
		wd.quit();
	}
}
