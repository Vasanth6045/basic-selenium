package popup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ChildWindowPopup {
	public static void main(String[] args) {
		WebDriver wd=new EdgeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get("https://shoppersstack.com/products_page/30");
		wd.findElement(By.id("compare")).click();
		Set<String> allWinId = wd.getWindowHandles();
		for(String id:allWinId) {
			wd.switchTo().window(id);
			String url = wd.getCurrentUrl();
			if(url.contains("ebay")) {
				break;
			}
		}
		wd.manage().window().maximize();
	}
}
