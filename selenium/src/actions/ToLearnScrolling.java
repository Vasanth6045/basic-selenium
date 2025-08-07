package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnScrolling {
	public static void main(String[] args) {
		WebDriver wd=new EdgeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get("https://www.dream11.com/");
		WebElement abtus = wd.findElement(By.linkText("About Us"));
		Actions a=new Actions(wd);
		a.scrollToElement(abtus).perform();// performing scroll action till the element is visible in view port area, it works like scrollTo.
		a.scrollByAmount(0,1458).perform(); // performing scroll action using x & y coordinates, it works like scrollBy
	}
}
