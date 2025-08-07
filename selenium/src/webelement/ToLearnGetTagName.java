package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLearnGetTagName {
	public static void main(String[] args) {
		WebDriver wd=new EdgeDriver();
		wd.manage().window().maximize();
		wd.get("https://demowebshop.tricentis.com/login");
		String tagname = wd.findElement(By.linkText("Search")).getTagName();
		System.out.println(tagname);
	}
}
