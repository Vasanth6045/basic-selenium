package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnMouseHover {
	public static void main(String[] args) {
		WebDriver wd=new EdgeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get("https://www.flipkart.com/");
		WebElement electronics = wd.findElement(By.xpath("//span[text()='Electronics']"));
		Actions a=new Actions(wd);
		a.moveToElement(electronics).perform();
	//	a.moveByOffset(650,175).perform();  // this line is nor recommended in industry.
	}
}
