package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 go to shoperstack product page
 click on compare icon
 capture the size of flipkart window
 capture position of ebay window
 then close all the windows. 
 */

public class Assignment7 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https:/www.shoppersstack.com/products_page/23");
		Thread.sleep(20000);
	    wd.findElement(By.id("compare")).click();
	    Set<String> allWindowId = wd.getWindowHandles();
	    for(String id: allWindowId) {
	    	String url = wd.getCurrentUrl();
	    	if(url.contains("flipkart")) {
	    		Dimension size = wd.manage().window().getSize();
	    		System.out.println("Size of flipkart : "+size);
	    		wd.switchTo().window(id);
	    	}
	    	else {
	    		if(url.contains("ebay")) {
	    			Point position = wd.manage().window().getPosition();
	    			System.out.println("Position of ebay : "+position);
	    			wd.switchTo().window(id);
	    		}
	    	}
	    	wd.switchTo().window(id);
	    }
	    wd.quit();
	}
}
