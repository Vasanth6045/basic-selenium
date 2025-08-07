package searchContext;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSearchContext {
	public static void main(String[] args) {
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		
		wd.get("https:/www.shoppersstack.com/products_page/23");
		
		WebElement element = wd.findElement(By.id(""));
		List<WebElement> allElements = wd.findElements(By.id(""));
	}
}
