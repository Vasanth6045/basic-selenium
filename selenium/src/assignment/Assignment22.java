package assignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment22 {
	public static void main(String[] args) {
		WebDriver wd=new EdgeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rcb = wd.findElement(By.xpath("//span[text()='right click me']"));
		Actions a=new Actions(wd);
		a.contextClick(rcb).perform();
		wd.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-edit']")).click();
		Alert alert = wd.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}
}
