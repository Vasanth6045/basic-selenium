package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetWindowHandelsMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https:/www.shoppersstack.com/products_page/23");
		Thread.sleep(20000);
		wd.findElement(By.id("compare")).click();
		Set<String> allWindowId = wd.getWindowHandles();
		//System.out.println(allWindowId);//this line prints the values in the same line
		for(String id: allWindowId) {//["String"=datatype],["id"=variable name],["allWindowId"=variable name of the place the data to be retrived]
			System.out.println(id);
		}//for each loop will print the data line by line
		wd.quit();
	}
}
