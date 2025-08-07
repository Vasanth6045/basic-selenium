package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLearnGetAttribute {
	public static void main(String[] args) {
		WebDriver wd=new EdgeDriver();
		wd.manage().window().maximize();
		wd.get("https://flipkart.com");
		String value = wd.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).getAttribute("placeholder");
		System.out.println(value);
	}
}
