package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLearnGetReaction {
	public static void main(String[] args) {
		WebDriver wd=new EdgeDriver();
		wd.manage().window().maximize();
		wd.get("https://demowebshop.tricentis.com/");
		Rectangle rect = wd.findElement(By.xpath("//input[@value='Vote']")).getRect();
		System.out.println("X LOcation is : "+rect.getX());
		System.out.println("X LOcation is : "+rect.getY());
	}
}
