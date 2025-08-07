package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLearnGetSize {
	public static void main(String[] args) {
		WebDriver wd= new EdgeDriver();
		wd.manage().window().maximize();
		wd.get("https://demowebshop.tricentis.com/");
		Dimension size = wd.findElement(By.xpath("//input[@value='Subscribe']")).getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
	}
}
