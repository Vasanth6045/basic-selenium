package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnDoubleClick {
	public static void main(String[] args) {
		WebDriver wd=new EdgeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement element = wd.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions A=new Actions(wd);
		A.doubleClick(element).perform();
	}
}
