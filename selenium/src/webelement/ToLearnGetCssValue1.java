package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLearnGetCssValue1 {
	public static void main(String[] args) {
		WebDriver wd=new EdgeDriver();
		wd.manage().window().maximize();
		wd.get("https://demowebshop.tricentis.com/login");
		wd.findElement(By.xpath("//input[@value='Log in']")).click();
		String font = wd.findElement(By.xpath("//div[@class='validation-summary-errors']")).getCssValue("font");
		System.out.println(font);
	}
}
