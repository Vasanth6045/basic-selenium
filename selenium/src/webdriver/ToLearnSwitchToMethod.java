package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchToMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https:/www.shoppersstack.com/products_page/23");
		Thread.sleep(10000);
		wd.findElement(By.id("compare")).click();
		Set<String> allWindowId = wd.getWindowHandles();//capturing all window ids.
		for(String id: allWindowId) {
			wd.switchTo().window(id);//switching to each window
			Thread.sleep(1000);
			String currentUrl = wd.getCurrentUrl();//capturing current url of the current window
			System.out.println(currentUrl);//printing current url in the console
			/*if(currentUrl.equals("https://www.amazon.in/")) {
				wd.close();//performing close operation in current window
			}*/
			if(currentUrl.contains("amazon")) {//this line will close the window if the url of the current window contains the word "amazon"
				wd.close();//performing close operation in current window
			}
			if(currentUrl.equals("https://www.flipkart.com/")) {
				wd.manage().window().maximize();
			}
		}
	}
}
