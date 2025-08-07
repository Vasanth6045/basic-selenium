package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLearnGetLocation {
	public static void main(String[] args) {
		WebDriver wd=new EdgeDriver();
		wd.manage().window().maximize();
		wd.get("https://demowebshop.tricentis.com/");
		Point location = wd.findElement(By.xpath("//input[@value='Subscribe']")).getLocation();
		System.out.println("X LOcation is : "+location.getX());
		System.out.println("X LOcation is : "+location.getY());
	}
}
